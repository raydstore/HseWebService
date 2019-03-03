/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import net.sf.jasperreports.engine.JRException;
import tool.PrintReport;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * REST Web Service
 *
 * @author boutarfa
 */
@Path("print")
public class PrintResource {

    @Context
    private UriInfo context;
    
    @Context
    private HttpServletRequest httpServletRequest;

    /**
     * Creates a new instance of PrintResource
     */
    public PrintResource() {
    }

    /**
     * Retrieves representation of an instance of entity.service.PrintResource
     * @param hh
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/pdf")
    //@Produces({"application/xml", "application/text"})
    public Response getRaport(@Context HttpServletRequest hh) throws JRException, IOException {
    //public Response getRaport(@Context HttpHeaders hh) throws JRException, IOException {
         Map<String, String[]> headerParams = hh.getParameterMap();
         Map parametersMap = new HashMap();
         // headerParams.get(hh)
         String reportname = hh.getParameter("reportname");
         String connectionName = "jdbc/newhse";
        // String connectionName = "jdbc/ordn";
     //   headerParams.remove("reportname");
     
     // xml parser
    // String res="";
     
     String filePath = PrintReport.getReportPathJRxml(hh, reportname);
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("parameter");
            
            
           //res = nodeList.toString();
            
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
               if (node.getNodeType() == Node.ELEMENT_NODE) {
                 Element element = (Element) node;
                 
                 String paramName  = element.getAttribute("name");
                 if (!(headerParams.get(paramName) == null)) {
                    String paramClass = element.getAttribute("class");
                    switch(paramClass) {
                       case "java.math.BigDecimal" : parametersMap.put(paramName, new BigDecimal(headerParams.get(paramName)[0]));
                                                      break; 
                                               
                       default : parametersMap.put(paramName, headerParams.get(paramName)[0]);     
                    }
                 }
               }
            }
        } catch (SAXException | ParserConfigurationException | IOException e1) {
            e1.printStackTrace();
        }
//        res = res + "\n-----\n" + parametersMap.toString();
//        return res;
     
     
//         for (String name : headerParams.keySet()) {
//             if (!name.equalsIgnoreCase("reportname")) 
//             parametersMap.put(name, headerParams.get(name)[0]);
//         }
//         
         
      //   res = res + "\n" + parametersMap.toString();
//         headerParams.forEach((id, name) -> {
//			res = res + "\n" +  id + " = " + name;
//		});
         //MultivaluedMap<String, String>
     //   return res;
                //headerParams.toString();
//        System.out.print(hh.toString());
//        String reportName = headerParams.getFirst("reportname");
//        headerParams.remove("reportname");
//        Map parametersMap = new HashMap();



        byte[] byteArray = PrintReport.printRpt(httpServletRequest, connectionName, reportname, parametersMap);
        Response.ResponseBuilder response = Response.ok((Object) byteArray);
        response.type("application/pdf");
        response.header("Content-Disposition",  "inline;filename=\"" + reportname + ".pdf\"");
        return response.build();
    }

    /**
     * PUT method for updating or creating an instance of PrintResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
