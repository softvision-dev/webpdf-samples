using System;
using System.Diagnostics;
using System.IO;
using System.ServiceModel;
using System.ServiceModel.Channels;
using System.Windows.Forms;

namespace webPDFWebServiceTest
{
    public partial class FormUrlConverter : Form
    {
        public FormUrlConverter()
        {
            InitializeComponent();
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            // access to web service
            UrlConverterService.URLConverter oTestWebservice = new UrlConverterService.URLConverterClient();

            // return object for web service call
            UrlConverterService.executeResponse ret;

            // parameter object for Web service call
            UrlConverterService.executeRequest request = new UrlConverterService.executeRequest();

            // set Web service options
            request.operation = new UrlConverterService.operation();

            // set the billing values
            request.operation.billing = new UrlConverterService.BillingType();
            request.operation.billing.userName = "John Doe";
            request.operation.billing.applicationName = "webPDF Sample Application";
            request.operation.billing.customerCode = "ABC123";

            // set converter options
            request.operation.urlconverter = new UrlConverterService.UrlConverterType();
            request.operation.urlconverter.url = TextBoxFileName.Text;

            String targetFile = Path.GetFullPath(TextBoxTargetFile.Text);
            File.Delete(targetFile);

            try
            {
                // call the Web service
                ret = oTestWebservice.execute(request);

            }    //{ "net.webpdf.ws.soap.exception.WebserviceException"}
            catch (FaultException ex)
            {
                MessageFault messageFault = ex.CreateMessageFault();
                if (messageFault.HasDetail)
                {
                    UrlConverterService.FaultInfo fault = messageFault.GetDetail<UrlConverterService.FaultInfo>();
                    MessageBox.Show("webPDF Fault: " + fault.errorMessage + " (" + fault.errorCode + ")", "Info");
                }
                else
                {
                    // catch the exception
                    MessageBox.Show(ex.Message.ToString(), "Info");
                }
                return;
            }

            // save the returned file to disk
            FileStream fs;
            fs = new FileStream(Path.GetFullPath(TextBoxTargetFile.Text), FileMode.OpenOrCreate);
            fs.Seek(0, SeekOrigin.End);
            fs.Write(ret.@return, 0, ret.@return.Length);
            fs.Close();

            Process.Start(targetFile);
            MessageBox.Show("Output file '" + targetFile + "' created!", "Info");
        }
    }
}
