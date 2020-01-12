<%-- 
    Document   : user_edit
    Created on : Dec 29, 2019, 9:13:25 PM
    Author     : Hazel Anne
--%>

<%@page import="java.sql.*"%>
<%@page import="com.donate.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Home</title>
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="images/favicon.png">
    <!-- Pignose Calender -->
    <link href="./plugins/pg-calendar/css/pignose.calendar.min.css" rel="stylesheet">
    <!-- Chartist -->
    <link rel="stylesheet" href="./plugins/chartist/css/chartist.min.css">
    <link rel="stylesheet" href="./plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css">
    <!-- Custom Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    
    <%
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
    %>

    <!--*******************
        Preloader start
    ********************-->
    <div id="preloader">
        <div class="loader">
            <svg class="circular" viewBox="25 25 50 50">
                <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="3" stroke-miterlimit="10" />
            </svg>
        </div>
    </div>
    <!--*******************
        Preloader end
    ********************-->
    
    <!--**********************************
        Main wrapper start
    ***********************************-->
    <div id="main-wrapper">
        
        <div class="nav-header">
            <div class="brand-logo">
                <a href="home.jsp">
                    <b class="logo-abbr"><img src="images/logo.png" alt=""> </b>
                    <span class="logo-compact"><img src="./images/logo-compact.png" alt=""></span>
                    <span class="brand-title">
                        <img src="images/logo-text.png" alt="">
                    </span>
                </a>
            </div>
        </div>
        
        <%
            String email=(String)session.getAttribute("email");
        if(email!=null){
        %>
        
        <div class="header">    
            <div class="header-content clearfix">
                
                <div class="nav-control">
                    <div class="hamburger">
                        <span class="toggle-icon"><i class="icon-menu"></i></span>
                    </div>
                </div>
    
                <div class="header-right">
                    <ul class="clearfix">
                        <li class="icons dropdown">
                            <div    data-toggle="dropdown">
                                <span class="activity active"></span>
                                <!--<img src="images/user/1.png" height="40" width="40" alt="">--> 
                                <%=email%>
                            </div>
                            <div class="drop-down dropdown-profile animated fadeIn dropdown-menu">
                                <div class="dropdown-content-body">
                                    <ul>
                                        <li>
                                            <a href="user_add.jsp"><i class="icon-user"></i> <span>Add User</span></a>
                                        </li>                                        

                                        <li>
                                            <a href="user_view.jsp"><i class="icon-lock"></i> <span>View Users</span></a>
                                        </li>
                                        <hr class="my-2">
                                        <li><a href="logout.jsp"><i class="icon-key"></i> <span>Logout</span></a></li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                        <!--USER NAME AND DROPDOWN-->      
                    </ul><!--clearfix-->
                </div><!--header right-->
            </div><!--header-content clearfix-->
        </div><!--header-->
        <!--**********************************
        Header end ti-comment-alt
        ***********************************-->
        <!--**********************************
            Sidebar start
        ***********************************-->
        <div class="nk-sidebar">           
            <div class="nk-nav-scroll">
                <ul class="metismenu" id="menu">
                    <li class="nav-label">Dashboard</li>
                    <li>
                        <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                            <i class="fa fa-speedometer"></i><span class="nav-text">Dashboard</span>
                        </a>
                        <ul aria-expanded="false">
                            <li><a href="./home.jsp">Home</a></li>                           
                        </ul>
                    </li>
                    <li class="nav-label">Donations</li>
                    <li class="mega-menu mega-menu-sm">
                        <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                            <i class="icon-globe-alt menu-icon"></i><span class="nav-text">Clothing Donation</span>
                        </a>
                        <ul aria-expanded="false">
                            <li><a href="./clothes_add.jsp">Add Record</a></li>
                            <li><a href="./clothes_view.jsp">View Records</a></li>
                            <li><a href="./clothes_edit.jsp">Edit Records</a></li>
                        </ul>
                    </li>
                    <li>
                        <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                            <i class="icon-envelope menu-icon"></i> <span class="nav-text">Food Donations</span>
                        </a>
                        <ul aria-expanded="false">
                            <li><a href="./food_add.jsp">Add Record</a></li>
                            <li><a href="./food_view.jsp">View Record</a></li>
                            <li><a href="./food_edit.jsp">Edit Record</a></li>
                        </ul>
                    </li>
                    <li>
                        <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                            <i class="icon-graph menu-icon"></i> <span class="nav-text">Money Donations</span>
                        </a>
                        <ul aria-expanded="false">
                            <li><a href="./money_add.jsp">Add Record</a></li>
                            <li><a href="./money_view.jsp">View Record</a></li>
                            <li><a href="./money_edit.jsp">Edit Record</a></li>
                        </ul>
                    </li>
                    <li>
                        <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                            <i class="icon-screen-tablet menu-icon"></i><span class="nav-text">School Supply Donations</span>
                        </a>
                        <ul aria-expanded="false">
                            <li><a href="./school_add.jsp">Add Record</a></li>
                            <li><a href="./school_view.jsp">View Record</a></li>
                            <li><a href="./school_edit.jsp">Edit Record</a></li>
                        </ul>
                    </li>                    
                    <li class="nav-label">Donation Categories</li>
                    <li>
                        <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                            <i class="icon-grid menu-icon"></i><span class="nav-text">Item Category</span>
                        </a>
                        <ul aria-expanded="false">
                            <li><a href="./item_cat_add.jsp">Add Item Category</a></li>
                            <li><a href="./item_cat_view.jsp">View Item Category</a></li>
                            <li><a href="./item_cat_edit.jsp">Edit Item Category</a></li>                           
                        </ul>
                    </li>                    
                    
                    <li class="nav-label">Accounts</li>
                    <li>
                        <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                            <i class="icon-notebook menu-icon"></i><span class="nav-text">Pages</span>
                        </a>
                        <ul aria-expanded="false">
                            <li><a href="./user_view.jsp">View Users</a></li>
                            <li><a href="./user_add.jsp">Add Users</a></li>
                            <li><a href="./user_edit_table.jsp">Edit Users</a></li>
                            <li><a href="./logout.jsp">Logout</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
        <!--**********************************
            Sidebar end
        ***********************************-->

        <!--**********************************-->
            
            <div class="content-body">              
            <!-- row -->

            <div class="container-fluid">
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">List of Users</h4>
                                <div class="table-responsive">
                                    <table class="table table-striped table-bordered zero-configuration">
                                        <thead>
                                            <tr>
                                                <th>No.</th>
                                                <th>First Name</th>
                                                <th>Middle Name</th>
                                                <th>Last Name</th>
                                                <th>Sex</th>
                                                <th>Phone</th>
                                                <th>Position</th>
                                                <th>Email</th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            
                                            <%
                                                try{ 
                                                con = DB.getConnection();
                                                st=con.createStatement();
                                                String sql ="SELECT * FROM users";

                                                rs = st.executeQuery(sql);
                                                while(rs.next()){
                                            %>  
                                            
                                            <tr>
                                                <td><%=rs.getString("id") %></td>
                                                <td><%=rs.getString("firstname") %></td>
                                                <td><%=rs.getString("middlename") %></td>
                                                <td><%=rs.getString("lastname") %></td>
                                                <td><%=rs.getString("sex") %></td>
                                                <td><%=rs.getString("phone") %></td>
                                                <td><%=rs.getString("position") %></td>
                                                <td><%=rs.getString("email") %></td> 
                                                <td><a href="user_edit_form.jsp?id=<%=rs.getInt("id")%>">Edit</a></td>
                                            </tr>
                                            
                                             <% 
                                                }

                                                } catch (Exception e) {
                                                e.printStackTrace();
                                                }
                                            %>                                            
                                        </tbody>
                                    </table>                                     
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #/ container -->
        </div>
        <!--**********************************
            Content body end
        ***********************************-->
        </div>    
            
        <%
            }else{
                response.sendRedirect("index.jsp");
            }
        %>  
        <!--**********************************
            Scripts
        ***********************************-->
        <script src="plugins/common/common.min.js"></script>
        <script src="js/custom.min.js"></script>
        <script src="js/settings.js"></script>
        <script src="js/gleek.js"></script>
        <script src="js/styleSwitcher.js"></script>

        <!-- Chartjs -->
        <script src="./plugins/chart.js/Chart.bundle.min.js"></script>
        <!-- Circle progress -->
        <script src="./plugins/circle-progress/circle-progress.min.js"></script>
        <!-- Datamap -->
        <script src="./plugins/d3v3/index.js"></script>
        <script src="./plugins/topojson/topojson.min.js"></script>
        <script src="./plugins/datamaps/datamaps.world.min.js"></script>
        <!-- Morrisjs -->
        <script src="./plugins/raphael/raphael.min.js"></script>
        <script src="./plugins/morris/morris.min.js"></script>
        <!-- Pignose Calender -->
        <script src="./plugins/moment/moment.min.js"></script>
        <script src="./plugins/pg-calendar/js/pignose.calendar.min.js"></script>
        <!-- ChartistJS -->
        <script src="./plugins/chartist/js/chartist.min.js"></script>
        <script src="./plugins/chartist-plugin-tooltips/js/chartist-plugin-tooltip.min.js"></script>

        <script src="./plugins/tables/js/jquery.dataTables.min.js"></script>
        <script src="./plugins/tables/js/datatable/dataTables.bootstrap4.min.js"></script>
        <script src="./plugins/tables/js/datatable-init/datatable-basic.min.js"></script>

        <script src="./js/dashboard/dashboard-1.js"></script>

    </body>

</html>
