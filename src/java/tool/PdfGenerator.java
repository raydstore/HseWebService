/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * @author boutarfa
 */
public class PdfGenerator {

public byte[]  generateJasperReportPDF(HttpServletRequest httpServletRequest, String jasperReportName, ByteArrayOutputStream outputStream, Map parametros) {
    JRPdfExporter exporter = new JRPdfExporter();
    try {
        String reportLocation = httpServletRequest.getRealPath("/") +"resources\\jasper\\" + jasperReportName + ".jrxml";

        InputStream jrxmlInput = new FileInputStream(new File(reportLocation)); 
        //this.getClass().getClassLoader().getResource("data.jrxml").openStream();
        JasperDesign design = JRXmlLoader.load(jrxmlInput);
        JasperReport jasperReport = JasperCompileManager.compileReport(design);
        //System.out.println("Report compiled");

        //JasperReport jasperReport = JasperCompileManager.compileReport(reportLocation);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, ConnectionUtils.getConnection()); // datasource Service

        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);   
        exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, outputStream);
        exporter.exportReport();
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Error in generate Report..."+e);
    } finally {
    }
    return outputStream.toByteArray();
}
}
