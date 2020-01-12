package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.donate.DB;

public final class item_005fcat_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("    <title>Home</title>\n");
      out.write("    <!-- Favicon icon -->\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"images/favicon.png\">\n");
      out.write("    <!-- Pignose Calender -->\n");
      out.write("    <link href=\"./plugins/pg-calendar/css/pignose.calendar.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Chartist -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"./plugins/chartist/css/chartist.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css\">\n");
      out.write("    <!-- Custom Stylesheet -->\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    ");

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
    
      out.write("\n");
      out.write("\n");
      out.write("    <!--*******************\n");
      out.write("        Preloader start\n");
      out.write("    ********************-->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("        <div class=\"loader\">\n");
      out.write("            <svg class=\"circular\" viewBox=\"25 25 50 50\">\n");
      out.write("                <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"3\" stroke-miterlimit=\"10\" />\n");
      out.write("            </svg>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--*******************\n");
      out.write("        Preloader end\n");
      out.write("    ********************-->\n");
      out.write("    \n");
      out.write("    <!--**********************************\n");
      out.write("        Main wrapper start\n");
      out.write("    ***********************************-->\n");
      out.write("    <div id=\"main-wrapper\">\n");
      out.write("        \n");
      out.write("        <div class=\"nav-header\">\n");
      out.write("            <div class=\"brand-logo\">\n");
      out.write("                <a href=\"home.jsp\">\n");
      out.write("                    <b class=\"logo-abbr\"><img src=\"images/logo.png\" alt=\"\"> </b>\n");
      out.write("                    <span class=\"logo-compact\"><img src=\"./images/logo-compact.png\" alt=\"\"></span>\n");
      out.write("                    <span class=\"brand-title\">\n");
      out.write("                        <img src=\"images/logo-text.png\" alt=\"\">\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");

            String email=(String)session.getAttribute("email");
        if(email!=null){
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"header\">    \n");
      out.write("            <div class=\"header-content clearfix\">\n");
      out.write("                \n");
      out.write("                <div class=\"nav-control\">\n");
      out.write("                    <div class=\"hamburger\">\n");
      out.write("                        <span class=\"toggle-icon\"><i class=\"icon-menu\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("    \n");
      out.write("                <div class=\"header-right\">\n");
      out.write("                    <ul class=\"clearfix\">\n");
      out.write("                        <li class=\"icons dropdown\">\n");
      out.write("                            <div    data-toggle=\"dropdown\">\n");
      out.write("                                <span class=\"activity active\"></span>\n");
      out.write("                                <!--<img src=\"images/user/1.png\" height=\"40\" width=\"40\" alt=\"\">--> \n");
      out.write("                                ");
      out.print(email);
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"drop-down dropdown-profile animated fadeIn dropdown-menu\">\n");
      out.write("                                <div class=\"dropdown-content-body\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"user_add.jsp\"><i class=\"icon-user\"></i> <span>Add User</span></a>\n");
      out.write("                                        </li>                                        \n");
      out.write("\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"user_view.jsp\"><i class=\"icon-lock\"></i> <span>View Users</span></a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <hr class=\"my-2\">\n");
      out.write("                                        <li><a href=\"logout.jsp\"><i class=\"icon-key\"></i> <span>Logout</span></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <!--USER NAME AND DROPDOWN-->      \n");
      out.write("                    </ul><!--clearfix-->\n");
      out.write("                </div><!--header right-->\n");
      out.write("            </div><!--header-content clearfix-->\n");
      out.write("        </div><!--header-->\n");
      out.write("        <!--**********************************\n");
      out.write("        Header end ti-comment-alt\n");
      out.write("        ***********************************-->\n");
      out.write("        <!--**********************************\n");
      out.write("            Sidebar start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div class=\"nk-sidebar\">           \n");
      out.write("            <div class=\"nk-nav-scroll\">\n");
      out.write("                <ul class=\"metismenu\" id=\"menu\">\n");
      out.write("                    <li class=\"nav-label\">Dashboard</li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fa fa-speedometer\"></i><span class=\"nav-text\">Dashboard</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./home.jsp\">Home</a></li>                           \n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-label\">Donations</li>\n");
      out.write("                    <li class=\"mega-menu mega-menu-sm\">\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-globe-alt menu-icon\"></i><span class=\"nav-text\">Clothing Donation</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./clothes_add.jsp\">Add Record</a></li>\n");
      out.write("                            <li><a href=\"./clothes_view.jsp\">View Records</a></li>\n");
      out.write("                            <li><a href=\"./clothes_edit.jsp\">Edit Records</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-envelope menu-icon\"></i> <span class=\"nav-text\">Food Donations</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./food_add.jsp\">Add Record</a></li>\n");
      out.write("                            <li><a href=\"./food_view.jsp\">View Record</a></li>\n");
      out.write("                            <li><a href=\"./food_edit.jsp\">Edit Record</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-graph menu-icon\"></i> <span class=\"nav-text\">Money Donations</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./money_add.jsp\">Add Record</a></li>\n");
      out.write("                            <li><a href=\"./money_view.jsp\">View Record</a></li>\n");
      out.write("                            <li><a href=\"./money_edit.jsp\">Edit Record</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-screen-tablet menu-icon\"></i><span class=\"nav-text\">School Supply Donations</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./school_add.jsp\">Add Record</a></li>\n");
      out.write("                            <li><a href=\"./school_view.jsp\">View Record</a></li>\n");
      out.write("                            <li><a href=\"./school_edit.jsp\">Edit Record</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>                    \n");
      out.write("                    <li class=\"nav-label\">Donation Categories</li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-grid menu-icon\"></i><span class=\"nav-text\">Item Category</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./item_cat_add.jsp\">Add Item Category</a></li>\n");
      out.write("                            <li><a href=\"./item_cat_view.jsp\">View Item Category</a></li>\n");
      out.write("                            <li><a href=\"./item_cat_edit.jsp\">Edit Item Category</a></li>                           \n");
      out.write("                        </ul>\n");
      out.write("                    </li>                    \n");
      out.write("                    \n");
      out.write("                    <li class=\"nav-label\">Accounts</li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-notebook menu-icon\"></i><span class=\"nav-text\">Pages</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./user_view.jsp\">View Users</a></li>\n");
      out.write("                            <li><a href=\"./user_add.jsp\">Add Users</a></li>\n");
      out.write("                            <li><a href=\"./user_edit_table.jsp\">Edit Users</a></li>\n");
      out.write("                            <li><a href=\"./logout.jsp\">Logout</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--**********************************\n");
      out.write("            Sidebar end\n");
      out.write("        ***********************************-->\n");
      out.write("\n");
      out.write("        <!--**********************************-->\n");
      out.write("        \n");
      out.write("        <div class=\"content-body\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <!-- row -->\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">                              \n");
      out.write("                                <div class=\"form-validation\">\n");
      out.write("                                    <b style=\"font-weight:bolder; color:green;\">\n");
      out.write("                                        ");

                                        try{
                                            String success= session.getAttribute("success").toString();
                                            out.println(success);
                                            session.removeAttribute("success");
                                        }catch(Exception er){

                                        }

                                        
      out.write("\n");
      out.write("                                    </b>\n");
      out.write("                                    <form class=\"form-valide\" action=\"Add_Item\" method=\"post\">                                                                               \n");
      out.write("                                                                              \n");
      out.write("                                        <div class=\"form-group row\">\n");
      out.write("                                            <label class=\"col-lg-4 col-form-label\" for=\"cat\">Category<span class=\"text-danger\">*</span>\n");
      out.write("                                            </label>\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("                                                <select class=\"form-control\" id=\"cat\" name=\"category\" required>\n");
      out.write("                                                    ");

                                                        try{
                                                            con=DB.getConnection();
                                                            st=con.createStatement();
                                                            rs=st.executeQuery("select * from category");
                                                            while(rs.next()){           
                                                    
      out.write("\n");
      out.write("                                                    \n");
      out.write("                                                            <option value=\"");
      out.print(rs.getString("category_name") );
      out.write('"');
      out.write('>');
      out.print(rs.getString("category_name") );
      out.write("</option>\n");
      out.write("                                                    ");

                                                            }
                                                        }catch(Exception ex){
                                                            ex.printStackTrace();
                                                            out.println("Error: "+ex.getMessage());
                                                        }
                                                    
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group row\">\n");
      out.write("                                            <label class=\"col-lg-4 col-form-label\" for=\"item\">Item Category Description <span class=\"text-danger\">*</span>\n");
      out.write("                                            </label>\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"item\" name=\"itemcategory\" required>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                                                                 \n");
      out.write("                                        <div class=\"form-group row\">\n");
      out.write("                                            <div class=\"col-lg-8 ml-auto\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- #/ container -->\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </div>  \n");
      out.write("       \n");
      out.write("    ");

        }else{
            response.sendRedirect("index.jsp");
        }
    
      out.write("  \n");
      out.write("    <!--**********************************\n");
      out.write("        Scripts\n");
      out.write("    ***********************************-->\n");
      out.write("    <script src=\"plugins/common/common.min.js\"></script>\n");
      out.write("    <script src=\"js/custom.min.js\"></script>\n");
      out.write("    <script src=\"js/settings.js\"></script>\n");
      out.write("    <script src=\"js/gleek.js\"></script>\n");
      out.write("    <script src=\"js/styleSwitcher.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Chartjs -->\n");
      out.write("    <script src=\"./plugins/chart.js/Chart.bundle.min.js\"></script>\n");
      out.write("    <!-- Circle progress -->\n");
      out.write("    <script src=\"./plugins/circle-progress/circle-progress.min.js\"></script>\n");
      out.write("    <!-- Datamap -->\n");
      out.write("    <script src=\"./plugins/d3v3/index.js\"></script>\n");
      out.write("    <script src=\"./plugins/topojson/topojson.min.js\"></script>\n");
      out.write("    <script src=\"./plugins/datamaps/datamaps.world.min.js\"></script>\n");
      out.write("    <!-- Morrisjs -->\n");
      out.write("    <script src=\"./plugins/raphael/raphael.min.js\"></script>\n");
      out.write("    <script src=\"./plugins/morris/morris.min.js\"></script>\n");
      out.write("    <!-- Pignose Calender -->\n");
      out.write("    <script src=\"./plugins/moment/moment.min.js\"></script>\n");
      out.write("    <script src=\"./plugins/pg-calendar/js/pignose.calendar.min.js\"></script>\n");
      out.write("    <!-- ChartistJS -->\n");
      out.write("    <script src=\"./plugins/chartist/js/chartist.min.js\"></script>\n");
      out.write("    <script src=\"./plugins/chartist-plugin-tooltips/js/chartist-plugin-tooltip.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"./plugins/tables/js/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script src=\"./plugins/tables/js/datatable/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("    <script src=\"./plugins/tables/js/datatable-init/datatable-basic.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"./js/dashboard/dashboard-1.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
