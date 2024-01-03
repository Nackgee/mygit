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
    text-align: center;
  }

  .spot-name {
    text-align: center;
    margin-bottom: 20px;
  }

  .spot-photos {
    position: relative;
    max-width: 70%;
    margin: 0 auto;
    overflow: hidden;
    border-radius: 8px;
    height: 300px; /* Set a fixed height for the container */
  }

  
  .spot-photos img {
    width: 100%;
    height: auto; /* You can adjust this value as needed */
    border-radius: 8px;
    transition: transform 1s ease-in-out;
    position: absolute;
    top: 0;
    left: 0;
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
  
   .control-buttons {
    margin-top: 10px;
  }

	button {
	  margin: 5px;
	  padding: 10px;
	  cursor: pointer;
	  background-color: #555; /* Gray color, you can change it to your preferred shade */
	  color: white; /* White text color */
	  border: none; /* Remove borders */
	  border-radius: 4px; /* Add border radius */
	  text-align: center;
	  text-decoration: none;
	  display: inline-block;
	  font-size: 16px;
	}
	
	button:hover {
	  background-color: #333; /* Darker gray color on hover, adjust it accordingly */
	}


  
</style>
<script>
  document.addEventListener("DOMContentLoaded", function () {
    const images = document.querySelectorAll(".spot-photos img");
    let currentIndex = 0;

    function showImage(index) {
      images.forEach((img, i) => {
        img.style.transform = i === index ? "translateX(0)" : "translateX(100%)";
      });
    }

    function nextImage() {
      currentIndex = (currentIndex + 1) % images.length;
      showImage(currentIndex);
    }

    function prevImage() {
      currentIndex = (currentIndex - 1 + images.length) % images.length;
      showImage(currentIndex);
    }

    // Attach click event handlers to buttons
    document.getElementById("nextBtn").addEventListener("click", nextImage);
    document.getElementById("prevBtn").addEventListener("click", prevImage);
  });
</script>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
<title>Tourist Spot Detail</title>
</head>
<body>


  <div class="container">
  
  <img class="logo" alt width="130" height="114" src="https://www.planit.jp/wp-content/uploads/2020/02/Transparent-Logo-300x261.png"
         onclick="location.href='master'" >
    <!-- 상단 이름 부분 -->
    <br>
    <button class="custom-btn btn-3" onclick="history.back()" style="text-decoration-line:none; left: " >
		<span > <- Go Back</span></button>
    
    <div class="spot-name">
      <h1>${hotelDTO.name}</h1> 
    </div>

    <!-- 사진 부분 -->
    <div class="spot-photos">
      <img class="menu" src="resources/img/<c:out value="${hotelDTO.savedfile1}" />" alt="Hotel Image">
      <img class="menu" src="resources/img/<c:out value="${hotelDTO.savedfile2}" />" alt="Hotel Image">
      <img class="menu" src="resources/img/<c:out value="${hotelDTO.savedfile3}" />" alt="Hotel Image">
    </div>

    <!-- Control buttons -->
    <div class="control-buttons">
      <button id="prevBtn">Before</button>
      <button id="nextBtn">Next</button>
    </div>
    <br><br>
    

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
