/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Rectangle;
import model.Triangle;

/**
 *
 * @author alex
 */
@WebServlet(name = "CalcController", urlPatterns = {"/cc"})
public class CalcController extends HttpServlet {
    
    private final static String LAB_1_RESULT_PAGE = "rectangleArea.jsp";
    private final static String LAB_2_RESULT_PAGE = "lab2Home.jsp";
    private String resultPage = "index.jsp";
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

        String submissionButton = request.getParameter("submissionButton");
        
        if (submissionButton != null) {
            String str_height = request.getParameter("height");
            String str_base = request.getParameter("base");

            String height = str_height;
            String base = str_base;
            
            Rectangle rectangle = new Rectangle(base, height);
            request.setAttribute("rectangle", rectangle);
            
            /* labResult is the query string from each form to identify which
               form and which lab it came from. It also decides where to send
               the results.
            */
            String labResult = request.getParameter("lab");
            resultPage = (labResult.equals("1")) ? LAB_1_RESULT_PAGE : LAB_2_RESULT_PAGE;
        }
        
        RequestDispatcher view = request.getRequestDispatcher(resultPage);
        view.forward(request, response);
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
        processRequest(request, response);
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
