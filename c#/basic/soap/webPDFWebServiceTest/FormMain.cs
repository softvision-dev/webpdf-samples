using System;
using System.Windows.Forms;

namespace webPDFWebServiceTest
{
    public partial class FormMain : Form
    {
        public FormMain()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            FormConverter frmConverter = new FormConverter();
            frmConverter.ShowDialog();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            FormPdfa frmPdfa = new FormPdfa();
            frmPdfa.ShowDialog();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            FormSignature frmSignature = new FormSignature();
            frmSignature.ShowDialog();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            FormToolbox frmToolbox = new FormToolbox();
            frmToolbox.ShowDialog();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            FormOcr frmOcr = new FormOcr();
            frmOcr.ShowDialog();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            FormBarcode frmBarcode = new FormBarcode();
            frmBarcode.ShowDialog();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            FormUrlConverter frmUrlConverter = new FormUrlConverter();
            frmUrlConverter.ShowDialog();
        }
    }
}
