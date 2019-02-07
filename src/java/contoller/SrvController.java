/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author boutarfa
 */
@WebServlet(name = "SrvController", loadOnStartup = 1, urlPatterns = {"/printCommande"})
public class SrvController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SrvController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SrvController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    
    public void printCommande(BigDecimal idcmd, HttpServletRequest request, HttpServletResponse response) throws JRException, IOException {
        /*     Query query = em.createQuery("SELECT c FROM Commande c WHERE c.id = " + id);
         List<Commande> listOfCommande = (List<Commande>) query.getResultList();
         JRBeanCollectionDataSource  beanCollectionDataSource = new JRBeanCollectionDataSource(listOfCommande);*/
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
        System.out.print("reportPath is ");
        String reportPath = request.getServletContext().getRealPath("/report/rpCommande.jasper");
        System.out.print("reportPath = " + reportPath);
        //String reportPath = request.getServletContext().getRealPath("\\report\\rpCommande.jasper");
        

        Map parametersMap = new HashMap();
        parametersMap.put("p", idcmd);
        //parametersMap.put("SUBREPORT_DIR", request.getServletContext().getRealPath("/report/rpLigneCommande.jasper"));
        JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, parametersMap, connection);//beanCollectionDataSource);
        
        byte[] byteArray = JasperExportManager.exportReportToPdf(jasperPrint);
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(byteArray);

        outputStream.flush();
        outputStream.close();
        //return reportPath;

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
        HttpSession session = request.getSession();
System.out.print("userPath is ");
        String userPath = request.getServletPath();
        System.out.print("userPath = " + userPath);
        if (userPath.equals("/printCommande")) {
            String idcmd = request.getParameter("idcmd");
            try {
                //String realpath = 
                        printCommande(new BigDecimal(idcmd), request, response);
               // session.setAttribute("realpath", realpath);
            } catch (JRException ex) {
                Logger.getLogger(SrvController.class.getName()).log(Level.SEVERE, null, ex);
            }
            //userPath = "/newtest";
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
