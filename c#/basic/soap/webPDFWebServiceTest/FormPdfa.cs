using System;
using System.Diagnostics;
using System.IO;
using System.ServiceModel;
using System.ServiceModel.Channels;
using System.Windows.Forms;

namespace webPDFWebServiceTest
{
    public partial class FormPdfa : Form
    {
        public FormPdfa()
        {
            InitializeComponent();
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            // access to web service
            PdfaService.Pdfa oTestWebservice = new PdfaService.PdfaClient();

            // return object for web service call
            PdfaService.executeResponse ret;

            // parameter object for Web service call
            PdfaService.executeRequest request = new PdfaService.executeRequest();

            // set Web service options
            request.operation = new PdfaService.operation();

            // set the billing values
            request.operation.billing = new PdfaService.BillingType();
            request.operation.billing.userName = "John Doe";
            request.operation.billing.applicationName = "webPDF Sample Application";
            request.operation.billing.customerCode = "ABC123";

            // set the PDF/A operation
            request.operation.pdfa = new PdfaService.PdfaType();
            request.operation.pdfa.convert = new PdfaService.PdfaTypeConvert();

            // set the PDF/A level
            request.operation.pdfa.convert.level = PdfaService.PdfaLevelType.Item3b;
            request.operation.pdfa.convert.levelSpecified = true;

            // set some other PDF/A options
            request.operation.pdfa.convert.imageQuality = 90;
            request.operation.pdfa.convert.imageQualitySpecified = true;
            request.operation.pdfa.convert.errorReport = PdfaService.PdfaErrorReportType.message;
            request.operation.pdfa.convert.errorReportSpecified = true;

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
                    PdfaService.FaultInfo fault = messageFault.GetDetail<PdfaService.FaultInfo>();
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
