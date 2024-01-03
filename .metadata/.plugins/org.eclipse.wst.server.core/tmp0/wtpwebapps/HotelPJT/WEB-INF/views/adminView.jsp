<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>hotel update</title>
<style>
body {
   font-family: 'Arial', sans-serif;
   margin: 0;
   padding: 0;
   background-color: #f8f8f8;
}

.container {
   max-width: 800px;
   margin: 20px auto;
   background-color: #fff;
   padding: 20px;
   border-radius: 8px;
   box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.spot-name {
   text-align: center;
   margin-bottom: 20px;
}

.spot-photos {
   display: flex;
   justify-content: space-between;
   margin-bottom: 20px;
}

.spot-photos img {
   width: 30%;
   border-radius: 8px;
}

.spot-description {
   text-align: center;
   margin-bottom: 20px;
}

.spot-info {
   text-align: center;
}

.spot-info table {
   width: 100%;
   border-collapse: collapse;
   margin-top: 20px;
}

.spot-info td {
   padding: 10px;
   border-bottom: 1px solid #ddd;
}

.spot-info td:first-child {
   font-weight: bold;
   width: 30%;
}
</style>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
<title>Tourist Spot Detail</title>


</head>
<body>

   <div class="container">
      <!-- 상단 이름 부분 -->

      <a href="<c:url value='Pdelete'/>?name=${hotelDTO.name}">delete</a>

      <br><br>
      <div class="spot-name">
         <h1>${hotelDTO.name}</h1>
      </div>

      <!-- 사진 부분 -->
      <div class="spot-photos">
               <img class="menu" src="resources/img/<c:out value="${hotelDTO.savedfile1}" />" alt="Hotel Image" width="300.8" height="285.75">
               <img class="menu" src="resources/img/<c:out value="${hotelDTO.savedfile2}" />" alt="Hotel Image" width="300.8" height="285.75">
               <img class="menu" src="resources/img/<c:out value="${hotelDTO.savedfile3}" />" alt="Hotel Image" width="300.8" height="285.75">
      </div>

      <!-- 소갯말 부분 -->
      <div class="spot-description">
         <p>${hotelDTO.long_com}</p>
      </div>
      <br> <br> <br> <br>
      <!-- 기본 정보 부분 -->
      <div class="spot-info">
         <table>
            <c:if test="${not empty hotelDTO.address}">
               <tr>
                  <td>주소</td>
                  <td>${hotelDTO.address}</td>
               </tr>
            </c:if>
            <c:if test="${not empty hotelDTO.phone_num}">
               <tr>
                  <td>전화번호</td>
                  <td>${hotelDTO.phone_num}</td>
               </tr>
            </c:if>
            <c:if test="${not empty hotelDTO.phone_num}">
               <tr>
                  <td>카테고리</td>
                  <td>${hotelDTO.hotel_cat}</td>
               </tr>
            </c:if>
            <!-- 추가적인 정보들을 원하는 만큼 추가 -->
         </table>
      </div>

   </div>
</body>
</html>