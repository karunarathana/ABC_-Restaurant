<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<link rel="stylesheet" href="CSS/admin.css">
<Script defer src="Js/admin.js"></Script>
</head>
<body>
<div class="main_wrapper_broker_page">
        <div class="body_container_main_wrapper">
            <div class="letf_warpper">
                <div class="left_wrapper_content">
                    <h2>Good Morning</h2>
                    <div class="left_nav_bar">
                        <div class="left_nav_bar_items" id="home_btn">
                            <div>
                                <img src="Assert/home.png" width="25" height="25" alt="" srcset="" />
                            </div>
                            <p>Home</p>
                        </div>
                        <div class="left_nav_bar_items" id="m_payment_btn">
                            <div>
                                <img src="Assert/project-management.png" width="25" height="25" alt=""
                                     />
                            </div>
                            <p>Customers</p>
                        </div>
                        <div class="left_nav_bar_items" id="res_btn">
                            <div>
                                <img src="Assert/support.png" width="25" height="25" alt="" srcset="" />
                            </div>
                            <p>Branches</p>
                        </div>
                        <div class="left_nav_bar_items" id="set_btn">
                            <div>
                                <img src="Assert/settings.png" width="25" height="25" alt="" srcset="" />
                            </div>
                            <p>Setting</p>
                        </div>
                    </div>
                    <div class="user_profile_image_main_wrapper">
                        <div class="user_profile_image"></div>
                        <div class="online_indicator"></div>
                        <p>Super Admin</p>
                    </div>
                </div>
            </div>
            <div class="middle_wrapper">
                <div class="home" id="page1">
                    <div class="middle_wraper_container">
                        <div class="special_div">
                            <div class="header_text">
                                <h2>Super Admin</h2>
                                <p>Dashbord</p>
                            </div>
                            <div class="first_indicator">
                                <img src="Assert/card_total_revenue.png" width="100%" height="100%" alt="" srcset="">
                            </div>
                            <div class="second_indicator">
                                <div class="second_mo1">
                                    <div class="mo1_items mo2_item1">
                                        <img src="Assert/pieChart.png" width="100%" height="100%" alt="" srcset="">
                                    </div>
                                    <div class="mo1_items mo2_item2">2</div>
                                </div>
                                <div class="second_mo1">
                                    <div class="mo1_items mo2_item3">
                                        <img src="Assert/card_chart_order.png" width="100%" height="100%" alt=""
                                            srcset="">
                                    </div>
                                    <div class="mo1_items mo2_item4">5</div>
                                </div>
                            </div>
                        </div>
                        <div class="right_wrapper">
                            <div class="right_wrapper_indicator">
                                <h2 id="h001">Indicator</h3>
                                    <div class="no_brach">
                                        <h2>Branches</h2>
                                        <h3>15 +</h3>
                                    </div>
                                    <div class="no_brach">
                                        <h2>Customers</h2>
                                        <h3>1</h3>
                                    </div>
                                    <div class="no_brach">
                                        <h2>Revenue</h2>
                                        <h3>100.00</h3>
                                    </div>
                                    <div class="no_brach">
                                        <h2>Profit</h2>
                                        <h3>50.00</h3>
                                    </div>
                                    <div class="no_brach">
                                        <h2>B Customers</h2>
                                        <h3>8 +</h3>
                                    </div>
                                    <div class="add_im">
                                        <img src="Assert/banner.png" width="100%" alt="" srcset="">
                                    </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="m_payment" id="page2">
                    <h2>Customers</h2>
                    <div class="c_user_component">
                       <form action="">
                        <input type="search" placeholder="UserName">
                        <button>Search</button>
                       </form>
                    </div>
                    <table id="customers">
                        <tr>
                            <th>User Name</th>
                            <th>Email</th>
                            <th>Password</th>
                            <th>Role</th>
                            <th>Query</th>
                        </tr>
                        <tr>
                            <td>Pethum Nissanka</td>
                            <td>pathum@gmail.com</td>
                            <td>12345</td>
                            <td>Active</td>
                            <td>
                                <div>
                                    <button id="del_btn">Delete</button>
                                    <button id="edi_btn">Update</button>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>Pethum Nissanka</td>
                            <td>pathum@gmail.com</td>
                            <td>12345</td>
                            <td>Active</td>
                            <td>
                                <div>
                                    <button id="del_btn">Delete</button>
                                    <button id="edi_btn">Update</button>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>Pethum Nissanka</td>
                            <td>pathum@gmail.com</td>
                            <td>12345</td>
                            <td>Active</td>
                            <td>
                                <div>
                                    <button id="del_btn">Delete</button>
                                    <button id="edi_btn">Update</button>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>Pethum Nissanka</td>
                            <td>pathum@gmail.com</td>
                            <td>12345</td>
                            <td>Active</td>
                            <td>
                                <div>
                                    <button id="del_btn">Delete</button>
                                    <button id="edi_btn">Update</button>
                                </div>
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="reservation" id="page3">
                    <h2>Braches</h2>
                    <div class="add_branches_compo">
                        <p>Add Branches</p>
                        <form action="">
                            <input type="text" name=""  placeholder="Resturent City">
                            <input type="password" name=""  placeholder="Password">
                            <input type="text" name="" placeholder="Contact Info">
                            <div class="sub_comp">
                               <button>Add</button>
                            </div>
                        </form>
                    </div>
                    <table class="t_compo" id="customers">
                        <tr>
                            <th>RestaurantID</th>
                            <th>City</th>
                            <th>Password</th>
                            <th>ContactInfo</th>
                            <th>Query</th>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Kurunegala</td>
                            <td>12345</td>
                            <td>+94719208046</td>
                            <td>
                                <div>
                                    <button id="del_btn">Delete</button>
                                    <button id="edi_btn">Edit</button>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Kurunegala</td>
                            <td>12345</td>
                            <td>+94719208046</td>
                            <td>
                                <div>
                                    <button id="del_btn">Delete</button>
                                    <button id="edi_btn">Edit</button>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Kurunegala</td>
                            <td>12345</td>
                            <td>+94719208046</td>
                            <td>
                                <div>
                                    <button id="del_btn">Delete</button>
                                    <button id="edi_btn">Edit</button>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Kurunegala</td>
                            <td>12345</td>
                            <td>+94719208046</td>
                            <td>
                                <div>
                                    <button id="del_btn">Delete</button>
                                    <button id="edi_btn">Edit</button>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Kurunegala</td>
                            <td>12345</td>
                            <td>+94719208046</td>
                            <td>
                                <div>
                                    <button id="del_btn">Delete</button>
                                    <button id="edi_btn">Edit</button>
                                </div>
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="setting" id="page4">
                    <h2>Setting</h2>
                </div>
            </div>
        </div>
</body>
</html>