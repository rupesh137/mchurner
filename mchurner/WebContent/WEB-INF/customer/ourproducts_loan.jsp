<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Mchurner - Our Products</title>
<%@ include file="commonResourceLink.jsp" %>

<!--[if lt IE 9]>
    <script src="js/html5shiv.min.js"></script>
    <script src="js/respond.min.js"></script>
<![endif]-->

</head>
<body>
<div class="wrapper">
 <%@ include file="header.jsp" %>

    <div class="innerContentHold">
       <div class="pgContainer">
         <div class="productLoan">
		    <div class="bgSection">
				<div class="container">
					<div class="row">
						<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
							<img src="${pageContext.request.contextPath}/custresources/images/goldLoan.png" class="img-responsive LFloat"/>
						</div>
						<div class="col-xs-12 col-sm-7 col-md-10 col-lg-10">
							<h2 class="gl">Gold Loan</h2>
							<p>Easy and secure funds. Get a loan against the gold you own, to meet your various financial needs easily.</p>
							<p>Liquidate your gold quickly to meet your monetary needs</p>
							<div class="readBtn">
								<a href="${pageContext.request.contextPath}/pages/goldLoan">Read More</a>
							</div>
						</div>										
					</div>					
				</div>
			</div>
			
			<div class="pgSection">
				<div class="container">
					<div class="row">
						<div class="col-xs-12 col-sm-7 col-md-10 col-lg-10">
							<h2 class="ml">Mortgage Loan</h2>
							<p>Don't let your valuable property sit idle. Let it work for you. Get a loan against property you own, through Mchurner's Loan against Property product and use it for any purpose you need: acquiring an asset, business needs, etc.</p>
							<div class="readBtn">
								<a href="${pageContext.request.contextPath}/pages/mortLoan">Read More</a>
							</div>
						</div>
						<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
							<img src="${pageContext.request.contextPath}/custresources/images/mortgageLoan.png" class="img-responsive LFloat"/>
						</div>
					</div>					
				</div>
			</div>
			
			<div class="bgSection">
				<div class="container">
					<div class="row">
						<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
							<img src="${pageContext.request.contextPath}/custresources/images/policyLoan.png" class="img-responsive LFloat"/>
						</div>
						<div class="col-xs-12 col-sm-7 col-md-10 col-lg-10">
							<h2 class="lap">loan against policy</h2>
							<p>Get flexibility of liquidity and access to cash when you need it, without selling off your LIC Policies.</p>
							<p>A life insurance policy is designed to provide financial cover to your family if something happens to you. Certain types of policies such as unit-linked and endowment plans also double up as investments. But now your insurance plan can also help you raise funds when you need it through a loan against insurance policy.</p>
							<div class="readBtn">
								<a href="${pageContext.request.contextPath}/pages/policyLoan">Read More</a>
							</div>
						</div>										
					</div>					
				</div>
			</div>
			
			<div class="pgSection">
				<div class="container">
					<div class="row">
						<div class="col-xs-12 col-sm-7 col-md-10 col-lg-10">
							<h2 class="vl">vehicle loan</h2>
							<p>Two Wheeler - Zoom ahead in Life</p>
							<p>Car Loan - Put your happiness in Top gear</p>
							<div class="readBtn">
								<a href="${pageContext.request.contextPath}/pages/vehicleLoan">Read More</a>
							</div>
						</div>
						<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">
							<img src="${pageContext.request.contextPath}/custresources/images/vehicleLoan.png" class="img-responsive LFloat"/>
						</div>
					</div>					
				</div>
			</div>
		  </div>
		 </div>
	</div>

    
    <%@ include file="footer.jsp" %>
</div>
</body>
</html>
