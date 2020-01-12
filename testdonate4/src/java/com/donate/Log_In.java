/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.donate;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 *
 * @author Hazel Anne
 */
@WebServlet(name = "Log_In", urlPatterns = {"/Log_In"})
public class Log_In extends HttpServlet {
    
    HttpSession session;
    int status=0;
    Connection con;
    Statement st;
    ResultSet rs;
    String email= null, logpass = null;
    RequestDispatcher rd = null;
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            session=request.getSession();
            
            email = request.getParameter("email");
            logpass = request.getParameter("passlog");
            
            if(email=="" || logpass==""){
                String error="Please enter valid credentials!";
                session.setAttribute("error",error);
                rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request,response);
            }
            else{
                con=DB.getConnection();
                st = con.createStatement();
                String sql="select * from users where email='"+email+"' and password='"+logpass+"'";
                rs = st.executeQuery(sql);
                if(rs.next()){
                    session.setAttribute("email",email);   
                    response.sendRedirect("home.jsp");
                }
                else
                {
                    session.setAttribute("error", "Invalid Email and Password...");
                    response.sendRedirect("index.jsp");
                }
            }
            
        }catch(SQLException ex) { 
                   while (ex!=null) { 
                       System.out.println ("SQL Exception: " + ex.getMessage ()); 
                       ex = ex.getNextException(); 
                        ex.printStackTrace(); 
                   } 
               } catch(java.lang.Exception ex) { 
                    System.out.println ("SQL Exception: " + ex.getMessage ()); 
                   ex.printStackTrace(); 
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
