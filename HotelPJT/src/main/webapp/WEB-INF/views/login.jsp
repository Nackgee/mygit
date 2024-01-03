<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        h1, h2, h3, h4{
            margin-top: -5px;
            margin-bottom: 5px;
        }
        body{
            font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, Helvetica Neue, sans-serif;
            width: 100%;
            display: flex;
            margin: 200px auto;
            text-align: center;
            flex-flow: column;
            justify-content: center;
            align-items: center;
            background-color: #333;
        }
        section{
            max-width: 1032px;
            height: 100%;
            text-align: center;
            padding-left: 24px;
            padding-right: 24px;
            border: 1px solid #717171;
            background-color: white;
            border-radius: 10px;
        }
        button{
            text-decoration: underline;
            font-weight: bold;
            cursor: pointer;
        }
        .account{
            font-size: 32px !important;
            font-weight: 600 !important;
            line-height: 36px !important;
        }
        .title{
            margin: 8px 0 16px;
        }
        .title > span{
            font-size: 18px;
        }
        .title > span > a{
            color: black;
            font-weight: bold;
        }
        .loginbox{
            padding: 10px 0;
            display: block;
        }
        input{
            border: 1px solid #717171;
        }
        input[type="email"], input[type="tel"]{
            width: 400px;
            margin-bottom: 10px;
            height: 45px;
            padding-left: 8px;
            border-radius:5px;
        }
        input[type="submit"], button{
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
        input[type="submit"]:hover, button:hover{
            cursor: pointer;
            opacity: 100%;
            transition-duration: 0.2s;
        }
        .logo {
        	cursor: pointer;
        }
        .setu{
        	font-size: 15px;
        	color: gray;
        }
        .errors{
        	font-size: 15px;
        	color: red;
        }

        button {
		  margin: 20px;
		  outline: none;
		}
		.custom-btn {
		  width: 130px;
		  height: 40px;
		  padding: 10px 25px;
		  border: 0.5px solid gray;
		  font-family: 'Lato', sans-serif;
		  font-weight: 500;
		  background: transparent;
		  cursor: pointer;
		  transition: all 0.3s ease;
		  position: relative;
		  display: inline-block;
		}
		.btn-3 {
  line-height: 39px;
  padding: 0;
}
.btn-3:hover{
  background: transparent;
  color: #000;
}
.btn-3 span {
  position: relative;
  display: block;
  width: 100%;
  height: 100%;
}
.btn-3:before,
.btn-3:after {
  position: absolute;
  content: "";
  left: 0;
  top: 0;
  background: gray;
  transition: all 0.3s ease;
}
.btn-3:before {
  height: 0%;
  width: 2px;
}
.btn-3:after {
  width: 0%;
  height: 2px;
}
.btn-3:hover:before {
  height: 100%;
}
.btn-3:hover:after {
  width: 100%;
}
.btn-3 span:before,
.btn-3 span:after {
  position: absolute;
  content: "";
  right: 0;
  bottom: 0;
  background: gray;
  transition: all 0.3s ease;
}
.btn-3 span:before {
  width: 2px;
  height: 0%;
}
.btn-3 span:after {
  width: 0%;
  height: 2px;
}
.btn-3 span:hover:before {
  height: 100%;
}
.btn-3 span:hover:after {
  width: 100%;
}

    </style>
</head>
<body>
	<button class="custom-btn btn-3" onclick="history.back()" style="text-decoration-line:none;" >
		<span> <- Go Back</span></button>
    <section id="loginform">
        <div>
            <div style="margin: 20px 0px 40px 0;">
            <img class="logo" alt width="130" height="114"
             src="https://www.planit.jp/wp-content/uploads/2020/02/Transparent-Logo-300x261.png"
              onclick="location.href='master'" >
                <div class="account">会員ログイン</div>
                <div class="errors">
                		<br>
						<c:out value="${message }" />
				</div>
            </div>
        </div>
        <form style="width: 460px" method="post">
            <div class="loginbox">

                <input type="email" name="email" placeholder="emailを入力してください。" required="required"/>
        	    <input type="tel" name="phone_num" placeholder="電話番号を入力してください。"  required="required" />

        	    <div class="setu" style="margin-top: 10px; margin-bottom: 10px;">電話や携帯メールで電話番号を確認します。<br>
        	    											 一般文字メッセージ料金とデータ料金がかかります。</div>
        	    <input type="submit" id="b1" value="Log In" />
            </div>
        </form>
        <button style="margin-bottom: 15px; background-color: black;" onclick="location.href='join'">会員登録</button>
    </section>




</body>
</html>