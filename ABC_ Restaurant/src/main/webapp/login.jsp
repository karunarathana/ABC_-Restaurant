<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/login.css">
</head>
<body>
<input type="hidden" id="Response" value="<%=request.getAttribute("Response")%>">
<div class="login_main_wrapper">
        <div class="header_section">
            <div class="abc_header_section">
                <div class="abc_header_section_left">
                    <a href="">Welcome</a>
                    <a href="">Product</a>
                    <a href="">Our Menu</a>
                    <a href="">Offer</a>
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
                      <form action="Login" method="get">
                        <h2>Login your Account</h2>
                        <p>${Response}</p>
                        <p>Fill your details Bellow</p>
                        <div class="left_warpper_user_input">
                            <div class="user_input_tems">
                                <label for="">Type</label>
                                <select name="type" id="user">
                                    <option value="customer">Customer</option>
                                    <option value="broker">Broker</option>
                                    <option value="admin">Admin</option>
                                </select>
                            </div>

                            <div class="user_input_tems">
                                <label for="">Email</label>
                                <input name="email" type="text" placeholder="sandeepa@gmail.com">
                            </div>

                            <div class="user_input_tems">
                                <label for="">Password</label>
                                <input name="pass" type="password" placeholder="Your Password">
                            </div>

                            <div class="user_input_tems redirect_loging_page">
                                <p> <a href="forgot.jsp">Froget Password?</a></p>
                            </div>

                            <div class="sign_in_method">
                                <div class="sign_in_method_icons sitem1">
                                    <img src="Assert/Login/social.png" alt="" width="36" height="36" srcset="">
                                </div>
                                <div class="sign_in_method_icons">
                                    <img src="Assert/Login/facebook.png" alt="" width="36" height="36" srcset="">
                                </div>
                                <div class="sign_in_method_icons">
                                    <img src="Assert/Login/apple.png" alt="" width="36" height="36" srcset="">
                                </div>
                            </div>
                            <div class="user_input_tems redirect_loging_page">
                                <p>If you hav'nt account <a href="register.jsp">register?</a></p>
                            </div>
                        </div>
                        <div class="footer_btn">
                            <button type="submit" id="loginBtn">Login</button>
                        </div>
                        </form>
                    </div>
                    <div class="right_warpper">
                        <img src="Assert/delicious-lobster-gourmet-seafood.jpg" height="400" width="100%" alt="" srcset="">
                    </div>
                </div>
            </div>
        </div>
        
        <div class="footer_wrapper">
            <div class="footer_header">
                <div class="footer_header_left"></div>
                <div class="footer_header_middle">
                    <img src="Assert/Group.svg" width="60" alt="" srcset="" />
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
    <script defer src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script defer type="text/javascript">
    	var message = document.getElementById("Response").value;
    	const loginBtn = document.getElementById("loginBtn");
    	loginBtn.addEventListener("click",()=>{
    		console.log(message);
        	if(message == "faild"){
        		Swal.fire({
        			  icon: "error",
        			  title: "Oops...",
        			  text: "Something went wrong!",
        			  footer: '<a href="#">Why do I have this issue?</a>'
        			});
        	}else{
        		Swal.fire({
        			  title: "Good job!",
        			  text: "You clicked the button!",
        			  icon: "success"
        			});
        	}
    	});
    </script>
</body>
</html>