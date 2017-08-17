using System;
using System.Diagnostics;
using System.IO;
using System.ServiceModel;
using System.ServiceModel.Channels;
using System.Windows.Forms;

namespace webPDFWebServiceTest
{
    public partial class FormSignature : Form
    {
        public FormSignature()
        {
            InitializeComponent();
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            // access to web service
            SignatureService.Signature oTestWebservice = new SignatureService.SignatureClient();

            // return object for web service call
            SignatureService.executeResponse ret;

            // parameter object for Web service call
            SignatureService.executeRequest request = new SignatureService.executeRequest();

            // set Web service options
            request.operation = new SignatureService.operation();
            request.operation.signature = new SignatureService.SignatureType();

            // add new signature
            request.operation.signature.add = new SignatureService.SignatureTypeAdd();
            request.operation.signature.add.certificationLevel = SignatureService.CertificationLevelType.noChanges;
            request.operation.signature.add.certificationLevelSpecified = true;
            request.operation.signature.add.contact = "John Doe";
            request.operation.signature.add.keyName = "Generic self-signed certificate";

            // set visual apperance for signature
            request.operation.signature.add.appearance = new SignatureService.SignatureTypeAddAppearance();
            request.operation.signature.add.appearance.page = 1;
            request.operation.signature.add.appearance.pageSpecified = true;
            request.operation.signature.add.appearance.name = "John Doe, Company";

            request.operation.signature.add.appearance.identifierElements = new SignatureService.SignatureIdentifierType();
            request.operation.signature.add.appearance.identifierElements.showCommonName = true;
            request.operation.signature.add.appearance.identifierElements.showCommonNameSpecified = true;
            request.operation.signature.add.appearance.identifierElements.showOrganisationName = false;
            request.operation.signature.add.appearance.identifierElements.showOrganisationNameSpecified = true;
            request.operation.signature.add.appearance.identifierElements.showSignedBy = true;
            request.operation.signature.add.appearance.identifierElements.showSignedBySpecified = true;
            request.operation.signature.add.appearance.identifierElements.showCountry = false;
            request.operation.signature.add.appearance.identifierElements.showCountrySpecified = true;
            request.operation.signature.add.appearance.identifierElements.showMail = false;
            request.operation.signature.add.appearance.identifierElements.showMailSpecified = true;
            request.operation.signature.add.appearance.identifierElements.showOrganisationUnit = false;
            request.operation.signature.add.appearance.identifierElements.showOrganisationUnitSpecified = true;

            // set size and position of signature
            request.operation.signature.add.appearance.position = new SignatureService.SignaturePositionType();
            request.operation.signature.add.appearance.position.x = 5.0f;
            request.operation.signature.add.appearance.position.xSpecified = true;
            request.operation.signature.add.appearance.position.y = 5.0f;
            request.operation.signature.add.appearance.position.ySpecified = true;
            request.operation.signature.add.appearance.position.width = 80.0f;
            request.operation.signature.add.appearance.position.widthSpecified = true;
            request.operation.signature.add.appearance.position.height = 15.0f;
            request.operation.signature.add.appearance.position.heightSpecified = true;

            // add background image to signature
            request.operation.signature.add.appearance.image = new SignatureService.SignatureImageType();
            request.operation.signature.add.appearance.image.position = SignatureService.SignatureImagePositionType.left;
            request.operation.signature.add.appearance.image.positionSpecified = true;
            request.operation.signature.add.appearance.image.data = File.ReadAllBytes("..\\..\\..\\files\\logo.png");

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
                    SignatureService.FaultInfo fault = messageFault.GetDetail<SignatureService.FaultInfo>();
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
            fs = new FileStream(TextBoxTargetFile.Text, FileMode.OpenOrCreate);
            fs.Seek(0, SeekOrigin.End);
            fs.Write(ret.@return, 0, ret.@return.Length);
            fs.Close();

            Process.Start(targetFile);
            MessageBox.Show("Output file '" + targetFile + "' created!", "Info");
        }
    }
}
