@echo off

del webPDFWebServiceTest.exe
del webPDFWebServiceTest.exe.config
del webPDFWebServiceTest.pdb
del webPDFWebServiceTest.suo /A H
del *.pdf

del webPDFWebServiceTest\webPDFWebServiceTest.csproj.user
rd webPDFWebServiceTest\bin /S /Q
rd webPDFWebServiceTest\obj /S /Q
