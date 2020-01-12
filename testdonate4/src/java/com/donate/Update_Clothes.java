package com.donate;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(name = "Update_Clothes", urlPatterns = {"/Update_Clothes"})
public class Update_Clothes extends HttpServlet {

    HttpSession session;
    int status;
    Connection con;
    Statement st;
    ResultSet rs;
    String desc,type,qty,cond,stat,donto,rec,don;
    RequestDispatcher rd = null;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                     
            
            int id=Integer.parseInt(request.getParameter("id"));
            desc = request.getParameter("item_desc");
            type = request.getParameter("item_type");
            qty = request.getParameter("quantity");
            
            cond = request.getParameter("condition");
            stat = request.getParameter("status");
            donto = request.getParameter("donated");
            
            rec = request.getParameter("received");
            don = request.getParameter("released");
            
            session = request.getSession();
            con = DB.getConnection();
            st = con.createStatement();
            String sql = "UPDATE clothes_donate SET "
                           + "item_desc = '"+desc+"'"
                           + ",item_type = '"+type+ "'"
                           + ",quantity = '"+qty+"'"
                           + ",conditions = '"+cond+"'"
                           + ",status = '"+stat+"'"
                            + ",donatedto = '"+donto+"'"
                            + ",daterec = '"+rec+"'"
                           + ",datedon = '"+don+"'"                          
                           + "WHERE id = '"+id+"'";
            status=st.executeUpdate(sql);
            if(status>0)
                {
                    
                    out.println("Donation Entry Updated Successfully!");
                    response.sendRedirect("./clothes_edit_form.jsp?id="+id);
                    session.setAttribute("updated","Donation Entry Updated Successfully!");
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
