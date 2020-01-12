<%-- 
    Document   : school_edit_form
    Created on : Jan 4, 2020, 7:49:32 PM
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
    <title>Edit Clothing Donations</title>
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

            <%
             int cid  = 0;
             String desc = null,type = null,qty = null,cond = null,stat = null,donto = null,rec = null,don = null;
            %>
        <%
            try{
                cid=Integer.parseInt(request.getParameter("id"));
                con = DB.getConnection();
                st = con.createStatement();
                rs = st.executeQuery("select * from school_donate where id="+cid+"");
                if(rs.next()){
                    desc = rs.getString("item_desc");
                    type = rs.getString("item_type");
                    qty = rs.getString("quantity");
                    cond = rs.getString("conditions");
                    stat = rs.getString("status");
                    donto = rs.getString("donatedto");
                    rec = rs.getString("daterec");
                    don = rs.getString("datedon");
                }
            }catch(Exception e){
                out.println(e);
            }
        %>
            <!-- row -->

            <div class="container-fluid">
                <div class="row justify-content-center">
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="form-validation">
                                    <b style="font-weight:bolder; color:green;">
                                        <%
                                        try{
                                            String success= session.getAttribute("updated").toString();
                                            out.println(success);
                                            session.removeAttribute("updated");
                                        }catch(Exception er){

                                        }

                                        %>
                                     </b>
                                    <form class="form-valide" action="Update_School" method="post">
                                        
                                        <input type="hidden" name="id" value="<%=cid%>">
                                        
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="itemdesc">Item Description<span class="text-danger">*</span>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="text" class="form-control" id="itemdesc" name="item_desc" value="<%=desc%>" required>
                                            </div>
                                        </div>
                                                                                                                                                    
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="sex">Type<span class="text-danger">*</span>
                                            </label>
                                            <div class="col-lg-6">
                                                <select class="form-control" id="type" name="item_type" required>
                                                    <option value="<%=type%>" selected="selected"><%=type%></option>
                                                    <%
                                                        try{
                                                            con=DB.getConnection();
                                                            st=con.createStatement();
                                                            rs=st.executeQuery("select * from item_category where category = 'School Supplies'");
                                                            while(rs.next()){           
                                                    %>                                                            
                                                            <option value="<%=rs.getString("item_name") %>"><%=rs.getString("item_name") %></option>
                                                    <%                                                            }
                                                        }catch(Exception ex){
                                                            ex.printStackTrace();
                                                            out.println("Error: "+ex.getMessage());
                                                        }
                                                    %>
                                                </select>
                                            </div>
                                        </div>
                                                
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="quantity">Quantity<span class="text-danger">*</span>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="number" class="form-control" id="itemdesc" name="quantity" value="<%=qty%>" required>
                                            </div>
                                        </div>
                                                
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="cond">Condition<span class="text-danger">*</span>
                                            </label>
                                            <div class="col-lg-6">
                                                <select class="form-control" id="cond" name="condition" required>
                                                    <option value="<%=cond%>" selected="selected"><%=cond%></option>
                                                    <option value="New">New</option>
                                                    <option value="Used">Used</option>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="stat">Status<span class="text-danger">*</span>
                                            </label>
                                            <div class="col-lg-6">
                                                <select class="form-control" id="stat" name="status" required>
                                                    <option value="<%=stat%>" selected="selected"><%=stat%></option>
                                                    <option value="Donated">Received</option>
                                                    <option value="Pending">Pending</option>
                                                    <option value="Donated">Donated</option>                                                   
                                                </select>
                                            </div>
                                        </div>        
                                        
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="donated">To be Donated/Donated to
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="text" class="form-control" id="val-position" name="donated" value="<%=donto%>">
                                            </div>
                                        </div>

                                        <div class="form-group row">        
                                            <label class="col-lg-4 col-form-label" for="position">Date Received
                                            </label>
                                            <div class="col-lg-6">
                                                <input name="received" type="text" class="form-control" id="datepicker1" value="<%=rec%>" required>
                                            </div>
                                        </div> 
                                                
                                       
                                        <div class="form-group row">        
                                            <label class="col-lg-4 col-form-label" for="position">Date Released
                                            </label>
                                            <div class="col-lg-6">
                                                <input name="released" type="text" class="form-control" id="datepicker2" value="<%=don%>">
                                            </div>
                                        </div>   
                                        
                                                                                               
                                        <div class="form-group row">
                                            <div class="col-lg-8 ml-auto">
                                                <input type="submit" class="btn btn-primary" value="Submit">
                                            </div>
                                        </div>
                                        
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #/ container -->
        </div>
        
        
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