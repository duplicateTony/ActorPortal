<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Search Actor Portal</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<link href="css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<link href="css/style.css" rel='stylesheet' type='text/css' />
		<link href='//fonts.googleapis.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
		<link href="css/font-awesome.css" rel="stylesheet"> 
	</head>
	<body>
		<nav class="navbar navbar-default" role="navigation">
	<div class="container">
	    <div class="navbar-header">
	        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
	        </button>
	        <a class="navbar-brand" href="index.jsp"><img src="images/logo.png" width="160" height="70" alt=""/></a>
	    </div>
	    <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1" style="height: 1px;">
	        <ul class="nav navbar-nav">
	        	<li><a href="login.jsp">Actor</a></li>
		        <li><a href="login.jsp">Employer</a></li>
		        <li><a href="login.jsp">Login</a></li>
		        <li><a href="register.jsp">Register</a></li>
		        <li><a href="about.jsp">About Us</a></li>
		        <li><a href="contact.jsp">Contact Us</a></li>
		    </ul>
	    </div>
	    <div class="clearfix"> </div>
	  </div>
	</nav>
	<div class="container">
		<div class="single">  
	   	<div class="form-container">
       	<h2>Actor Search Form</h2>
        <form name="form" action="ActorSearchServlet" method="post">
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="userNameActor">Username</label>
                <div class="col-md-9">
                    <input type="text" name="userNameActor" id="userNameActor" class="form-control input-sm"/>
                </div>
            </div>
         </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="genderActor">Gender</label>
                <div class="col-md-9">
                     <div class="radios">
				        <label for="radio-01" class="label_radio">
				            <input type="radio" name="gender" value="Male" checked> Male
				        </label>
				        <label for="radio-02" class="label_radio">
				            <input type="radio" name="gender" value="Female"> Female
				        </label>
	                </div>
                </div>
            </div>
         </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="yearRangeActor">YearRange</label>
                <div class="col-md-9">
                    <select name="yearRange" id="yearRangeActor" class="form-control input-sm">
                        <option value="">-- Select Actor Year Range --</option>
                        <option value="Kid">1 - 3 Years Old</option>
                        <option value="Child">4 - 10 Years</option>
                        <option value="Teenager">10 - 15 Years</option>
                        <option value="Younger">16 - 23 Years</option>
                        <option value="Adult">24 - 30 Years</option> 
                        <option value="MiddleAge">31 - 45 Years</option> 
                        <option value="Old">46 - 60 Years</option> 
                        <option value="60+ Years">60+ Years</option>    
                    </select> 
                </div>
            </div>
         </div>
         <div class = "row">
         	<div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="StateActor">State</label>
                <div class="col-md-9">
                    <select name="State" id="StateActor" class="form-control input-sm">
                        <option value="">-- Select Actor State --</option>
                        <option value="BJ">Beijing</option>
                        <option value="SH">Shanghai</option>
                        <option value="SZ">Shenzhen</option>
                        <option value="GD">GuangDong</option>
                        <option value="SD">Shandong</option> 
                        <option value="SC">Sichuan</option> 
                        <option value="HB">Hebei</option> 
                        <option value="ZJ">Zhejiang</option>   
                        <option value="JS">Jiangsu</option> 
                    </select> 
                </div>
            </div>
         	<div class = "row">
         	<div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="CityActor">City</label>
                <div class="col-md-9">
                    <select name="City" id="CityActor" class="form-control input-sm">
                        <option value="">-- Select Actor City --</option>
                        <option value="BJ">Beijing</option>
                        <option value="SH">Shanghai</option>
                        <option value="SZ">Shenzhen</option>
                        <option value="GZ">Guangzhou</option>
                        <option value="CD">Chengdu</option> 
                        <option value="HZ">Hangzhou</option> 
                        <option value="TJ">Tianjin</option> 
                    </select> 
                </div>
            </div>
            <div class = "row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="AvailableActor">AvailableTime</label>
                <div class="col-md-9">
                    <select name="Available" id="AvailableActor" class="form-control input-sm">
                        <option value="">-- Select Actor Available Time --</option>
                        <option value="AO">At Once</option>
                        <option value="DAY">1 Day</option>
                        <option value="WEEK">1 Week</option>
                        <option value="MONTH">1 Month</option>
                    </select> 
                </div>
            </div>
         </div>
         <div class = "row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="CharactorActor">Charactor</label>
                <div class="col-md-9">
                    <select name="Available" id="CharactorActor" class="form-control input-sm">
                        <option value="">-- Select Preferred Actor Charactor --</option>
                        <option value="DRAMA">Drama</option>
                        <option value="DOCU">Documentary</option>
                        <option value="LOVE">Love Story</option>
                        <option value="HIS">History</option>
                        <option value="ACTION">Action</option>
                    </select> 
                </div>
            </div>
         </div>
	</div>
	<div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="Search" class="btn btn-primary btn-sm">
            </div>
        </div>
	<div class="footer">
		<div class="container">
		<div class="col-md-3 grid_3">
			<h4>Navigation</h4>
			<ul class="f_list f_list1">
				<li><a href="index.jsp">Home</a></li>
				<li><a href="login.jsp">Login</a></li>
				<li><a href="register.jsp">Register</a></li>
				<li><a href="login.jsp">Actor</a></li>
				<li><a href="login.jsp">Employer</a></li>
			</ul>
			<ul class="f_list">
				<li><a href="about.jsp">About Us</a></li>
				<li><a href="contact.jsp">Contact Us</a></li>
				<li><a href="features.jsp">Features</a></li>
				<li><a href="services.jsp">Services</a></li>
				<li><a href="terms.jsp">Terms of use</a></li>
			</ul>
			<div class="clearfix"> </div>
		</div>
		<div class="col-md-3 grid_3">
			<h4>Benefits</h4>
			<div class="footer-list">
			  <ul>
				<li><p>Wider Search Reach</p></li>
				<li><p>Easy to Apply</p></li>
				<li><p>Find the Right Role</p></li>
				<li><p>Intelligent Match</p></li>
			  </ul>
			</div>
		</div>
		<div class="col-md-3 grid_3">
			<h4>Who We Are!</h4>
			<p style="text-align:justify">We have a trusted relation with the employer and the actor seekers and we believe in maintaining that trust and relationship throughout. Our main aim is satisfied customers, be it employers or actor seekers.</p>
		</div>
		<div class="col-md-3 grid_3">
			<p style="margin-bottom:2em"><img src="images/logo.png" width="160" height="70" alt=""/></p>
			<h5>Not Registered? Register Now</h5>
			<p><button type="button" class="btn red" onclick="location.href='register.jsp'">Register Now!</button></p>
		</div>
		<div class="clearfix"> </div>
		<div class="copy">
		<p>Copyright © 2018 Actor Portal. All Rights Reserved. </p>
	</div>
	</div>
</div>
	</body>
</html>
