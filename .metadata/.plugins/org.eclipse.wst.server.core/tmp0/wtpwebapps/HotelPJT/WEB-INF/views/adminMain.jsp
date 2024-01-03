<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
   <h2>게시글 목록</h2>

   <h2><a href="addHotel">Add!!!!</a></h2>

   <main class="wrap">
      <c:forEach var="hotel" items="${hotelList}">
         <div class="menu">
            <div class="menu">
               <a href="<c:url value='/adminView'/>?name=${hotel.name}"> <img
                  class="menu"
                  src="resources/img/<c:out value="${hotel.savedfile1}" />"
                  alt="Hotel Image" width="300.8" height="285.75">
                  <div class="itemName">
                     <div>
                        <c:out value="${hotel.name}" />
                     </div>
                  </div>
               </a>
               <ul>
                  <br>
                  <br>
               </ul>
            </div>
         </div>
      </c:forEach>
   </main>
   <%-- 예시 데이터 (나중에 데이터베이스에서 가져오도록 변경 가능) --%>
   <%-- 각 게시글은 제목과 글쓴이 정보를 포함 --%>
   <div>
      <a href="view.jsp?id=1"></a>
   </div>

</body>
</html>