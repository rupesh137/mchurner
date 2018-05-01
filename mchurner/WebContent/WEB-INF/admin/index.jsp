<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}/images/favicon.png">
    <title>Mchuner</title>
    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- This page CSS -->
    <!-- chartist CSS -->
    <link href="${pageContext.request.contextPath}/plugins/chartist-js/dist/chartist.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/plugins/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.css" rel="stylesheet">
    <!--c3 CSS -->
    <link href="${pageContext.request.contextPath}/plugins/c3-master/c3.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/resources/admin/css/style.css" rel="stylesheet">
    <!-- Dashboard 1 Page CSS -->
    <link href="${pageContext.request.contextPath}/resources/admin/css/pages/dashboard.css" rel="stylesheet">
    <!-- You can change the theme colors from here -->
    <link href="${pageContext.request.contextPath}/resources/admin/css/colors/default-dark.css" id="theme" rel="stylesheet">
    

</head>

<body class="fix-header fix-sidebar card-no-border">
    <!-- ============================================================== -->
    <!-- Preloader - style you can find in spinners.css -->
    <!-- ============================================================== -->
    <div class="preloader">
        <div class="loader">
            <div class="loader__figure"></div>
            <p class="loader__label">Admin Pro</p>
        </div>
    </div>
    <div id="main-wrapper">
		<%@include file="header.jsp"%>
		<%@include file="sidebar.jsp"%>
        <div class="page-wrapper">
            <div class="container-fluid">
                <div class="row page-titles">
                    <div class="col-md-5 align-self-center">
                        <h3 class="text-themecolor">Dashboard</h3>
                    </div>
                    <div class="col-md-7 align-self-center">
                       
                    </div>
                </div>
                <!-- ============================================================== -->
                <!-- End Bread crumb and right sidebar toggle -->
                <!-- ============================================================== -->
                <!-- ============================================================== -->
                <!-- Sales overview chart -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-lg-9 col-md-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="d-flex">
                                    <div>
                                        <h3 class="card-title m-b-5"><span class="lstick"></span>Sales Overview </h3>
                                    </div>
                                    <div class="ml-auto">
                                        <select class="custom-select b-0">
                                            <option selected="">January 2017</option>
                                            <option value="1">February 2017</option>
                                            <option value="2">March 2017</option>
                                            <option value="3">April 2017</option>
                                        </select>
                                    </div>
                                </div>
                                <div id="sales-overview2" class="p-relative" style="height:360px;"></div>
                            </div>
                        </div>
                    </div>
                    <!-- ============================================================== -->
                    <!-- visit charts-->
                    <!-- ============================================================== -->
                    <div class="col-lg-3 col-md-12">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title"><span class="lstick"></span>Visit Separation</h4>
                                <div id="visitor" style="height:250px; width:100%;"></div>
                                <table class="table vm font-14">
                                    <tr>
                                        <td class="b-0">Mobile</td>
                                        <td class="text-right font-medium b-0">38.5%</td>
                                    </tr>
                                    <tr>
                                        <td>Tablet</td>
                                        <td class="text-right font-medium">30.8%</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
 
                <!-- ============================================================== -->
                <!-- End Page Content -->
                <!-- ============================================================== -->
            </div>
            <%@include file="footer.jsp"%>
        </div>
    </div>
    <script src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
    <!-- Bootstrap popper Core JavaScript -->
    <script src="${pageContext.request.contextPath}/plugins/bootstrap/js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
    <!-- slimscrollbar scrollbar JavaScript -->
    <script src="js/perfect-scrollbar.jquery.min.js"></script>
    <!--Wave Effects -->
    <script src="${pageContext.request.contextPath}/resources/admin/js/waves.js"></script>
    <!--Menu sidebar -->
    <script src="${pageContext.request.contextPath}/resources/admin/js/sidebarmenu.js"></script>
    <!--Custom JavaScript -->
    <script src="${pageContext.request.contextPath}/resources/admin/js/custom.min.js"></script>
    
    <script src="${pageContext.request.contextPath}/plugins/chartist-js/dist/chartist.min.js"></script>
    <script src="${pageContext.request.contextPath}/plugins/chartist-plugin-tooltip-master/dist/chartist-plugin-tooltip.min.js"></script>
    <!--c3 JavaScript -->
    <script src="${pageContext.request.contextPath}/plugins/d3/d3.min.js"></script>
    <script src="${pageContext.request.contextPath}/plugins/c3-master/c3.min.js"></script>
    <!-- Chart JS -->
    <script src="${pageContext.request.contextPath}/resources/admin/js/dashboard.js"></script>
</body>

</html>