<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>福岡なら - PlanIt</title>

<style>
    body {
        margin-top: 0px;
        margin-bottom: 0px;
        margin-left: 0px;
        margin-right: 0px;
    }
    header {
        position: sticky;
        top: 0px;
        height: 80px;
        background: white;
        color: black;
        padding-left: 20px;
        padding-right: 20px;
        padding-top: 5px;
        padding-bottom: 0px;
        display: flex;
        justify-content: space-around;
        align-items: center;
        border-bottom: 1px solid rgb(218, 209, 209);
        padding: 0px;
        margin: 0px;
        z-index: 2;
    }
    .logo:hover {
        cursor: pointer;
    }
    .bnt {
        font-family: 'Nanum Gothic';
        border-radius: 25px;
        width: 350px;
        height: 43px;
        text-align: center;
        justify-content: space-around;
        display: flex;
        border: 1.3px solid rgb(235, 232, 232);
    }
    .bnt > div:hover {
        cursor: pointer;
    }
    .bnt > div {
        font-size: 13px;
    }
    .login {
        color: rgb(135, 128, 128);
        font-size: small;
    }
    .login:hover {
        cursor: pointer;
    }
    .login2 {
        color: rgb(135, 128, 128);
        font-size: small;
        border-radius: 25px;
        border: 1px solid rgb(135, 128, 128);
        width: 155px;
        height: 25px;
        line-height: 25px;
        text-align: center;
        margin-left: 25px;
    }
    .login2:hover {
        cursor: pointer;
    }
    .midtag > div {
        border: 1.5px solid rgb(218, 209, 209);
        align-items: center;
        margin: 0px;
    }
    .midtag > div > div > div {
        border: 1px solid rgb(118, 108, 108);
    }
    div {
        display: inline-block;
        margin-left: 16px;
        font-size: 12px;
        font-weight: bold;
    }
    nav {
        display: flex;
        align-items: center;
    }






    .category {
        position: sticky;
        top: 60px;
        background: white;
        color: black;
        padding-left: 20px;
        padding-right: 20px;
        display: flex;
        justify-content: space-evenly;
        align-items: center;
        padding: 0px;
        margin: 0px;
        margin-top: -30px;
        z-index: 1;
        margin-left: 0px;
        margin-right: 0px;
        border-bottom: 1px solid rgb(218, 209, 209);
        max-height: 80px;
    }
    .category > div {
        cursor: pointer;
        padding-top: 20px;
    }
    .ca:hover {
        cursor: pointer;
        border-bottom: 2.5px solid black;
    }
    .pillter {
        padding-top: 15px ;
    }
    .pillter:hover {
        cursor: pointer;
    }

    .menu {
        display: flex;
        flex-flow: column;
        margin: 0px;
        border-radius: 25px;
        position: relative;
    }
    .menu > img {
        padding-bottom: 10px;
        transition: all 0.2s linear;
    }
    .menu > img:hover {
        cursor: pointer;
        transform: scale(1.05);
    }
    .menu >  div > div:hover {
        cursor: pointer;
    }
    main {
        display: flex;
        justify-content: center;
        justify-items: center;
    }
    .wrap {
        max-width: 1700px;
        margin: auto;
        display: flex;
        flex-flow: wrap;
        justify-content: space-around;
    }
    .itemName {
        display: flex;
        margin-left: 0px;
        justify-content: space-between;
        padding-bottom: 8px;
    }
    .itemName > div {
        font-size: medium;
    }
    .sub {
        font-size: 15px;
        color: grey;
        font-weight: lighter;
    }
    .price {
        padding-top: 15px;
        font-size: medium;
        text-align: right;
    }
    .찜 {
        font-size: 25px;
        position: absolute;
        right: 15px;
        top: 5px;
        color: rgb(236, 109, 130);
    }








    footer {
        display: flex;
        justify-content: space-around;
        background-color: white;
        border-top: 1px solid rgb(218, 209, 209);
        height: 70px;
        padding-top: 5px;
        padding-bottom: 20px;
        padding-left: 100px;
        position: fixed;
        top: 91%;
        width: 100%;
    }

    .downst > div{
        font-size: smaller;
        color: rgb(163, 162, 162);
    }
    .downner {
        width: 1650px;
        display: flex;
        justify-content: space-between;
        padding-right: 10px;
        border-bottom: 1px solid rgb(218, 217, 217);
        padding-top: 5px;
        padding-bottom: 10px;
    }


</style>

<script>
function removeCheck() {
	 if (confirm("本当にログアウトしますか。") == true){
		 window.location.href = 'http://localhost:8080/hotel/logout';//확인
	 }
	 else{   //취소
	     return false;
	 }
	}
</script>

<script src="${cpath }/resources/js/function.js" ></script>

