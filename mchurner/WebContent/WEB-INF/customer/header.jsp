 <div class="mainHeader">
    	  <div class="container">
          	<div class="row">
          		<div class="logo pull-left">
          			<a href="${pageContext.request.contextPath}/"><img src="${pageContext.request.contextPath}/custresources/images/logo.png" alt="" title=""></a>
          		</div>
				<div class="contNo_mobl">
					    <span><a href="javascript:void(0)">Refer and Earn</a></span>
				</div>
     	  	 	<div class="navbar-header navbar-default">
					 <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                      </button>
              		
					<div class="loginHold_mobl">
                           <a class="logBtn" href="#">Login</a>
						   <a class="regBox" href="#">Registration</a>						   
					</div>
        		</div>
            
                <div id="navbar" class="collapse navbar-collapse mainMenu">
                  <ul class="nav navbar-nav deviceNav">
                     <li>
                        <a href="${pageContext.request.contextPath}/">Home</a>
                    </li>
					<li>
                        <a href="${pageContext.request.contextPath}/pages/aboutus" >About Us</a>
                    </li>                    
                    <li class="dropdown">
                        	<a href="${pageContext.request.contextPath}/pages/fd" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Our Products</a>
                        	<ul class="dropdown-menu" role="menu">
                            	<li><a href="${pageContext.request.contextPath}/pages/fd">Fixed Deposit</a></li>
                            	<li><a href="${pageContext.request.contextPath}/pages/rd">Recurring Deposit</a></li>
                                <li><a href="${pageContext.request.contextPath}/pages/loan">Loan</a></li>
                            </ul>    
                    </li>
                    <li>
                         <a href="${pageContext.request.contextPath}/pages/contactus" >Contact Us</a>
                    </li>
					<li>
					    <div class="loginHold">
                           <a href="#" class="logBtn">Login</a> | <a href="#" class="regBox">Registration</a>						   
						</div>
                    </li>
					<li>
					 	<a href="#" style="color:#177ba9;">Refer and Earn</a>
                    </li>
                  </ul>
                </div>
            </div>
     	 </div>
    </div>
    
    <div class="lbOverlay">		
		<div class="lightBox"></div>
		<div class="formContainer Login"  ng-app="mchurnerApp" ng-controller="loginController">
			<div class="fcHeader">Login</div>
			<div class="fcData">
				<div class="form-group">
					<p class="formError">This fields are mandatory</p>
					<input type="name" class="form-control" id="name" placeholder="Username">
				</div>
				<div class="form-group">
					<p class="formError">This fields are mandatory</p>
					<input type="password" class="form-control" id="mobile" placeholder="Password">
				</div>
				<div class="fPassword"><a href="#" class="forgotPass">Forgot Password</a></div>
				<div class="submitBtn">
					<input value="SUBMIT" class="" type="button" ng-click="goLogin()">
				</div>
				<p>Don't have an account?</p>
				<a href="#" class="newAc"><span>Create New Account</span></a>
			</div>
		</div>
		
		<div class="formContainer Register" ng-app="mchurnerApp" ng-controller="signupController">
			<div class="fcHeader">Register</div>
			<div class="fcData">
				<div class="form-group">
					<p class="formError">This fields are mandatory</p>
					<input type="name" class="form-control" id="name" placeholder="Name" ng-model="user.firstName">
				</div>
				<div class="form-group">
					<p class="formError">This fields are mandatory</p>
					<input type="mobile" class="form-control" id="mobile" placeholder="Mobile" ng-model="user.mobileNo">
				</div>
				<div class="form-group">
					<p class="formError">This fields are mandatory</p>
					<input type="email" class="form-control" id="email" placeholder="Email" ng-model="user.emailIds">
				</div>
				<div class="form-group">
					<p class="formError">This fields are mandatory</p>
					<input type="Name" class="form-control" id="refname" placeholder="Referral Name" ng-model="user.referrerCode">
				</div>
				<div class="submitBtn">
					<input value="SUBMIT" class="" type="button" ng-click="saveUserDetails(user)">
				</div>
				<p>Have an account with us</p>
				<a href="#" class="signIn">Sign in</a>
			</div>
		</div>
		
		<div class="formContainer forgotPassword">
			<div class="fcHeader">Forgot Password</div>
			<div class="fcData">
				<div class="form-group">
					<p class="formError">This fields are mandatory</p>
					<input type="name" class="form-control" id="email" placeholder="Enter your email id">
				</div>
				<div class="submitBtn">
					<input value="SUBMIT" class="" type="button">
				</div>
				<p>Have an account <a href="#" class="signIn">Sign in</a></p>
				
			</div>
		</div>
		<span id="ctxURL" style="display:none;">${pageContext.request.contextPath}</span>
	</div>