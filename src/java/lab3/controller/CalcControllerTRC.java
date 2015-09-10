/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ShapeService;

/**
 *
 * @author alex
 */
@WebServlet(name = "C", urlPatterns = {"/trcCalc"})
public class CalcControllerTRC extends HttpServlet {

    private final static String RESULT_PAGE = "lab3Home.jsp";
    
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
        
        
        String shapeSelection = request.getParameter("shape");
        
        
        if(shapeSelection != null){
            ShapeService shapeService = new ShapeService();
            double area = 0;
            switch(shapeSelection){
                
                case "rectangle":
                    try{
                    String rHeight = request.getParameter("rectHeight");
                    String rWidth = request.getParameter("rectWidth");
                    area = shapeService.getRectangleArea(rHeight, rWidth);
                    request.setAttribute("rectangle", area);
                    } catch (IllegalArgumentException ex){
                        request.setAttribute("rectangle", ex.getLocalizedMessage());
                    }
                    break;
                
                case "triangle":
                    try {
                    String tHeight = request.getParameter("trianlgeHeight");
                    String tBase = request.getParameter("triangleBase");
                    area = shapeService.getTriangleArea(tHeight, tBase);
                    request.setAttribute("triangle", area);
                    } catch(IllegalArgumentException ex) {
                        request.setAttribute("triangle", ex.getLocalizedMessage());
                    }
                    break;
                    
                case "circle":
                    try{
                    String radius = request.getParameter("radius");
                    area = shapeService.getCircleArea(radius);
                    request.setAttribute("circle", area);
                    } catch(IllegalArgumentException ex){
                        request.setAttribute("circle", ex.getLocalizedMessage());
                    }
                    break;
                
                default :
                    String status = "Either something went wrong or Operator Error. "
                    + "Try again.";
            request.setAttribute(status, "status");
                    
            }
        } 
        
        RequestDispatcher view = request.getRequestDispatcher(RESULT_PAGE);
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
