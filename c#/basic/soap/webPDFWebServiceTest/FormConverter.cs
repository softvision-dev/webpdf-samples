using System;
using System.Diagnostics;
using System.IO;
using System.ServiceModel;
using System.ServiceModel.Channels;
using System.Windows.Forms;

namespace webPDFWebServiceTest
{
    public partial class FormConverter : Form
    {
        public FormConverter()
        {
            InitializeComponent();
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            // access to web service
            ConverterService.Converter oTestWebservice = new ConverterService.ConverterClient();

            // return object for web service call
            ConverterService.executeResponse ret;

            // parameter object for Web service call
            ConverterService.executeRequest request = new ConverterService.executeRequest();

            // set Web service options
            request.operation = new ConverterService.operation();

            // set the billing values
            request.operation.billing = new ConverterService.BillingType();
            request.operation.billing.userName = "John Doe";
            request.operation.billing.applicationName = "webPDF Sample Application";
            request.operation.billing.customerCode = "ABC123";

            // set converter options
            request.operation.converter = new ConverterService.ConverterType();
            request.operation.converter.embedFonts = true;
            request.operation.converter.embedFontsSpecified = true;
            request.operation.converter.pages = "*";

            request.operation.converter.pdfa = new ConverterService.PdfaType();
            request.operation.converter.pdfa.convert = new ConverterService.PdfaTypeConvert();
            request.operation.converter.pdfa.convert.level = ConverterService.PdfaLevelType.Item3b;
            request.operation.converter.pdfa.convert.levelSpecified = true;
            request.operation.converter.pdfa.convert.errorReport = ConverterService.PdfaErrorReportType.message;
            request.operation.converter.pdfa.convert.errorReportSpecified = true;

            // Read source file
            FileInfo fInfo = new FileInfo(TextBoxFileName.Text);
            long numBytes = fInfo.Length;
            FileStream fStream = new FileStream(TextBoxFileName.Text, FileMode.Open, FileAccess.Read);
            BinaryReader br = new BinaryReader(fStream);
            byte[] data = br.ReadBytes((int)numBytes);

            // assign file content to web service object
            request.fileContent = data;

            // show the number of bytes in the array
            TextBoxFileSize.Text = Convert.ToString(data.Length);

            br.Close();
            fStream.Close();

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
                    ConverterService.FaultInfo fault = messageFault.GetDetail<ConverterService.FaultInfo>();
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
