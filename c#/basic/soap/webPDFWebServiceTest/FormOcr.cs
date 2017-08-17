using System;
using System.Diagnostics;
using System.IO;
using System.ServiceModel;
using System.ServiceModel.Channels;
using System.Windows.Forms;

namespace webPDFWebServiceTest
{
    public partial class FormOcr : Form
    {
        public FormOcr()
        {
            InitializeComponent();
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            // access to web service
            OcrService.OCR oTestWebservice = new OcrService.OCRClient();

            // return object for web service call
            OcrService.executeResponse ret;

            // parameter object for Web service call
            OcrService.executeRequest request = new OcrService.executeRequest();

            // set Web service options
            request.operation = new OcrService.operation();

            // set the billing values
            request.operation.billing = new OcrService.BillingType();
            request.operation.billing.userName = "John Doe";
            request.operation.billing.applicationName = "webPDF Sample Application";
            request.operation.billing.customerCode = "ABC123";

            // set OCR options
            request.operation.ocr = new OcrService.OcrType();
            request.operation.ocr.language = OcrService.OcrLanguageType.eng;
            request.operation.ocr.languageSpecified = true;
            request.operation.ocr.outputFormat = OcrService.OcrOutputType.pdf;
            request.operation.ocr.outputFormatSpecified = true;
            request.operation.ocr.imageDpi = 200;
            request.operation.ocr.imageDpiSpecified = true;

            // set page size to A5
            request.operation.ocr.page = new OcrService.OcrPageType();
            request.operation.ocr.page.height = 210;
            request.operation.ocr.page.heightSpecified = true;
            request.operation.ocr.page.width = 148;
            request.operation.ocr.page.widthSpecified = true;
            request.operation.ocr.page.metrics = OcrService.MetricsType.mm;
            request.operation.ocr.page.metricsSpecified = true;

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
                    OcrService.FaultInfo fault = messageFault.GetDetail<OcrService.FaultInfo>();
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
