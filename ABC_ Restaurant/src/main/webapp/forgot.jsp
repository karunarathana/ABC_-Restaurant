<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/frogotTest.css">
</head>
<body>
<input type="hidden" id="fogotResponse" value="<%=request.getAttribute("ErrorResponse")%>">
	 <div class="main_wrapper_login_page">
        <div class="main_wrapper_login_interface_c1">
            <h2>Froget Password!</h2>
            <form action="sendEmail" method="post">
	            <div class="login_interface_c1_user_details_block_const">
	                <p>Enter your Email</p>
	                <input id="fogot_user_email" name="fogot_email" type="text" placeholder="Enter Email">
	                 <p id="e_email" class="user_input_error_handel" style="color: red;font-size: 0.8rem;margin-top:2px">*Please enter email</p>
	            </div>
	            <p id="mm1025_pid">Back to <a href="">Sign in</a></p>
	            <div class="login_interface_c1_user_froget_password_link" >
	                <!-- <a href="">Froget Password?</a> -->
	            </div>
	            <span id="m02_free_space"></span>
	            <div class="login_btn_user_inputbtn_c025">
	                <button type="submit">Send</button>
	            </div>
            </form>
            <div class="style_sologo_text_c035">
                <div class="item"></div>
                <p id="m03_add_custom_css">Or Sign in</p>
                <div class="item"></div>
            </div>
            <span id="m03_free_space"></span>
            <div class="login_interface_c1_user_clickable_btn">
                <button type="button">
                    <div class="google_btn_m02">
                        <img src="Assert/google.png" width="20" height="20" alt="" srcset="">
                        <p>Log in with Google</p>
                    </div>
                </button>
                <button type="button">
                    <div class="apple_btn_m02">
                        <img src="Assert/apple-logo.png" width="20" height="20" alt="" srcset="">
                        <p>Log in with Apple</p>
                    </div>
                </button>
            </div>
            <p id="frogetpassword_user_slogon">Do you have account <a href="registe.html">Log in</a></p>
        </div>
    </div>
    <script>
   		let message = null;
	 	message = document.getElementById("fogotResponse").value;
	 	document.getElementById("e_email").style.display="none";
	 	
	 	console.log(message);
	 	if(message == "enter_email"){
	 		document.getElementById("fogot_user_email").style.border = "1px solid red";
	 		document.getElementById("e_email").style.display="block";
	 	}
	 </script>
</body>
</html>