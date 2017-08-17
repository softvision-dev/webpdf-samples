namespace webPDFWebServiceTest
{
    partial class FormUrlConverter
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.Button1 = new System.Windows.Forms.Button();
            this.LabelTargetFile = new System.Windows.Forms.Label();
            this.LabelFileSize = new System.Windows.Forms.Label();
            this.LabelSrcFile = new System.Windows.Forms.Label();
            this.TextBoxTargetFile = new System.Windows.Forms.TextBox();
            this.TextBoxFileSize = new System.Windows.Forms.TextBox();
            this.TextBoxFileName = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // Button1
            // 
            this.Button1.Location = new System.Drawing.Point(151, 188);
            this.Button1.Margin = new System.Windows.Forms.Padding(4);
            this.Button1.Name = "Button1";
            this.Button1.Size = new System.Drawing.Size(313, 28);
            this.Button1.TabIndex = 21;
            this.Button1.Text = "Call web service";
            this.Button1.UseVisualStyleBackColor = true;
            this.Button1.Click += new System.EventHandler(this.Button1_Click);
            // 
            // LabelTargetFile
            // 
            this.LabelTargetFile.AutoSize = true;
            this.LabelTargetFile.Location = new System.Drawing.Point(65, 136);
            this.LabelTargetFile.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.LabelTargetFile.Name = "LabelTargetFile";
            this.LabelTargetFile.Size = new System.Drawing.Size(72, 17);
            this.LabelTargetFile.TabIndex = 20;
            this.LabelTargetFile.Text = "Target file";
            // 
            // LabelFileSize
            // 
            this.LabelFileSize.AutoSize = true;
            this.LabelFileSize.Location = new System.Drawing.Point(78, 87);
            this.LabelFileSize.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.LabelFileSize.Name = "LabelFileSize";
            this.LabelFileSize.Size = new System.Drawing.Size(59, 17);
            this.LabelFileSize.TabIndex = 19;
            this.LabelFileSize.Text = "File size";
            // 
            // LabelSrcFile
            // 
            this.LabelSrcFile.AutoSize = true;
            this.LabelSrcFile.Location = new System.Drawing.Point(52, 38);
            this.LabelSrcFile.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.LabelSrcFile.Name = "LabelSrcFile";
            this.LabelSrcFile.Size = new System.Drawing.Size(85, 17);
            this.LabelSrcFile.TabIndex = 18;
            this.LabelSrcFile.Text = "Source URL";
            // 
            // TextBoxTargetFile
            // 
            this.TextBoxTargetFile.Location = new System.Drawing.Point(151, 133);
            this.TextBoxTargetFile.Margin = new System.Windows.Forms.Padding(4);
            this.TextBoxTargetFile.Name = "TextBoxTargetFile";
            this.TextBoxTargetFile.Size = new System.Drawing.Size(311, 22);
            this.TextBoxTargetFile.TabIndex = 17;
            this.TextBoxTargetFile.Text = "..\\..\\..\\result\\urlconverter.pdf";
            // 
            // TextBoxFileSize
            // 
            this.TextBoxFileSize.Location = new System.Drawing.Point(151, 83);
            this.TextBoxFileSize.Margin = new System.Windows.Forms.Padding(4);
            this.TextBoxFileSize.Name = "TextBoxFileSize";
            this.TextBoxFileSize.Size = new System.Drawing.Size(311, 22);
            this.TextBoxFileSize.TabIndex = 16;
            // 
            // TextBoxFileName
            // 
            this.TextBoxFileName.Location = new System.Drawing.Point(151, 35);
            this.TextBoxFileName.Margin = new System.Windows.Forms.Padding(4);
            this.TextBoxFileName.Name = "TextBoxFileName";
            this.TextBoxFileName.Size = new System.Drawing.Size(311, 22);
            this.TextBoxFileName.TabIndex = 15;
            this.TextBoxFileName.Text = "https://www.webpdf.de";
            // 
            // FormUrlConverter
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(475, 253);
            this.Controls.Add(this.Button1);
            this.Controls.Add(this.LabelTargetFile);
            this.Controls.Add(this.LabelFileSize);
            this.Controls.Add(this.LabelSrcFile);
            this.Controls.Add(this.TextBoxTargetFile);
            this.Controls.Add(this.TextBoxFileSize);
            this.Controls.Add(this.TextBoxFileName);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
            this.Name = "FormUrlConverter";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Web service \'UrlConverter\'";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        internal System.Windows.Forms.Button Button1;
        internal System.Windows.Forms.Label LabelTargetFile;
        internal System.Windows.Forms.Label LabelFileSize;
        internal System.Windows.Forms.Label LabelSrcFile;
        internal System.Windows.Forms.TextBox TextBoxTargetFile;
        internal System.Windows.Forms.TextBox TextBoxFileSize;
        internal System.Windows.Forms.TextBox TextBoxFileName;
    }
}