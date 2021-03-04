/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
//
//  import java.io.*;
//    import java.util.HashMap;
//    import javax.servlet.http.HttpServletResponse;
// import net.sf.jasperreports.engine.JasperReport;
//    import net.sf.jasperreports.engine.design.JasperDesign;
//    import net.sf.jasperreports.engine.export.HtmlExporter;
//    import net.sf.jasperreports.engine.export.JRPdfExporter;
//    import net.sf.jasperreports.engine.xml.JRXmlLoader;
//    import net.sf.jasperreports.export.SimpleExporterInput;
//    import net.sf.jasperreports.export.SimpleHtmlExporterOutput;
//    import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
//    import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
//    import net.sf.jasperreports.engine.data.JsonDataSource;




/**
 *
 * @author boutarfa
 */
public class PrintReport {
    
     public static String getReportPath(HttpServletRequest request, String filename) throws JRException, IOException {
        String path = "/report/" + filename + ".jasper";
        String reportPath = request.getServletContext().getRealPath(path);
        return reportPath;
    }
     
    public static String getReportPathJRxml(HttpServletRequest request, String filename) throws JRException, IOException {
        String path = "/report/" + filename + ".jrxml";
        String reportPath = request.getServletContext().getRealPath(path);
        return reportPath;
    }
    
    public static byte[] printRpt(HttpServletRequest request, String connectionName, String reportName, Map parametersMap) throws JRException, IOException {
        Connection connection;
        try {
            InitialContext initialContext = new InitialContext();
            DataSource dataSource = (DataSource) initialContext.lookup(connectionName);
            connection = dataSource.getConnection();
        } catch (NamingException e) {
            connection = null;

        } catch (SQLException e) {
            connection = null;
        }
        String reportPath = getReportPath(request, reportName);
//        Map parametersMap = new HashMap();
//        parametersMap.put("p", idaccident);
        JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, parametersMap, connection);//beanCollectionDataSource);
        byte[] byteArray = JasperExportManager.exportReportToPdf(jasperPrint);
        return byteArray;



//JRPdfExporter pdfExporter = new JRPdfExporter();
//                pdfExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
//                ByteArrayOutputStream pdfReportStream = new ByteArrayOutputStream();
//                pdfExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(pdfReportStream));
//                pdfExporter.exportReport();
//                return pdfReportStream.toByteArray();
   
//                response.setContentType("application/pdf");
//                response.setHeader("Content-Length", String.valueOf(pdfReportStream.size()));
//                response.addHeader("Content-Disposition", "inline; filename=jasper.pdf;");
   
//                OutputStream responseOutputStream = response.getOutputStream();
//                responseOutputStream.write(pdfReportStream.toByteArray());
//                responseOutputStream.close();
                //pdfReportStream.close();
    }
    
}
