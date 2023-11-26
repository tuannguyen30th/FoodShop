/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.registerAccount;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author Tuan
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {

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
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
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
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       String cpass = request.getParameter("repassword");
       String name = request.getParameter("name");
       String phone = request.getParameter("phone");
       String email = request.getParameter("email");
       String address = request.getParameter("address");
       
      Account a = new Account();
      registerAccount r = new registerAccount();
      a=r.checkUser(username);
      if(a!=null){
          request.setAttribute("error2", "Username existed, please enter another username");
           request.getRequestDispatcher("register.jsp").forward(request, response);
      }
      else{
       if(!cpass.equals(password)){
           request.setAttribute("error", "Confirmation password is wrong!");
           request.getRequestDispatcher("register.jsp").forward(request, response);
       } else {
           if(username.isEmpty() || password.isEmpty() || cpass.isEmpty() || name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty()  ){
               request.setAttribute("error1", "Do not leave any information blank!");
               request.getRequestDispatcher("register.jsp").forward(request, response);
           }
           else if(password.length()<6 || password.length() > 20){
                request.setAttribute("error3", "The length of password must be greater than 6 characters and less than 20 chacracters!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
           }
           else{
               
               try {
                  r.registerAccount(username, password,email, phone, name, address );
                   request.getRequestDispatcher("login.jsp").forward(request, response);
               } catch (Exception ex) {
                   Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       }
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
