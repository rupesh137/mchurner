﻿<!DOCTYPE HTML>
<html ng-app="mchurnerApp" ng-controller="transactionController">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Mchurner</title>
<%@ include file="commonResourceLink.jsp" %>

<!--[if lt IE 9]>
    <script src="js/html5shiv.min.js"></script>
    <script src="js/respond.min.js"></script>
<![endif]-->

</head>
<body>
<div class="wrapper">
 <%-- <div class="mainHeader">
    	   <div class="container">
          	<div class="row">
				<div class="logo pull-left">
          			<a href="#page-top"><img  src="${pageContext.request.contextPath}/custresources/images/logo.png" alt="" title=""></a>
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
              		<!-- <a href="#page-top" class="navbar-brand">Logo <img src="images/White_Stone.png" alt="" title=""></a> -->
					<div class="loginHold_mobl">
                           <a class="logBtn" href="#">Login</a>
						   <a class="regBox" href="#">Registration</a>						   
					</div>
        		</div>
            
                <div id="navbar" class="collapse navbar-collapse mainMenu">
                  <ul class="nav navbar-nav deviceNav">
                     <li>
                        <a href="home.html">Home</a>
                    </li>
					<li>
                        <a href="aboutus.html">About Us</a>
                    </li>                    
                    <li class="dropdown">
                        	<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Our Products</a>
                        	<ul class="dropdown-menu" role="menu">
                            	<li><a href="ourproducts.html">Fixed Deposit</a></li>
                            	<li><a href="ourproducts_recurring.html" class="subActiveNav">Recurring Deposit</a></li>
                                <li><a href="ourproducts_loan.html">Loan</a></li>
                            </ul>    
                    </li>
                    <li>
                         <a href="contactus.html">Contact Us</a>
                    </li>
					<li>
					    <div class="userName">
                           <a href="#">Kunal Chandane</a> 				   
						</div>
						 <div class="ddBox">
						    <span>Logout</span>
						 </div>
                    </li>
					<li>
					 	<a href="refer_and_earn.html" style="color:#177ba9;">Refer and Earn</a>
                    </li>
                  </ul>
                </div>
            </div>
     	 </div>
    </div> --%>
	 <%@ include file="header.jsp" %>
	
    	 
    
    <!--<div class="bannerHold">
    	<div class="container-fluid">
                    <div class="row">
                        <div class="innerBanImg abtImg">
                        	<img alt="" src="images/banner_ourproduct_FD.jpg" class="img-responsive">
                        </div>
                   </div>
        </div>
    </div> -->

    <div class="innerContentHold" >
       <div class="pgContainer">
          <div class="scContainer">
  	 		 <div class="container">
                 <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                       <div class="tabInfoHold">
                         <div class="tabList">		
						     <ul>
                                <li><a href="#" class="activeTab">Share Certificate</a></li>
                                <li><a href="#">Saving Deposit</a></li>
                                <li><a href="#">Fixed Deposit</a></li>
                            	<li><a href="#">Recurring Deposit</a></li>
                                <li><a href="#">Loan</a></li>
                                <li><a href="#">Refer and Earn</a></li>
							 </ul>
						 </div>
						 <div class="tabContHold" >
						    <div class="tabContainer">
							    <h4>Share Certificate</h4>
								 <div class="tabData">
								   <div class="dataInfo">
								    <div class="boxData loanTab">
										<h3>Share Certificate</h3>
										<div class="tableContainer">
										 <table class="table">
											<thead>
											  <tr>
												<th>Certificate No.</th>
												<th>Date</th>
												<th>No. of Share</th>
												<th>Amount</th>
												<th></th>
											 </tr>
										</thead>
										<tbody>
											<tr ng-repeat="data in shareData">
												<td ng-bind="data.shareId"></td>
												<td ng-bind="data.purchaseDate"></td>
												<td ng-bind="data.noOfShare"></td>
												<td ng-bind="data.noOfShare * data.eachSharePrice"></td>
												<td><a href="#" class="viewtn">View</a></td>
											</tr>
										 </tbody>
										</table>																				
									   </div>								
									</div>								
								   </div>
								 </div>								 
							</div>
							
							<div class="tabContainer">
							    <h4>Saving Deposit</h4>
								 <div class="tabData">
								   <div class="dataInfo">
								    <div class="boxData loanTab">
										<h3>Saving Deposit</h3>
										 <div class="tableContainer">
										 <table class="table">
											<thead>
											  <tr>
												<th>Account No.</th>
												<th>Balance</th>
											 </tr>
											</thead>
											<tbody>
												<tr>
													<td>082689231144555</a></td>
													<td>Rs. 500.00</td>
												</tr>
												<tr>
													<td>0826892311489555</td>
													<td>Rs. 700.00</td>
												</tr>
											 </tbody>
										</table>	
										</div>
										<div class="dateHold">
											<div class="dtCol">
                                                    <h6>Date From</h6>
                                                    <div class="calendarControl">
														<input type="text" id="datepicker1" class="">
													</div>
                                            </div>
                                            <div class="dtCol">
                                                    <h6>Date to</h6>
													<div class="calendarControl">
														<input type="text" id="datepicker2">
													</div>
                                                    
                                            </div>
											
											<div class="submitBtn">
												<input value="Submit" class="bookFD" type="button">
											</div>
										</div>
									</div>								
								   </div>
								 </div>
							</div>
							
							<div class="tabContainer">
								<h4>Fixed Deposit</h4>
								<div class="tabData">
								   <div class="dataInfo">
									 <div class="boxData FDTab">
										<h3>Fixed Deposit</h3>
										<div class="tableContainer">
										<table class="table">
											<thead>
											  <tr>
												<th>Account No.</th>
												<th class="txtRH">Amount of deposit</th>
												<th>Period</th>
												<th>Deposit date</th>
												<th>Maturity date</th>
												<th>Rate of interest</th>
												<th>Maturity amount</th>
												<th></th>
											 </tr>
										</thead>
										<tbody>
											<tr ng-repeat="data in FDData">
												<td ng-bind="data.accountNo"></td>
												<td class="txtRH" ng-bind="'Rs. '+data.depositAmt"></td>
												<td ng-bind="data.tenure+' months'"></td>
												<td ng-bind="data.startDate"></td>
												<td ng-bind="data.maturityDate"></td>
												<td ng-bind="data.interestRate"></td>
												<td ng-bind=""></td>
												<td><a href="#" class="viewtn">View</a></td>
											</tr>											
										 </tbody>
										</table>
										</div>
										<div class="submitBtn">
												<input value="Book new FD" class="bookFD" type="button" data-toggle="modal" data-target="#addNewFD">
											</div>
									
									
		<div class="modal fade addNewFD" id="addNewFD" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-md" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Book New FD</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">								
						<div class="newFD">
							<div class="row">
								<div class="col-lg-4">
								  <label>Amount :</label>
								</div>
								<div class="col-lg-5">
								  <input type="text" class="form-control">
								</div>
							</div>
							<div class="row">
								<div class="col-lg-4">
								  <label>Tenure :</label>
								</div>
								<div class="col-lg-5">
								  <select class="form-control paymentMode">
									   <option value="1">1</option>
									   <option value="2">2</option>
									   <option value="3">3</option>
									</select>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-4">
								  <label>Maturity :</label>
								</div>
								<div class="col-lg-5">
								  <input type="text" class="form-control">
								</div>
							</div>
							<div class="submitBtn">
								<input value="Submit" class="" type="button">
							</div>
						</div>
			                </div>
				            </div>
				        </div>			

						
					</div>
				   </div>
				 </div>
			</div>
							
							<div class="tabContainer">
								 <h4>Recurring Deposit</h4>
								 <div class="tabData">
								   <div class="dataInfo">
								    <div class="boxData RDTab">
										<h3>Recurring Deposit</h3>
										<div class="tableContainer">
										<table class="table">
											<thead>
											  <tr>
												<th>Account No.</th>
												<th class="txtRH">Monthly Installment</th>
												<th>Tenure</th>
												<th>Loan Requirement After</th>
												<th class="txtRH">Maturity Amount</th>
												<th></th>
											 </tr>
										</thead>
										<tbody>
											<tr>
												<td>xxxx123</td>
												<td class="txtRH">Rs. 1,000.00</td>
												<td>36 Month</td>
												<td>25/03/2018</td>
												<td class="txtRH">Rs. 50,000.00</td>
												<td><a href="#" class="viewtn">View</a></td>
											</tr>
											<tr>
												<td>xxxx456</td>
												<td class="txtRH">Rs. 1,000.00</td>
												<td>36 Month</td>
												<td>25/03/2018</td>
												<td class="txtRH">Rs. 50,000.00</td>
												<td><a href="#" class="viewtn">View</a></td>
											</tr>
											<tr>
												<td>xxxx789</td>
												<td class="txtRH">Rs. 1,000.00</td>
												<td>36 Month</td>
												<td>25/03/2018</td>
												<td class="txtRH">Rs. 50,000.00</td>
												<td><a href="#" class="viewtn">View</a></td>
											</tr>
										 </tbody>
										</table>
										</div>
										<div class="submitBtn">
												<input value="Book new RD" class="bookRD" type="button" data-toggle="modal" data-target="#addNewRD">
											</div>
		<div class="modal fade addNewRD" id="addNewRD" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-md" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Book New RD</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">									
										<div class="newRD">
											<div class="row">
												<div class="col-lg-4">
												  <label>Monthly Installment :</label>
												</div>
												<div class="col-lg-8">
												  <input type="text" class="form-control">
												</div>
											</div>
											<div class="row">
												<div class="col-lg-4">
												  <label>Tenure :</label>
												</div>
												<div class="col-lg-8">
												  <select class="form-control paymentMode">
													   <option value="1">1</option>
													   <option value="2">2</option>
													   <option value="3">3</option>
													</select>
												</div>
											</div>
											<div class="row">
												<div class="col-lg-4">
												  <label>Loan Requirement After :</label>
												</div>
												<div class="col-lg-8">
												  <input type="text" class="form-control">
												</div>
											</div>
											<div class="row">
												<div class="col-lg-4">
												  <label>Maturity Amount :</label>
												</div>
												<div class="col-lg-8">
												  <input type="text" class="form-control">
												</div>
											</div>
											<div class="submitBtn">
												<input value="Submit" class="" type="button">
											</div>
										</div>
									</div>	
									</div>	
									</div>	
										
									</div>
								   </div>
								 </div>
                            </div>
							
							<div class="tabContainer">
							    <h4>Loan</h4>
								 <div class="tabData">
								   <div class="dataInfo">
								    <div class="boxData loanTab">
										<h3>Loan</h3>
										 <div class="tableContainer">
										 <table class="table">
											<thead>
											  <tr>
												<th>Account No.</th>
												<th>Loan Type</th>
												<th>Loan Amount</th>
												<th>Disbursement date</th>
												<th></th>
											 </tr>
										</thead>
										<tbody>
											<tr>
												<td>xxxx123</td>
												<td>Gold Loan</td>
												<td>Rs. 1,00,000</td>
												<td>25/03/2018</td>
												<td><a href="#" class="viewtn">View</a></td>
											</tr>
											<tr>
												<td>xxxx456</td>
												<td>Mortgage Loan</td>
												<td>Rs. 50,000</td>
												<td>25/03/2018</td>
												<td><a href="#" class="viewtn">View</a></td>
											</tr>
										 </tbody>
										</table>
										</div>
										<div class="submitBtn">
											<input value="Apply for new Loan" class="applyLoan" type="button" data-toggle="modal" data-target="#addNewLoan">
										</div>
						<div class="modal fade addNewLoan" id="addNewLoan" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		            <div class="modal-dialog modal-md" role="document">
		                <div class="modal-content">
		                    <div class="modal-header">
		                        <h5 class="modal-title" id="exampleModalLabel">Book New RD</h5>
		                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		                            <span aria-hidden="true">&times;</span>
		                        </button>
		                    </div>
                    <div class="modal-body">						
										<div class="newLoan">
											<div class="row">
												<div class="col-lg-3">
												  <label>Loan Type :</label>
												</div>
												<div class="col-lg-9">
												  <select class="form-control paymentMode">
													   <option value="1">Gold Loan</option>
													   <option value="2">Mortgage Loan</option>
													   <option value="3">Policy Loan</option>
													   <option value="3">Vehicle Loan</option>
													</select>
												</div>
											</div>
											<div class="row">
												<div class="col-lg-3">
												  <label>Loan Purpose :</label>
												</div>
												<div class="col-lg-9">
												  <select class="form-control paymentMode">
													   <option value="1">Gold</option>
													   <option value="2">Mortgage</option>
													   <option value="3">Policy</option>
													   <option value="3">Vehicle</option>
													</select>
												</div>
											</div>
											<div class="row">
												<div class="col-lg-3">
												  <label>Loan Amount :</label>
												</div>
												<div class="col-lg-9">
												  <input type="text" class="form-control">
												</div>
											</div>
											<div class="row">
												<div class="col-lg-3">
												  <label>Employment Type :</label>
												</div>
												<div class="col-lg-9 radio">
												   <label><input type="radio" name="optradio"> Salaried</label>
												   <label><input type="radio" name="optradio"> Self employmed</label>
												</div>
											</div>
											<div class="row">
												<div class="col-lg-3">
												  <label>Monthly Income / Salary :</label>
												</div>
												<div class="col-lg-9">
												  <input type="text" class="form-control">
												</div>
											</div>
											<div class="row">
												<div class="col-lg-3">
												  <label>Pan Number :</label>
												</div>
												<div class="col-lg-9">
												  <input type="text" class="form-control">
												</div>
											</div>
											<div class="row">
												<div class="col-lg-3">
												  <label>Document Upload :</label>
												</div>
												<div class="col-lg-9">
													<ol>
														<li><input type="file" class="file"></li>
														<li><input type="file" class="file"></li>
														<li><input type="file" class="file"></li>
													</ol>
												</div>
											</div>
											<div class="submitBtn">
												<input value="Submit" class="" type="button">
											</div>
										</div>
									</div>	
									</div>	
									</div>	
										
										
										
									</div>
								  </div>
								 </div>
							</div>
							
							<div class="tabContainer">
							    <h4>Refer and Earn</h4>
								 <div class="tabData">
								   <div class="dataInfo">
										<div class="boxData">
											<h3>Refer and Earn</h3>
											<p>Invest every month and be prepared for the future</p>
										</div>
									</div>
								 </div>
							</div>
                         </div>
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
<script>
  $(function() {
    $( "#datepicker1, #datepicker2" ).datepicker({
      showOn: "button",
      buttonImage: "${pageContext.request.contextPath}/custresources/images/calendar.png",
      buttonImageOnly: true,
      buttonText: "Select date"
    });
  });
  </script>
</html>