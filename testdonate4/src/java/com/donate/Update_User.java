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
@WebServlet(name = "Update_User", urlPatterns = {"/Update_User"})
public class Update_User extends HttpServlet {

    HttpSession session;
    int status;
    Connection con;
    Statement st;
    ResultSet rs;
    String regfname, regmname, reglname, sex, regphone, regposition, email, regpass;
    RequestDispatcher rd = null;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                     
            
            int id=Integer.parseInt(request.getParameter("uid"));
            regfname = request.getParameter("fnamereg");
            regmname = request.getParameter("mnamereg");
            reglname = request.getParameter("lnamereg");
            
            sex = request.getParameter("sex");
            regphone = request.getParameter("phonereg");
            regposition = request.getParameter("position");
            
            email = request.getParameter("email");
            regpass = request.getParameter("passreg");
            
            
            /**if (email == "" || regpass == ""){
                rd = request.getRequestDispatcher("index.jsp?errorlogin");
                rd.forward(request,response);
            }*/
            session = request.getSession();
            con = DB.getConnection();
            st = con.createStatement();
            String sql = "UPDATE users SET "
                           + "firstname ='"+regfname+"'"
                           + ",middlename='"+regmname+ "'"
                           + ",lastname='"+reglname+"'"
                           + ",sex='"+sex+"'"
                           + ",phone='"+regphone+"'"
                            + ",position='"+regposition+"'"
                            + ",email='"+email+"'"
                           + ",password='"+regpass+"'"                          
                           + "WHERE id='"+id+"'";
            status=st.executeUpdate(sql);
            if(status>0)
                {
                    
                    out.println("User Updated Successfully!");
                    response.sendRedirect("./user_edit_form.jsp?id="+id);
                    session.setAttribute("updated","User Updated Successfully!");
                }
                else
                {
                    
                    out.println("Oops! Something went wrong...");
                    session.setAttribute("error","Oops! Something went wrong...");
                }
            
           
        }catch(SQLException ex) { 
                   while (ex!=null) { 
                       System.out.println ("SQL Exception: " + ex.getMessage ()); 
                       ex = ex.getNextException(); 
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
