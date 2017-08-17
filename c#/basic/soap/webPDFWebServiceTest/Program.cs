using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;

namespace webPDFWebServiceTest
{
    static class Program
    {
        /// <summary>
        /// Application main entry point
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new FormMain());
        }
    }
}
