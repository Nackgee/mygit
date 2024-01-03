<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Host 회원 가입</title>
<style>
        h1, h2, h3, h4{
            margin-top: -5px;
            margin-bottom: 5px;
        }
        body{
            font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, Helvetica Neue, sans-serif;
            width: 100%;
            display: flex;
            margin: 100px auto;
            text-align: center;
            flex-flow: column;
            justify-content: center;
            align-items: center;
            background-color: white;
        }
        section{
            width: 100%;
            max-width: 1032px;
            height: 100%;
            text-align: left;
            padding-left: 24px;
            padding-right: 24px;
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
        .info{
            width: 590px;
            height: 45px;
            padding: 23px 0;
            border-bottom: 1px solid #eee;
            margin: auto;
        }
        .box_1{
            flex-direction: column;
            justify-content: flex-start;
            align-items: center;
            width: 595.33px;
        }
        .box_1 > button{
            float: right;
            color: #222;
            background-color: white;
            border: 0;
            padding: 1px;
        }
        .box_1 > button:hover{
            color: black;
        }
        .box_2{
            margin-top: 4px;
            color: #717171;
            font-size: 14px;
            display: flex;
        }
        input{
            border: 0;
        }
        input[type="text"]{
            width: 180px;
        }
        input[type="submit"]{
            background-color: black;
            color: white;
            width: 80px;
            border-radius: 8px;
            font-size: 16px;
            font-weight: bold;
            opacity: 20%;
        }
        input[type="submit"]:hover{
            cursor: pointer;
            opacity: 100%;
            transition-duration: 0.2s;
        }
        .hidden {
/*         	display: none; */

        }
        img{
        	margin: auto;
        	display: block;
        }

        .errors{
			color: red;
			text-align: right;
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
    <section>
    <button class="custom-btn btn-3" onclick="history.back()" style="text-decoration-line:none;" >
		<span> <- Go Back</span></button>


  		<form id="authForm2" class="hidden" method="POST">

  			<img class="logo" alt width="130" height="114"
             src="https://www.planit.jp/wp-content/uploads/2020/02/Transparent-Logo-300x261.png"
              onclick="location.href='master'"
              style="cursor: pointer;" >


            <div class="info">
                <div class="category_box">
                    <div class="box_1">
                        <span>Email</span>
                    </div>
                    <div class="box_2 lastttt">
                        <input type="text" name="email" placeholder="メールを入力してください。" required>
                    </div>
                </div>
            </div>


             <div class="info">

                <div class="category_box">
                    <div class="box_1">
                        <span>氏名</span>
                    </div>
                    <div class="box_2">
                        <input type="text" name="name" placeholder="名前を入力してください。" required>
                    </div>
                </div>
            </div>


            <div class="info">
                <div class="category_box">
                    <div class="box_1">
                        <span>性別</span>
                    </div>
                    <div class="box_2">
                        <select name="gender">
                            <option disabled selected>未定</option>
                            <option value="MALE">男</option>
                            <option value="FEMALE">女</option>
                        </select>
                    </div>
                </div>
            </div>

            <div class="info">
                <div class="category_box">
                    <div class="box_1">
                        <span>生年月日</span>
                    </div>
                    <div class="box_2">
                        <input type="date" name="birthday" value="1996-01-01" min="1960-01-01" max="2010-01-01" required>
                    </div>
                </div>
            </div>

            <div class="info" style="height: 100px;">
                <div class="category_box">
                    <div class="box_1">
                        <span>携帯番号</span>
                    </div>
                    <div class="box_2" style="padding: 8px 0; width: 545px;">
                        <input type="text" id="telx"  name="phone_num" style="font-size: 15px; color:black" placeholder="電話番号を入力" required><br><br>
                        <div id="telCheckMessage"></div>
                        <span>連絡先番号(予約が確定したゲストとPlan Itが連絡する番号)他の電話番号を追加し、番号別の使用目的を決めることができます。</span>
                    </div>
                </div>
            </div>

            <br><br>

            <div style="float: right; margin-right: 220px;">
 	           <input type="submit" value="登録">
            </div>

            <div class="errors">
						<c:out value="${message }" />
			</div>
        </form>
    </section>



</body>
</html>



