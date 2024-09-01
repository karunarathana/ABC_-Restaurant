<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Restaurant Staff</title>
<link rel="stylesheet" href="CSS/branch.css">
<Script defer src="Js/branch.js"></Script>
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
                <img src="Assert/project-management.png" width="25" height="25" alt="" srcset="" />
              </div>
              <p>M/Payments</p>
            </div>
            <div class="left_nav_bar_items" id="res_btn">
              <div>
                <img src="Assert/support.png" width="25" height="25" alt="" srcset="" />
              </div>
              <p>Reservations</p>
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
            <p>BTX-kurunegala</p>
          </div>
        </div>
      </div>
      <div class="middle_wrapper">
        <div class="home" id="page1">
          <div class="middle_wraper_container">
            <div class="special_div">
              <div class="header_text">
                <h2>Branch Kurunegala</h2>
                <p>Welcome Page</p>
              </div>
              <div class="first_indicator"></div>
              <div class="second_indicator">
                <div class="second_mo1">
                  <div class="mo1_items mo2_item1">1</div>
                  <div class="mo1_items mo2_item2">2</div>
                </div>
                <div class="second_mo1">
                  <div class="mo1_items mo2_item3">3</div>
                  <div class="mo1_items mo2_item4">5</div>
                </div>
              </div>
            </div>
            <div class="right_wrapper">
              <div class="right_wrapper_indicator">
                <h3>Indicator</h3>
              </div>
            </div>
          </div>
        </div>
        <div class="m_payment" id="page2">
          <h2>M payment</h2>
        </div>
        <div class="reservation" id="page3">
          <h2>Reservation</h2>
          <div class="c_user_component">
            <form action="">
              <input type="search" placeholder="UserName">
              <button>Search</button>
            </form>
          </div>
          <table id="customers">
            <tr>
              <th>NIC</th>
              <th>No of Guest</th>
              <th>Date Time</th>
              <th>Phone Number</th>
              <th>Full Name</th>
              <th>Status</th>
              <th></th>
            </tr>
            <tr>
              <td></td>
              <td></td>
              <td>12345</td>
              <td>Active</td>
              <td>

              </td>
              <td>
                <p class="status_compo">Pending</p>
              </td>
              <td>
                <div>
                  <button id="edi_btn">Update</button>
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