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
@WebServlet(name = "Add_Item", urlPatterns = {"/Add_Item"})
public class Add_Item extends HttpServlet {

    HttpSession session;
    int status=0;
    Connection con;
    Statement st;
    ResultSet rs;
    String category = null, itemcategory = null;
    RequestDispatcher rd = null;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            session = request.getSession();
                       
            category = request.getParameter("category");
            itemcategory = request.getParameter("itemcategory");
            
            
            
            /**if (email == "" || regpass == ""){
                rd = request.getRequestDispatcher("index.jsp?errorlogin");
                rd.forward(request,response);
            }*/
            
            con = DB.getConnection();
            st = con.createStatement();
            String sql = "insert into item_category(category,item_name) values('"+category+"','"+itemcategory+"')";
            status=st.executeUpdate(sql);
            if(status>0){
                    
                    out.println("Item Category Successfully!");
                    response.sendRedirect("item_cat_add.jsp");
                    session.setAttribute("success","Item Category Added Successfully!");
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