</head>
<body>
    <header>
        <img class="logo" alt width="130" height="114" src="https://www.planit.jp/wp-content/uploads/2020/02/Transparent-Logo-300x261.png"
         onclick="location.href='master'" >
        <nav class="midtag">
            <div class="bnt">
                <div>どこでも</div>
                <div>いつでも</div>
                <div style="color: grey; font-size: 13px;">福岡で</div>
                <div><img src="resources/img/redglass.png" style="border-radius: 25px;"></div>
            </div>
        </nav>

        <c:if test="${empty userModel }">
        <nav>
            <div class="login">予約者情報入力</div>
            <div class="login2" onclick="location.href='login'">氏名 / 携帯番号</div>
        </nav>
        </c:if>

         <c:if test="${!empty userModel }">
         <nav>
         	<div class="login" onclick="location.href='modify'">"${userModel.name }"様</div>
			<div id="tblbutton" class="login2" type="button" onclick="removeCheck()">ログアウト</div>
		</nav>
        </c:if>
    </header>

    <div class="remocon">
₩₩

    </div>

    <div class="category">

		<div onclick="location.href='master'" >SHOW ALL</div>

		<form action="master" method="post">
		    <input type="hidden" name="hotel_cat" value="POOL">
		    <input type="image" name="submit" class="ca" src="resources/img/pool.png" alt="POOL" width="80" height="80">
		</form>

		<form action="master" method="post">
		    <input type="hidden" name="hotel_cat" value="BEACH">
		    <input type="image" name="submit" class="ca" src="resources/img/beach.png" alt="BEACH" width="80" height="80">
		</form>

		<form action="master" method="post">
		    <input type="hidden" name="hotel_cat" value="SNOW">
		    <input type="image" name="submit" class="ca" src="resources/img/snow.png" alt="SNOW" width="80" height="80">
		</form>

		<form action="master" method="post">
		    <input type="hidden" name="hotel_cat" value="KAN">
		    <input type="image" name="submit" class="ca" src="resources/img/ryokan.png" alt="KAN" width="80" height="80">
		</form>

		<form action="master" method="post">
		    <input type="hidden" name="hotel_cat" value="SIMA">
		    <input type="image" name="submit" class="ca" src="resources/img/dockdo.png" alt="SIMA" width="80" height="80">
		</form>


        <img class="pillter" src="resources/img/filter.png" alt width="84" height="48">
    </div>

    <br><br>

    <main class="wrap">

		<c:forEach var="hotel" items="${hotelList }" >

	    	<div class="menu">
	            <div class="menu" >
	            	
	                <a href="<c:url value='/hotelPage'/>?name=${hotel.name}">
	                <img class="menu" src="resources/img/<c:out value="${hotel.savedfile1 }" />" alt width="300.8" height="285.75">
	                </a>
	                <div class="찜">♥</div>
	                <br>
	                <div class="itemName">
	                    <div><c:out value="${hotel.name }" /></div>
	                    <div style="font-size: 12px;">${hotel.address }</div>
	                </div>
	                <div class="sub" style="font-size: 12px;">${hotel.short_com1 }</div>
	                <div class="sub" style="font-size: 12px;">${hotel.short_com2 }</div>
	                <div class="price"> tell) ${hotel.phone_num }</div>
	                <ul><br><br></ul>
	            </div>
        	</div>

		</c:forEach>

	</main>

        <br><br><br><br>
    <footer>
        <div>

            <div class="downner">
                <div>
                    <div>@ 2022 PlanIt, lnc.</div>

                    <div>個人情報処理方針</div>
                    <div>利用規約</div>
                    <div>サイトマップ</div>
                    <div>韓国の変更された払い戻し政策</div>
                    <div>会社の詳細情報</div>

                </div>

                <div>
                    <div>@ 日本語(JP)</div>
                    <div>\ JPY</div>
                    <div>支援および参考資料</div>
                </div>
            </div>

            <div class="downst">
                <div>웹사이트 제공자: PanIt Ireland UC, private unlimited company, 8 Hanover Quay Dublin 2, D02 DP23 Ireland | 이사: 安材訓, イソンジュン | VAT 번호: IE9827384L | 사업자 등록 번호: IE 511825 | 연락처: nackgee01@naver.com, 웹사이트, 080-4143-3261 | 호스팅 서비스 제공업체: 아마존 웹서비스 | 플랜잇은 통신판매</div>
                <div>중개자로 플랜잇 플랫폼을 통하여 게스트와 호스트 사이에 이루어지는 통신판매의 당사자가 아닙니다. 플랜잇 플랫폼을 통하여 예약된 숙소, 체험, 호스트 서비스에 관한 의무와 책임은 해당 서비스를 제공하는 호스트에게 있습니다.</div>
            </div>

        </div>
    </footer>


    <script>
	window.addEventListener('load', loadHandler)
	window.addEventListener('scroll' , scrollHandler)
	</script>



</body>
</html>