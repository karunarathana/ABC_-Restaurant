<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
<link rel="stylesheet" href="CSS/register.css">
<script defer src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>
<body>
	<input type="hidden" id="Response" value="<%=request.getAttribute("ErrorResponse")%>">
	 <div class="login_main_wrapper">
        <div class="header_section">
            <div class="abc_header_section">
                <div class="abc_header_section_left">
                    <a href="index.jsp">Overview</a>
		            <a href="gallery.jsp">Gallery</a>
		            <a href="offer.jsp">Offers</a>
		            <a href="facilities.jsp">Facilities</a>
                </div>
                <div class="abc_header_section_middle">
                    <img src="Assert/Group.svg" width="40" height="40" alt="LOGO" />
                    <p>ABC RESTAURANT</p>
                </div>
                <div class="abc_header_section_right">
                    <img src="Assert/trolley.png" width="30" alt="Cart" />
                    <img src="Assert/search.png" width="20" alt="Search" />
                    <a href="login.html"><button>Become a Member</button></a>
                </div>
            </div>
        </div>
        <div>
            <div class="page_body_main_wrapper">
                <div class="body_content">
                    <div class="left_warpper">
                    <form action="Register" method="post">
                        <h2>Create an your Account</h2>
                        <p>Fill your details Bellow</p>
                        <div class="left_warpper_user_input">
                            <div class="user_input_tems">
                                <label for="">User Type</label>
                                <select name="type" id="user">
                               		<option value="plsselect">Please Select User Type</option>
                                    <option value="customer">Customer</option>
                                </select>
                                <p id="e_type" class="user_input_error_handel" style="color: red;font-size: 0.8rem;margin-top:2px">*Please choose type</p>
                            </div>

                            <div class="user_input_tems">
                                <label for="">Email Address</label>
                                <input id="uEmail" name="email" type="text" placeholder="sandeepa@gmail.com">
                                <p id="e_email" class="user_input_error_handel" style="color: red;font-size: 0.8rem;margin-top:2px">*Please enter email</p>
                            </div>
                            <div class="user_input_tems">
                                <label for="">Phone Number</label>
                                <input id="utel" name="tel" type="text" placeholder="+94">
                                 <p id="e_tel" class="user_input_error_handel" style="color: red;font-size: 0.8rem;margin-top:2px">*please enter phone number</p>
                            </div>

                            <div class="user_input_tems">
                                <label for="">Password</label>
                                <input id="uPass" name="pass" type="password" placeholder="Your Password">
                                 <p id="e_pass" class="user_input_error_handel" style="color: red;font-size: 0.8rem;margin-top:2px">*please enter password</p>
                            </div>
                            <div class="user_check_box">
                                <input name="agree" type="checkbox">
                                <p>I agree to receive marketing, advertising and promotional information via email.</p>
                            </div>
                            <div class="user_input_tems redirect_loging_page">
                                <p>If you have an account <a href="login.jsp">Login?</a></p>
                            </div>
                        </div>
                        <div class="footer_btn">
                            <button type="submit">Register</button>
                        </div>
                        </form>
                    </div>
                    <div class="right_warpper">
                        <img src="Assert/people-enjoying-mexican-barbecue.jpg" height="400" width="100%" alt="" >
                    </div>
                </div>
            </div>
        </div>
        
        <div class="footer_wrapper">
            <div class="footer_header">
                <div class="footer_header_left"></div>
                <div class="footer_header_middle">
                    <img src="Assert/Group.svg" width="60" alt=""  />
                    <h2>ABC RESTURENT</h2>
                </div>
                <div class="footer_header_right"></div>
            </div>
            <div class="middle_section_footer">
                <div class="middle_section_footer_left">
                    <p>CONTACT</p>
                </div>
                <div class="middle_section_footer_middle">
                    <p>Join our malling list for updates</p>
                    <p>Get news & offer event</p>
                </div>
                <div class="middle_section_footer_right">
                    <p>WORKING HOUSE</p>
                </div>
            </div>
            <div class="bottom_section_footer">
                <div class="bottom_section_footer_left">
                    <p>5 Colombo,2002 Paris</p>
                    <p>Call - +94719208046</p>
                    <p>abcresturent@gmail.com</p>
                </div>
                <div class="bottom_section_footer_middle">
                    <div class="email_address_customize">
                        <input type="email" placeholder="Email" />
                        <button>Subcribe</button>
                    </div>
                </div>
                <div class="bottom_section_footer_right">
                    <p>Mon-Fri 7.00am - 10.00pm</p>
                    <p>Sat:7.00am - 6.00pm</p>
                    <p>Sun:8.00am - 6.00pm</p>
                </div>
            </div>
            <p id="copyright_2">
                Copyright - abcresturent 2024 | Designed by Nipun Sandeepa
            </p>
        </div>
    </div>
     <!-- Popup Container -->
    <div id="popup" class="popup">
        <div class="popup-content">
            <span class="close">&times;</span>
            <h3>Popup Message</h3>
            <p>This is a simple popup message. You can put any content here.</p>
        </div>
    </div>
    <script>
    	let result = null;
   	 	let message = document.getElementById("Response").value;
   	 	
	 	document.getElementById("e_type").style.display="none";
	 	document.getElementById("e_email").style.display="none";
	 	document.getElementById("e_pass").style.display="none";
	 	document.getElementById("e_tel").style.display="none";
	 	

   	 	
   	 	
   		if(!message.length == 0){
	 		if(message.includes("User type is required.")){
	 			document.getElementById("user").style.border = "1px solid red";
	 			document.getElementById("e_type").style.display="block";
	 		}
	 		if(message.includes("phone number is required.")){
	 			document.getElementById("utel").style.border = "1px solid red";
	 			document.getElementById("e_tel").style.display="block";
	 		}
	 		if(message.includes("Invalid email format.")){
	 			document.getElementById("uEmail").style.border = "1px solid red";
	 			document.getElementById("e_email").style.display="block";
	 		}
	 		if(message.includes("Password is required.")){
	 			document.getElementById("uPass").style.border = "1px solid red";
	 			document.getElementById("e_pass").style.display="block";
	 		}
	 		if(message.includes("Registration Successfully")){
	 			 popup.style.display = "block";
	 		}
	 	}
    </script>
</body>
</html>