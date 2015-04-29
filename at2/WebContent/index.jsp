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
        <title>Educare</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href='http://fonts.googleapis.com/css?family=Pompiere' rel='stylesheet' type='text/css'>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <!--slider-->
        <link href="css/flexslider.css" rel="stylesheet" type="text/css" media="all" />

        <script src="https://code.jquery.com/jquery-2.1.3.min.js" type="text/javascript"></script>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/jquery.flexslider.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(function () {
                SyntaxHighlighter.all();
            });
            $(window).load(function () {
                $('.flexslider').flexslider({
                    animation: "slide",
                    animationLoop: false,
                    itemWidth: 210,
                    itemMargin: 5,
                    minItems: 2,
                    maxItems: 4,
                    start: function (slider) {
                        $('body').removeClass('loading');
                    }
                });
            });
        </script>
        
        <!--  <style type="text/css">
              
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
          </style>
  
        -->
        <style>
        	td.label{
        	color: black;
        	}
            .inpName1, .inpPwd1,.inpEmail1{
                border: 1px solid #cbcbcb;
                border-radius: 3px;
                box-shadow: 0px 4px 0px #cbcbcb;
                color: #666;
                float: left;   

                // padding: 12px 14px 12px 55px;
                width: 100%;
                height: 50px;
                margin:0 0 20px 0 ;
                width: 100%;
            }
            .lognBtn{
                background-color:#2474d2;
                color:#fff;font:400 24px/20px 'Titillium Web';
                box-shadow: 0px 4px 0px #275b98;
                text-align:center; width: 100%;
                border:none;text-transform:uppercase;
                padding:12px 0;
                border-radius: 5px;
                position:relative;
            }
            .lognBtn:after{
                height:30px;
                position: absolute;
                right:10px;
                width:30px;	
                top:10px;
                content:" ";
                //background-image:url(../images/blue-right.png); background-repeat:no-repeat;background-position:right center;
            }
            .student-register-btn{
                margin-left: 11%;
                box-shadow: 0 3px #357ebd;
            }
            .teacher-register-btn{
                margin-left: 22%;
                box-shadow: 0 3px #357ebd;
            }
            .modal-dialog{
                width:450px;
				margin-left:40%;
            }
            .signUp-wrapper{
                width:100%;
                margin:0 auto;
            }
            .signUp{
                color:#4c4c4c;
                font:normal 40px/50px 'Titillium Web';
                text-transform:uppercase;
                margin:0px 0 30px 0;
                text-align:center; 
            }
            .login-wrapper{
                width:390px;
                margin:0 auto;
            }
            .login{
                color:#4c4c4c;
                font:normal 40px/50px 'Titillium Web';
                text-transform:uppercase;
                margin:0px 0 30px 0;
                text-align:center;
            }
            .forgotBox {
                color:#696969;
                font:400 22px/25px 'Titillium Web';
                text-align:center;
                margin:22px 0;
            }
			.style1 {
                  color: #FFFFFF;
                  font-size: xx-large;
              }
        </style>
    </head>
    <body>
        <div class="h-bg">
            <div class="wrap">
                <div class="header">
                    <div class="logo">
                        <a href="index.html" class="style1">Kid School</a>		 </div>
                    <div class="header-right">
                        <ul class="nav">
                            <li class="active"><a href="index.html" title="Home">Home</a></li>
                            <li><a href="about.html">About</a></li>
                            <li><a href="staff.html">Staff</a></li>
                            <li><a href="contact.html">Contact</a></li>
                            <li><a href="" data-toggle="modal" data-target="#myModal">Login</a></li>
                            <li><a href="" data-toggle="modal" data-target="#myModal2">Register</a></li>
                        </ul>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
        </div>
        <!-- Modal HTML -->
        <div id="myModal" class="modal fade">
            <section class="modal-dialog" >
                <div class="modal-content">
                    <div class="modal-header headerBG" style="border:none;">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>                    
                    </div>
                    <section class="modal-body" style="padding-top:0px;padding-left:30px;padding-right:30px;">               	                    	
                        <div class="login-wrapper">
                            <h2 class="login">Login </h2>
                            <form action="login" method="post">
	   						<s:textfield name="currentUser.name" placeholder="Username" cssClass="inpName1"/>
	    					<s:password name="currentUser.password" placeholder="Password" cssClass="inpPwd1"/>
	   						<s:submit value="Login" cssClass="lognBtn"></s:submit>
      						</form>
                            <article class="forgotBox">
                                <p><a href="getEmail.jsp">Forgot Password?</a></p>
                            </article>

                        </div>                           

                    </section>

                </div>
            </section>
        </div>
        <!-- Modal HTML -->
        <!-- Modal HTML -->
        <div id="myModal2" class="modal fade">
            <section class="modal-dialog" style="">
                <div class="modal-content">
                    <div class="modal-header headerBG"  style="border:none;">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>                    
                    </div>
                    <section class="modal-body" style="padding-top:0px;padding-left:30px;padding-right:30px;">               	                    	
                        <div class="signUp-wrapper">
                            <h2 class="signUp">Registration </h2>
                            <form action="register" method="post">  
								<s:radio label="Role" list="#{'2':'Student','1':'Teacher'}" name="currentUser.Role" value="1" ></s:radio>
								<s:textfield name="currentUser.name" placeholder="UserName" cssClass="inpName1"></s:textfield>  
								<s:password name="currentUser.password" placeholder="Password" cssClass="inpName1"></s:password>  
								<s:textfield name="currentUser.emailId" placeholder="Email" cssClass="inpName1"></s:textfield>  
								<s:textfield name="currentUser.phoneNumber" placeholder="Phone Number" cssClass="inpName1"></s:textfield>								
								 <s:submit value="Register" align="center" cssClass="lognBtn"></s:submit>  
							  
							</form>
                        </div>                           

                    </section>

                </div>
            </section>
        </div>
        
        <!-- Modal HTML -->
        <div class="slider_bg">
            <div class="wrap">
                <section class="slider">
                    <div class="flexslider carousel">
                        <ul class="slides">
                            <li>
                                <img src="images/thumbnail-slider-1.jpg" />
                            </li>
                            <li>
                                <img src="images/thumbnail-slider-2.jpg" />
                            </li>
                            <li>
                                <img src="images/thumbnail-slider-3.jpg" />
                            </li>
                            <li>
                                <img src="images/thumbnail-slider-4.jpg" />
                            </li>
                            <li>
                                <img src="images/thumbnail-slider-5.jpg" />
                            </li>
                            <li>
                                <img src="images/thumbnail-slider-6.jpg" />
                            </li>
                            <li>
                                <img src="images/thumbnail-slider-8.jpg" />
                            </li>
                        </ul>
                    </div>
                </section>

            </div>
        </div>
        <div class="cont_bg">
            <div class="wrap">
                <div class="content">
                    <div class="main">
                        <h2>Welcome to our School </h2>
                        <div class="text">
                            <div class="txt_img">
                                <a href="details.html"><img src="images/pic1.jpg"  alt="" /></a> 
                            </div>
                            <div class="txt_para">
                                <p>LThe school   has two fully equipped air-conditioned Medicare centres and two school   nurses are available on all working days between 7.30 am and 2.15 pm. A   pediatrician visits the school daily. A routine medical check up is   conducted twice a year for every child and intimation is sent to the   parents if remedial measures need to be taken. The check up includes   height, weight, eye-sight. A yearly dental check-up is also conducted   with regular follow-up where necessary.In an emergency, the school has a   tie-up with a fully equipped nursing home nearby.</p>
                                <p>&nbsp;</p>
                                <p>&nbsp;</p>
                                <p>&nbsp;</p>
                            </div>
                        </div>
                        <div class="txt_para1">
                            <p>The school   has two fully equipped air-conditioned Medicare centres and two school   nurses are available on all working days between 7.30 am and 2.15 pm. A   pediatrician visits the school daily. A routine medical check up is   conducted twice a year for every child and intimation is sent to the   parents if remedial measures need to be taken. The check up includes   height, weight, eye-sight. A yearly dental check-up is also conducted   with regular follow-up where necessary.In an emergency, the school has a   tie-up with a fully equipped nursing home nearby.painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? </p>
                        </div>
                        <div class="btn">
                            <a href="details.html">Read More <span>>></span></a>
                        </div>
                        <div class="clear"></div>
                        <div class="menu1">
                            <ul class="list">
                                <li><img src="images/icon_1.png" alt="">
                                    <p><strong>Penatibus parturnt montes</strong>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi aliquip consequat Lorem ipsum dolor sitamet conset etuer amet adipinget praesent ....</p>
                                </li>
                            </ul>
                        </div>
                        <div class="menu1">
                            <ul class="list">
                                <li><img src="images/icon_2.png" alt="">
                                    <p><strong>Penatibus parturnt montes</strong>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi aliquip consequat Lorem ipsum dolor sitamet conset etuer amet adipinget praesent ....</p>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="sidebar">
                        <div class="side_bar">
                            <p class="top"><a href="" class="style2"></a></p>
                            <p class="top"><a href=""><img src="images/art-pic2.jpg" alt="">Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi aliquip consequat.</a></p>
                            <p class="top"><a href=""><img src="images/art-pic3.jpg" alt="">Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi aliquip consequat.</a></p>
                            <p class="top"><a href=""><img src="images/art-pic4.jpg" alt="">Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi aliquip consequat.</a></p>
                        </div>
                        <div class="side_bar1">
                            <h2>Testimonials</h2>
                            <p class="top">But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account</p>
                            <p class="side_bar1_bg"></p>
                        </div>
                    </div>
                </div>
                <div class="clear"></div>
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
                            <p class="w3-link">@ashit.J2K system </p>
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