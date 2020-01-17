package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.donate.DB;

public final class food_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("    <title>View Food Donations</title>\r\n");
      out.write("    <!-- Favicon icon -->\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"images/favicon.png\">\r\n");
      out.write("    <!-- Pignose Calender -->\r\n");
      out.write("    <link href=\"./plugins/pg-calendar/css/pignose.calendar.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Chartist -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./plugins/chartist/css/chartist.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css\">\r\n");
      out.write("    <!-- Custom Stylesheet -->\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <!--script code -->\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("            function numOnly(input){\r\n");
      out.write("                var regex = /[^0-9]/g;\r\n");
      out.write("                input.value = input.value.replace(regex, \"\");\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            function validate(){\r\n");
      out.write("                var quant = document.getElementById(\"quant\");\r\n");
      out.write("                if (quant.value < 0){\r\n");
      out.write("                    alert(\"Quantity value of \" + quant.value + \" is invalid\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("    </script>\r\n");
      out.write("    <!--script code -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    ");

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--*******************\r\n");
      out.write("        Preloader start\r\n");
      out.write("    ********************-->\r\n");
      out.write("    <div id=\"preloader\">\r\n");
      out.write("        <div class=\"loader\">\r\n");
      out.write("            <svg class=\"circular\" viewBox=\"25 25 50 50\">\r\n");
      out.write("                <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"3\" stroke-miterlimit=\"10\" />\r\n");
      out.write("            </svg>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--*******************\r\n");
      out.write("        Preloader end\r\n");
      out.write("    ********************-->\r\n");
      out.write("    \r\n");
      out.write("    <!--**********************************\r\n");
      out.write("        Main wrapper start\r\n");
      out.write("    ***********************************-->\r\n");
      out.write("    <div id=\"main-wrapper\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"nav-header\">\r\n");
      out.write("            <div class=\"brand-logo\">\r\n");
      out.write("                <a href=\"home.jsp\">\r\n");
      out.write("                    <b class=\"logo-abbr\"><img src=\"images/logo.png\" alt=\"\"> </b>\r\n");
      out.write("                    <span class=\"logo-compact\"><img src=\"./images/logo-compact.png\" alt=\"\"></span>\r\n");
      out.write("                    <span class=\"brand-title\">\r\n");
      out.write("                        <img src=\"images/logo-text.png\" alt=\"\">\r\n");
      out.write("                    </span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        ");

            String email=(String)session.getAttribute("email");
        if(email!=null){
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"header\">    \r\n");
      out.write("            <div class=\"header-content clearfix\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"nav-control\">\r\n");
      out.write("                    <div class=\"hamburger\">\r\n");
      out.write("                        <span class=\"toggle-icon\"><i class=\"icon-menu\"></i></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("    \r\n");
      out.write("                <div class=\"header-right\">\r\n");
      out.write("                    <ul class=\"clearfix\">\r\n");
      out.write("                        <li class=\"icons dropdown\">\r\n");
      out.write("                            <div    data-toggle=\"dropdown\">\r\n");
      out.write("                                <span class=\"activity active\"></span>\r\n");
      out.write("                                <!--<img src=\"images/user/1.png\" height=\"40\" width=\"40\" alt=\"\">--> \r\n");
      out.write("                                ");
      out.print(email);
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"drop-down dropdown-profile animated fadeIn dropdown-menu\">\r\n");
      out.write("                                <div class=\"dropdown-content-body\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"user_add.jsp\"><i class=\"icon-user\"></i> <span>Add User</span></a>\r\n");
      out.write("                                        </li>                                        \r\n");
      out.write("\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"user_view.jsp\"><i class=\"icon-lock\"></i> <span>View Users</span></a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <hr class=\"my-2\">\r\n");
      out.write("                                        <li><a href=\"logout.jsp\"><i class=\"icon-key\"></i> <span>Logout</span></a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!--USER NAME AND DROPDOWN-->      \r\n");
      out.write("                    </ul><!--clearfix-->\r\n");
      out.write("                </div><!--header right-->\r\n");
      out.write("            </div><!--header-content clearfix-->\r\n");
      out.write("        </div><!--header-->\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("        Header end ti-comment-alt\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Sidebar start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("        <div class=\"nk-sidebar\">           \r\n");
      out.write("            <div class=\"nk-nav-scroll\">\r\n");
      out.write("                <ul class=\"metismenu\" id=\"menu\">\r\n");
      out.write("                    <li class=\"nav-label\">Dashboard</li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"fa fa-speedometer\"></i><span class=\"nav-text\">Dashboard</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul aria-expanded=\"false\">\r\n");
      out.write("                            <li><a href=\"./home.jsp\">Home</a></li>                           \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-label\">Donations</li>\r\n");
      out.write("                    <li class=\"mega-menu mega-menu-sm\">\r\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"icon-globe-alt menu-icon\"></i><span class=\"nav-text\">Clothing Donation</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul aria-expanded=\"false\">\r\n");
      out.write("                            <li><a href=\"./clothes_add.jsp\">Add Record</a></li>\r\n");
      out.write("                            <li><a href=\"./clothes_view.jsp\">View Records</a></li>\r\n");
      out.write("                            <li><a href=\"./clothes_edit.jsp\">Edit Records</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"icon-envelope menu-icon\"></i> <span class=\"nav-text\">Food Donations</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul aria-expanded=\"false\">\r\n");
      out.write("                            <li><a href=\"./food_add.jsp\">Add Record</a></li>\r\n");
      out.write("                            <li><a href=\"./food_view.jsp\">View Record</a></li>\r\n");
      out.write("                            <li><a href=\"./food_edit.jsp\">Edit Record</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"icon-graph menu-icon\"></i> <span class=\"nav-text\">Money Donations</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul aria-expanded=\"false\">\r\n");
      out.write("                            <li><a href=\"./money_add.jsp\">Add Record</a></li>\r\n");
      out.write("                            <li><a href=\"./money_view.jsp\">View Record</a></li>\r\n");
      out.write("                            <li><a href=\"./money_edit.jsp\">Edit Record</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"icon-screen-tablet menu-icon\"></i><span class=\"nav-text\">School Supply Donations</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul aria-expanded=\"false\">\r\n");
      out.write("                            <li><a href=\"./school_add.jsp\">Add Record</a></li>\r\n");
      out.write("                            <li><a href=\"./school_view.jsp\">View Record</a></li>\r\n");
      out.write("                            <li><a href=\"./school_edit.jsp\">Edit Record</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>                    \r\n");
      out.write("                    <li class=\"nav-label\">Donation Categories</li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"icon-grid menu-icon\"></i><span class=\"nav-text\">Item Category</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul aria-expanded=\"false\">\r\n");
      out.write("                            <li><a href=\"./item_cat_add.jsp\">Add Item Category</a></li>\r\n");
      out.write("                            <li><a href=\"./item_cat_view.jsp\">View Item Category</a></li>\r\n");
      out.write("                            <li><a href=\"./item_cat_edit.jsp\">Edit Item Category</a></li>                           \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>                    \r\n");
      out.write("                    \r\n");
      out.write("                    <li class=\"nav-label\">Accounts</li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"icon-notebook menu-icon\"></i><span class=\"nav-text\">Pages</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul aria-expanded=\"false\">\r\n");
      out.write("                            <li><a href=\"./user_view.jsp\">View Users</a></li>\r\n");
      out.write("                            <li><a href=\"./user_add.jsp\">Add Users</a></li>\r\n");
      out.write("                            <li><a href=\"./user_edit_table.jsp\">Edit Users</a></li>\r\n");
      out.write("                            <li><a href=\"./logout.jsp\">Logout</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Sidebar end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************-->\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"content-body\">              \r\n");
      out.write("            <!-- row -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <h4 class=\"card-title\">List of Food Donations</h4>\r\n");
      out.write("                                <div class=\"table-responsive\">\r\n");
      out.write("                                    <table class=\"table table-striped table-bordered zero-configuration\">\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th>No.</th>\r\n");
      out.write("                                                <th>Item Description</th>\r\n");
      out.write("                                                <th>Item Type</th>\r\n");
      out.write("                                                <th>Quantity</th>                                                \r\n");
      out.write("                                                <th>Status</th>\r\n");
      out.write("                                                <th>To be Donated/Donated to</th>\r\n");
      out.write("                                                <th>Date Received</th>\r\n");
      out.write("                                                <th>Expiration Date</th>\r\n");
      out.write("                                                <th>Date Released</th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            \r\n");
      out.write("                                            ");

                                                try{ 
                                                con = DB.getConnection();
                                                st= con.createStatement();
                                                String sql ="SELECT * FROM foods_donate";

                                                rs = st.executeQuery(sql);
                                                while(rs.next()){
                                            
      out.write("  \r\n");
      out.write("                                            \r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>");
      out.print(rs.getString("id") );
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(rs.getString("item_desc"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(rs.getString("item_type"));
      out.write("</td>\r\n");
      out.write("                                                <td id=\"quant\" type=\"number\" onblur=\"validate()\">");
      out.print(rs.getString("quantity"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(rs.getString("status"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(rs.getString("donatedto"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(rs.getString("daterec"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(rs.getString("dateexp"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(rs.getString("datedon"));
      out.write("</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            \r\n");
      out.write("                                            ");
 
                                                }

                                                } catch (Exception e) {
                                                e.printStackTrace();
                                                }
                                            
      out.write("                                            \r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>                                     \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- #/ container -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Content body end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("        </div>    \r\n");
      out.write("            \r\n");
      out.write("        ");

            }else{
                response.sendRedirect("index.jsp");
            }
        
      out.write("  \r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Scripts\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("        <script src=\"plugins/common/common.min.js\"></script>\r\n");
      out.write("        <script src=\"js/custom.min.js\"></script>\r\n");
      out.write("        <script src=\"js/settings.js\"></script>\r\n");
      out.write("        <script src=\"js/gleek.js\"></script>\r\n");
      out.write("        <script src=\"js/styleSwitcher.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Chartjs -->\r\n");
      out.write("        <script src=\"./plugins/chart.js/Chart.bundle.min.js\"></script>\r\n");
      out.write("        <!-- Circle progress -->\r\n");
      out.write("        <script src=\"./plugins/circle-progress/circle-progress.min.js\"></script>\r\n");
      out.write("        <!-- Datamap -->\r\n");
      out.write("        <script src=\"./plugins/d3v3/index.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/topojson/topojson.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/datamaps/datamaps.world.min.js\"></script>\r\n");
      out.write("        <!-- Morrisjs -->\r\n");
      out.write("        <script src=\"./plugins/raphael/raphael.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/morris/morris.min.js\"></script>\r\n");
      out.write("        <!-- Pignose Calender -->\r\n");
      out.write("        <script src=\"./plugins/moment/moment.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/pg-calendar/js/pignose.calendar.min.js\"></script>\r\n");
      out.write("        <!-- ChartistJS -->\r\n");
      out.write("        <script src=\"./plugins/chartist/js/chartist.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/chartist-plugin-tooltips/js/chartist-plugin-tooltip.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./plugins/tables/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/tables/js/datatable/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/tables/js/datatable-init/datatable-basic.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./js/dashboard/dashboard-1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
