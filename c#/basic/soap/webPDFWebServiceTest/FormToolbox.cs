using System;
using System.Diagnostics;
using System.IO;
using System.ServiceModel;
using System.ServiceModel.Channels;
using System.Windows.Forms;

namespace webPDFWebServiceTest
{
    public partial class FormToolbox : Form
    {
        public FormToolbox()
        {
            InitializeComponent();
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            // access to web service
            ToolboxService.Toolbox oTestWebservice = new ToolboxService.ToolboxClient();

            // return object for web service call
            ToolboxService.executeResponse ret;

            // parameter object for Web service call
            ToolboxService.executeRequest request = new ToolboxService.executeRequest();

            // set Web service options
            request.operation = new ToolboxService.operation();

            // set the billing values
            request.operation.billing = new ToolboxService.BillingType();
            request.operation.billing.userName = "John Doe";
            request.operation.billing.applicationName = "webPDF Sample Application";
            request.operation.billing.customerCode = "ABC123";

            // build list of toolbox operations
            ToolboxService.BaseToolboxType[] operations = new ToolboxService.BaseToolboxType[3];

            // merge operation
            ToolboxService.MergeType mergeType = new ToolboxService.MergeType();
            mergeType.page = 1;
            mergeType.pageSpecified = true;
            mergeType.mode = ToolboxService.MergeModeType.afterPage;
            mergeType.modeSpecified = true;

            // set merge file data
            mergeType.data = new ToolboxService.MergeFileDataType();
            mergeType.data.format = ToolboxService.FileDataFormatType.pdf;
            mergeType.data.formatSpecified = true;
            mergeType.data.Value = File.ReadAllBytes("..\\..\\..\\files\\merge.pdf");

            // store merge operation
            operations[0] = mergeType;

            // add rotate operation to the toolbox operation list
            ToolboxService.RotateType rotateType = new ToolboxService.RotateType();
            rotateType.pages = "1-5";
            rotateType.degrees = 90;
            rotateType.degreesSpecified = true;

            operations[1] = rotateType;

            // add delete operation to the toolbox operation list
            ToolboxService.DeleteType deleteType = new ToolboxService.DeleteType();
            deleteType.pages = "5-8";

            operations[2] = deleteType;

            // set all operations
            request.operation.Items = operations;

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
                    ToolboxService.FaultInfo fault = messageFault.GetDetail<ToolboxService.FaultInfo>();
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
