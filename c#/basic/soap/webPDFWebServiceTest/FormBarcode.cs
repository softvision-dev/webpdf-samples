using System;
using System.Diagnostics;
using System.IO;
using System.ServiceModel;
using System.ServiceModel.Channels;
using System.Windows.Forms;

namespace webPDFWebServiceTest
{
    public partial class FormBarcode : Form
    {
        public FormBarcode()
        {
            InitializeComponent();
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            // access to web service
            BarcodeService.Barcode oTestWebservice = new BarcodeService.BarcodeClient();

            // return object for web service call
            BarcodeService.executeResponse ret;

            // parameter object for Web service call
            BarcodeService.executeRequest request = new BarcodeService.executeRequest();

            // set Web service options
            request.operation = new BarcodeService.operation();

            // set the billing values
            request.operation.billing = new BarcodeService.BillingType();
            request.operation.billing.userName = "John Doe";
            request.operation.billing.applicationName = "webPDF Sample Application";
            request.operation.billing.customerCode = "ABC123";

            // build the parameter for the operation
            request.operation.barcode = new BarcodeService.BarcodeType();
            request.operation.barcode.add = new BarcodeService.BarcodeTypeAdd();

            // create new QRcode
            BarcodeService.QrBarcodeType[] qrCode = new BarcodeService.QrBarcodeType[1];
            qrCode[0] = new BarcodeService.QrBarcodeType();

            // set the position and the size for the barcode type
            qrCode[0].position = new BarcodeService.RectangleType();
            qrCode[0].position.x = 2.0f;
            qrCode[0].position.xSpecified = true;
            qrCode[0].position.y = 2.0f;
            qrCode[0].position.ySpecified = true;
            qrCode[0].position.width = 20.0f;
            qrCode[0].position.widthSpecified = true;
            qrCode[0].position.height = 20.0f;
            qrCode[0].position.heightSpecified = true;

            // set page and content
            qrCode[0].pages = "1-3";
            qrCode[0].value = "https://www.webpdf.de";

            request.operation.barcode.add.qrcode = qrCode;

            // create a second barcode (EAN8)
            BarcodeService.Ean8BarcodeType[] ean8Code = new BarcodeService.Ean8BarcodeType[1];
            ean8Code[0] = new BarcodeService.Ean8BarcodeType();

            // set the position and the size for the barcode type
            ean8Code[0].position = new BarcodeService.RectangleType();
            ean8Code[0].position.x = 190.0f;
            ean8Code[0].position.xSpecified = true;
            ean8Code[0].position.y = 2.0f;
            ean8Code[0].position.ySpecified = true;
            ean8Code[0].position.width = 10.0f;
            ean8Code[0].position.widthSpecified = true;
            ean8Code[0].position.height = 40.0f;
            ean8Code[0].position.heightSpecified = true;

            // set barcode content
            ean8Code[0].value = "90311017";
            ean8Code[0].pages = "*";
            ean8Code[0].rotation = 90;
            ean8Code[0].rotationSpecified = true;
            request.operation.barcode.add.ean8 = ean8Code;

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
                    BarcodeService.FaultInfo fault = messageFault.GetDetail<BarcodeService.FaultInfo>();
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
