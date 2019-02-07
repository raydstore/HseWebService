/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 * REST Web Service
 *
 * @author boutarfa
 */
@Path("printCommande")
public class GenericResource {

    @Context
    private UriInfo context;
    
    @Context
    private HttpServletRequest httpServletRequest;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }
    
    
    public String getReportPath(HttpServletRequest request, String filename) throws JRException, IOException {
        String path = "/report/" + filename;
        String reportPath = request.getServletContext().getRealPath(path);
        return reportPath;
    }
    
    
    public byte[] printCptRendu(HttpServletRequest request, BigDecimal idaccident) throws JRException, IOException {
        Connection connection;
        try {
            InitialContext initialContext = new InitialContext();
            DataSource dataSource = (DataSource) initialContext.lookup("jdbc/newhse");
            connection = dataSource.getConnection();
        } catch (NamingException e) {
            connection = null;

        } catch (SQLException e) {
            connection = null;
        }
        String reportPath = getReportPath(request, "rptCompteRenduCirculation.jasper");
        Map parametersMap = new HashMap();
        parametersMap.put("p", idaccident);
        JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, parametersMap, connection);//beanCollectionDataSource);
        byte[] byteArray = JasperExportManager.exportReportToPdf(jasperPrint);
        return byteArray;
    }

    public byte[] printCommande(HttpServletRequest request, BigDecimal idcmd) throws JRException, IOException {
        Connection connection;
        try {
            InitialContext initialContext = new InitialContext();
            DataSource dataSource = (DataSource) initialContext.lookup("jdbc/ordn");
            connection = dataSource.getConnection();
        } catch (NamingException e) {
            connection = null;

        } catch (SQLException e) {
            connection = null;
        }
        String reportPath = getReportPath(request, "rpCommande.jasper");
        Map parametersMap = new HashMap();
        parametersMap.put("p", idcmd);
        JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, parametersMap, connection);//beanCollectionDataSource);
        byte[] byteArray = JasperExportManager.exportReportToPdf(jasperPrint);
        return byteArray;
    }

    /**
     * Retrieves representation of an instance of entity.service.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/pdf")
    public Response printCmd(@QueryParam("idaccident") BigDecimal idaccident)  throws JRException, IOException {
       // byte[] byteArray = printCommande(httpServletRequest, new BigDecimal(1));
        byte[] byteArray = printCptRendu(httpServletRequest, idaccident);
        ResponseBuilder response = Response.ok((Object) byteArray);
        response.type("application/pdf");
        response.header("Content-Disposition",  "inline;filename=\"rpCommande.pdf\"");
        return response.build();
    }
    
//    @GET
//    @Produces("application/pdf")
//    public Response getpdf() throws JRException, IOException {
//        //byte[] byteArray = printCommande(httpServletRequest);
//        String reportPath = getReportPath(httpServletRequest, "jrsplt.pdf");
//        File file = new File(reportPath);
//        ResponseBuilder response = Response.ok((Object) file);
//       // response.type("application/pdf");
//        
//        //response.header("Content-Disposition",  "filename='jrsplt.pdf'");
//        response.header("Content-Disposition",  "filename=\"jrsplt.pdf\"");
//        response.header("Content-Type",  "application/pdf");
//        //response.header(reportPath, file);
//        return response.build();
//    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
