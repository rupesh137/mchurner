<!DOCTYPE html>
<html>

<head>
    <title>Admin-Login</title>
    <link href="../resources/img/favicon.ico" rel="shortcut icon" sizes="16x16 32x32" type="image/x-icon" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/icons/font-awesome/css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
    <!-- <link rel="stylesheet" type="text/css" href="../resources/styles/compiled.min.css"> -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/animate.class">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/custom.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/custom.responsive.css">
</head>

<body id="wrapper" class="inbx-body-cnt">
    <div class="container">
        <div class="">
            <div class="inbx-f-cnt">
                <div class="inbx-f-logo"></div>
                <div class="inbx-main-frm">
                    <div class="sign-in-form">
                    <div class="inbx-from-title">Sign In</div>
                    <p class="inbx-f-title">Enter Your Email ID And Password To Login</p>
                    <%
                    	String message = (String)request.getAttribute("message");                    
                    	message = message!=null ? message :"";
                    %>
                    <span><%=message %></span>
                    <form class="" name="signInForm" id="signInForm" action="loginProcess" method="post">
                        <div class="md-form">
                            <input type="text" id="frmemail" name="username" class="form-control" required>
                            <label for="frmemail">Email</label>
                        </div>

                        <div class="md-form">
                            <input type="password" id="frmpass" name="password" class="form-control pwd" required>
                            <label for="frmpass">Password</label>
                            <a href="javascript:void(0);" class="pull-right reveal"><i class="fa fa-eye"></i></a>
                            <!-- <p class="font-small"><a href="javascript:;" class="inbx-b2 btn-fp">Forgot Password?</a></p>  -->                   
                        </div>

                        <div class="text-center1">
                            <button type="submit" class="btn btn-block from-btn">Sign In</button><br>
                            <!-- <p class="font-small grey-text">Create Account? <a href="javascript:;" class="bold-text black-text btn-signup">SIGN UP</a></p> -->
                        </div>
                        <br>
                    </form>
                </div><!-- ./SignIn -->
                    <!-- SignUp -->
                    <div class="sign-up-form">
                    <div class="inbx-from-title">Sign Up</div>
                    <p class="inbx-f-title">Fill The Form Below To Sign Up</p>
                    <form class="" name="signUpform">
                        <div class="md-form">
                            <input type="text" class="form-control" name="firstName" required />
                            <label for="firstName">First Name</label>
                        </div>
  
                        <div class="md-form">
                            <input type="text"  class="form-control" name="lastName" required />
                            <label for="lastName">Last Name</label>
                        </div>
                        
                        <div class="md-form">
                            <input type="text" class="form-control" name="username" required />
                            <label for="username">User Name</label>
                        </div>
  
                        <div class="md-form">
                            <input type="password" class="form-control" name="password" required />
                            <label for="password">Password</label>                           
                        </div>
  
                        <div class="text-center1">
                            <button type="submit" class="btn btn-block from-btn">Submit</button>
                            <br>
                            <p class="font-small grey-text">Already have Account? <a href="" class="bold-text black-text btn-signin">SIGN IN</a></p>
                        </div>
                        <br>
                    </form>
                    </div><!-- ./SignUp -->
                    <!-- forgot-password -->
                    <div class="forgot-pass-form">
                            <div class="inbx-from-title">Forgot Password</div>
                            <p class="inbx-f-title">Enter Your Email ID To Forgot Password</p>
                            <form class="" name="signInForm" id="signInForm" >
                                <div class="md-form">
                                    <input type="text" id="frmemail" class="form-control" required>
                                    <label for="frmemail">Email</label>
                                </div>
                                <div class="text-center1">
                                    <button type="submit" class="btn btn-block from-btn">Proceed</button><br>
                                    <p class="font-small grey-text">Create Account? <a href="javascript:;" class="bold-text black-text btn-signup">SIGN UP</a></p>
                                </div>
                                <br>
                            </form>
                    </div>

                    <!-- ./forgot-password -->
                </div>
            </div>
        </div>
        <!--/.End Login-Container-->
    </div>
    <!--/.End Container-->

    <!--scripts-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/plugins/bootstrap/js/popper.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/compiled.min.js"></script>
    <!-- <script type="text/javascript" src="../resources/scripts/wow.min.js"></script> -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/plugins/bootstrap/js/popper.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/custom_old.js"></script>
<script>
    
$(".reveal").on('click',function() {
    var $pwd = $(".pwd");
    if ($pwd.attr('type') === 'password') {
        $pwd.attr('type', 'text');
    } else {
        $pwd.attr('type', 'password');
    }
});
</script>
    </body>

</html>