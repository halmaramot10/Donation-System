package com.donate;

import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "Add_Clothes", urlPatterns = {"/Add_Clothes"})
public class Add_Clothes extends HttpServlet {
    
    HttpSession session;
    int status=0;
    Connection con;
    Statement st;
    ResultSet rs;
    String itemdesc = null, itemtype = null,qty = null, cond = null, stat = null, donate = null, daterec = null, datedon = null;
    RequestDispatcher rd = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            session = request.getSession();
            
            itemdesc = request.getParameter("item_desc");
            itemtype = request.getParameter("item_type");
            qty = request.getParameter("quantity");
            cond = request.getParameter("condition");
            stat = request.getParameter("status");
            donate = request.getParameter("donated");
            //daterec = request.getParameter("received");
            datedon = request.getParameter("released");
            
            SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
            daterec = sdf.format(new java.util.Date());
            con = DB.getConnection();
            st = con.createStatement();
            String sql = "insert into clothes_donate(item_desc,item_type,quantity,conditions,status,donatedto,daterec,datedon) values "
                    + "('"+itemdesc+"','"+itemtype+"','"+qty+"','"+cond+"','"+stat+"','"+donate+"','"+daterec+"','"+datedon+"')";
           
            status=st.executeUpdate(sql);
            if(status>0)
                {
                    
                    out.println("Donation Entry Added Successfully!");
                    response.sendRedirect("clothes_add.jsp");
                    session.setAttribute("success","Donation Entry Added Successfully!");
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
