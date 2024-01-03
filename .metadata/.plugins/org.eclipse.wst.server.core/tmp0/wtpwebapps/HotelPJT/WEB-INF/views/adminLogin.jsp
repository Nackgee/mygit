<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>admin login</title>
<style>
h1, h2, h3, h4 {
   margin-top: -5px;
   margin-bottom: 5px;
}

body {
   font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto,
      Helvetica Neue, sans-serif;
   width: 100%;
   display: flex;
   margin: 200px auto;
   text-align: center;
   flex-flow: column;
   justify-content: center;
   align-items: center;
   background-color: #333;
}

section {
   max-width: 1032px;
   height: 100%;
   text-align: center;
   padding-left: 24px;
   padding-right: 24px;
   border: 1px solid #717171;
   background-color: white;
   border-radius: 10px;
}

button {
   text-decoration: underline;
   font-weight: bold;
   cursor: pointer;
}

.account {
   font-size: 32px !important;
   font-weight: 600 !important;
   line-height: 36px !important;
}

.title {
   margin: 8px 0 16px;
}

.title>span {
   font-size: 18px;
}

.title>span>a {
   color: black;
   font-weight: bold;
}

.loginbox {
   padding: 10px 0;
}

input {
   border: 1px solid #717171;
}

input[type="email"], input[type="tel"] {
   width: 400px;
   margin-bottom: 10px;
   height: 45px;
   padding-left: 8px;
   border-radius: 5px;
}

input[type="submit"], button {
   width: 420px;
   background-color: #460479;
   color: white;
   height: 45px;
   border-radius: 8px;
   font-size: 15px;
   font-weight: bold;
   justify-content: center;
   opacity: 20%;
   text-decoration-line: none;
}

input[type="submit"]:hover, button:hover {
   cursor: pointer;
   opacity: 100%;
   transition-duration: 0.2s;
}

.logo {
   cursor: pointer;
}
</style>
</head>
<body>
   <section id="adminLoginform">
      <div>
         <div style="margin: 20px 0px 40px 0;">
            <img class="logo" alt width="130" height="114" src="https://www.planit.jp/wp-content/uploads/2020/02/Transparent-Logo-300x261.png">
            <div class="account">Admin Login</div>
         </div>
      </div>
      <form style="width: 460px" method="post">
         <div class="loginbox">
            <input type="text" name="admin_id" placeholder="ID" />
            <input type="password" name="password" placeholder="PASSWORD" />
            <div style="margin-top: 10px; margin-bottom: 10px;"></div>
            <input type="submit" id="b1" value="Log In" />
         </div>
      </form>
   </section>

</body>
</html>