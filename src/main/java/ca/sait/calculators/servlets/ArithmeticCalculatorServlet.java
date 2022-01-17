package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author ReiEm
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    
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
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String button = request.getParameter("btn");
        
        try {
            if (first == "" || second == "") {
                throw new NullPointerException();
            }
            int firstNum = Integer.parseInt(first);
            int secondNum = Integer.parseInt(second);
            String result = "";

            switch(button) {
                case "+": result = String.format("%d", firstNum + secondNum);
                    break;
                case "-": result = String.format("%d", firstNum - secondNum);
                    break;
                case "*": result = String.format("%d", firstNum * secondNum);
                    break;
                case "%": result = String.format("%d", firstNum % secondNum);
                    break;
            }
            request.setAttribute("result", result);

        } catch (NullPointerException ex) {
            request.setAttribute("result", "One or more fields are empty.");
        } catch (Exception ex) {
            request.setAttribute("result", "Invalid input.");
        }
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
