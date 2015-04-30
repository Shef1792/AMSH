<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>The Educare Website Template | Home :: w3layouts</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href='http://fonts.googleapis.com/css?family=Pompiere' rel='stylesheet' type='text/css'>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/responsive-tables.css" rel="stylesheet" type="text/css" media="all" />
<script src="js/responsive-tables.js" type="text/javascript"></script>
<!--slider-->
<link href="css/flexslider.css" rel="stylesheet" type="text/css" media="all" />
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/jquery.flexslider.js" type="text/javascript"></script>
 <script type="text/javascript">
    $(function(){
      SyntaxHighlighter.all();
    });
    $(window).load(function(){
      $('.flexslider').flexslider({
        animation: "slide",
        animationLoop: false,
        itemWidth: 210,
        itemMargin: 5,
        minItems: 2,
        maxItems: 4,
        start: function(slider){
          $('body').removeClass('loading');
        }
      });
    });
  </script>
<style type="text/css">
<!--
.style1 {
	color: #FFFFFF;
	font-size: xx-large;
}
 <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"</script>
<script>
$(document).ready(function()
{
  //Handles menu drop down
  $('.dropdown-menu').find('form').click(function (e) {
        e.stopPropagation();
        });
  });
</script>
    <style>
      .navbar .nav > li > .dropdown-menu::before {
  position: absolute;
  top: -7px;
  left: 9px;
  display: inline-block;
  border-right: 7px solid transparent;
  border-bottom: 7px solid #CCC;
  border-left: 7px solid transparent;
  border-bottom-color: rgba(0, 0, 0, 0.2);
  content: '';
}

.navbar .nav > li > .dropdown-menu::after {
  position: absolute;
  top: -6px;
  left: 10px;
  display: inline-block;
  border-right: 6px solid transparent;
  border-bottom: 6px solid white;
  border-left: 6px solid transparent;
  content: '';
}
    .style2 {color: #FFFFFF}
.box1 {background: #2db34a;
  border-radius: 6px;
  cursor: pointer;
  height: 95px;
  line-height: 95px;
  text-align: center;
  transition-property: background, border-radius;
  transition-duration: .2s, 1s;
  transition-timing-function: linear;
  width: 95px;
}
th {
    font-size:2em;
	color: #ffffff;
	text-align: center;
}
td{
	text-align: center;
}
</style>
</head>
<body>
<div class="h-bg">
<div class="wrap">
	<div class="header">
		<div class="logo">
		  	 <a href="index.jsp" class="style1">Kid School</a>		 </div>
	    <div class="header-right">
	 	 <ul class="nav">
	        <li class="active"><a href="student.html" title="Home">Home</a></li>
	  		<li><a href="uploadAssignment.jsp">Submit Assignment</a></li>
	  	    <li><a href="GetData.jsp">Check Assignment Reviews</a></li>
	  		<li><a href="logout.jsp">Logout</a></li>
      </ul>
	 </div>
	    <div class="clear"></div>
	</div>
</div>
</div>

<div class="f_bg">
<div class="wrap" style="margin-bottom: 40%;margin-top: 2%;">
<div class="header">
<table class="responsive" style="height:80%;float:none;width:100%;padding: 50px;">
<tr>
<th width="15%">Assignment</th>
	    <th width="15%" >Class</th>
	    <th width="15%">Subject</th>
	    <th width="15%">Submission Date</th>
	    <th width="15%">Grade</th>
</tr>
<s:iterator value="studentAssignmentList">
        <tr>
            <td width="15%"><s:property value="attachment"/></td>
            <td width="15%"><s:property value="clas"/></td>
            <td width="15%"><s:property value="subject"/></td>
            <td width="15%"><s:property value="timeStamp"/></td>
            <td width="15%"><s:property value="grade"/></td>
        </tr>
    </s:iterator>
</table>
</div>
</div>
</div>
	
<div class="menu2_bg">
<div class="wrap"> 
<div class="menu2">
	<ul>
		<li><a href="#">Home</a></li>
		<li><a href="#">Solutions</a></li>
		<li><a href="#">Support</a></li>
		<li><a href="#">Solutions</a></li>
		<li><a href="#">Send mail</a></li>
		<li><a href="#">Call Now</a></li>
	</ul>
	</div>
</div>
</div>
<div class="f_bg">
<div class="wrap">
<div class="footer">
		<div class="f_logo">
			<a href="" class="style1">Kid School</a>
		    <div class="copy">
			<p class="w3-link">&nbsp;</p>
			<p class="w3-link">&nbsp;</p>
			<p class="w3-link">&nbsp;</p>
		    </div>
	  </div>
		<div class="f_grid">
		<div class="social">
				<ul class="follow_icon">
						<li><a href="#" style="opacity: 1;">Get Updates Via</a></li>
					<li><a href="#" style="opacity: 1;"><img src="images/fb.png" alt=""></a></li>
					<li><a href="#" style="opacity: 1;"><img src="images/g+.png" alt=""></a></li>
					<li><a href="#" style="opacity: 1;"><img src="images/tw.png" alt=""></a></li>
					<li><a href="#" style="opacity: 1;"><img src="images/rss.png" alt=""></a></li>
				</ul>
		  </div>
		</div>
		<div class="f_grid1">
			<div class="f_icon">
				<img src="images/f_icon.png" alt="" />
			</div>
			<div class="f_address">
				<p>500 Lorem Ipsum Dolor Sit,</p>
				<p>22-56-323 Lorem Ipsum Dolor Sit Sit Amet,</p>
				<p>Fax: (000) 000 00 00 0</p>
				<p>Email: <span>info@mycompany.com</span></p>
		  </div>
		</div>
		<div class="clear"></div>
</div>
</div>
</div>
</body>
</html>