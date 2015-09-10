/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CalculatorService;

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
        CalculatorService service;

        if (shapeSelection != null) {
            List<String> str_digits = new ArrayList<>();
            switch (shapeSelection) {

                case "rectangle":
                    try {
                        int rectangleFlag = 1;
                        str_digits.add(request.getParameter("rectHeight"));
                        str_digits.add(request.getParameter("rectWidth"));
                        service = new CalculatorService(str_digits);
                        request.setAttribute("rectangle",
                                service.getShapeArea(rectangleFlag));
                    } catch (IllegalArgumentException ex) {
                        request.setAttribute("rectangle", ex.getLocalizedMessage());
                    }
                    break;

                case "triangle":
                    try {
                        int triangleFlag = 2;
                        str_digits.add(request.getParameter("trianlgeHeight"));
                        str_digits.add(request.getParameter("triangleBase"));
                        service = new CalculatorService(str_digits);
                        request.setAttribute("triangle",
                                service.getShapeArea(triangleFlag));
                    } catch (IllegalArgumentException ex) {
                        request.setAttribute("triangle", ex.getLocalizedMessage());
                    }
                    break;

                case "circle":
                    try {
                        int circleFlag = 3;
                        str_digits.add(request.getParameter("radius"));
                        service = new CalculatorService(str_digits);
                        request.setAttribute("circle",
                        service.getShapeArea(circleFlag));
                    } catch (IllegalArgumentException ex) {
                        request.setAttribute("circle", ex.getLocalizedMessage());
                    }
                    break;

                default:
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
