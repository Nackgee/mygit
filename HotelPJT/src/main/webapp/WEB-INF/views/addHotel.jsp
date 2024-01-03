<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="jp">
<head>
<meta charset="UTF-8">
<title>add hotel</title>
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
   margin: 100px auto;
   text-align: center;
   flex-flow: column;
   justify-content: center;
   align-items: center;
   background-color: white;
}

section {
   width: 100%;
   max-width: 1032px;
   height: 100%;
   text-align: left;
   padding-left: 24px;
   padding-right: 24px;
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

.info {
   width: 590px;
   height: 45px;
   padding: 23px 0;
   border-bottom: 1px solid #eee;
   margin: auto;
}

.box_1 {
   flex-direction: column;
   justify-content: flex-start;
   align-items: center;
   width: 595.33px;
}

.box_1>button {
   float: right;
   color: #222;
   background-color: white;
   border: 0;
   padding: 1px;
}

.box_1>button:hover {
   color: black;
}

.box_2 {
   margin-top: 4px;
   color: #717171;
   font-size: 14px;
   display: flex;
}

input {
   border: 0;
}

input[type="text"] {
   width: 180px;
}

input[type="submit"] {
   background-color: black;
   color: white;
   width: 80px;
   border-radius: 8px;
   font-size: 16px;
   font-weight: bold;
   opacity: 20%;
}

input[type="submit"]:hover {
   cursor: pointer;
   opacity: 100%;
   transition-duration: 0.2s;
}

.hidden {
   /*            display: none; */

}

img {
   margin: auto;
   display: block;
}
</style>
<section>
   <form action="addHotel" method="post" enctype="multipart/form-data">
      <!-- 이미지를 클릭하면 'master' 페이지로 이동하도록 수정 -->
      <img class="logo" alt width="130" height="114"
         src="https://www.planit.jp/wp-content/uploads/2020/02/Transparent-Logo-300x261.png"
         onclick="location.href='master'" style="cursor: pointer;">
      <div class="info">
         <div class="category_box">
            <div class="box_1">
               <span>Hotel Name</span>
            </div>
            <div class="box_2">
               <input type="text" name="name" required>
            </div>
         </div>
      </div>

      <div class="info">
         <div class="category_box">
            <div class="box_1">
               <span>Address</span>
            </div>
            <div class="box_2 lastttt">
               <input type="text" name="address" required>
            </div>
         </div>
      </div>

      <div class="info">
         <div class="category_box">
            <div class="box_1">
               <span>Phone Number</span>
            </div>
            <div class="box_2 lastttt">
               <input type="text" name="phone_num" required>
            </div>
         </div>
      </div>

      <div class="info">
         <div class="category_box">
            <div class="box_1">
               <span>Catagory</span>
            </div>
            <div class="box_2">
               <select name="hotel_cat">
                  <option disabled selected>未定</option>
                  <option value="POOL">POOL</option>
                  <option value="BEACH">BEACH</option>
                  <option value="SNOW">SNOW</option>
                  <option value="KAN">KAN</option>
                  <option value="SIMA">SIMA</option>
               </select>
            </div>
         </div>
      </div>
      <div class="info">
         <div class="category_box">
            <div class="box_1">
               <span>Image</span>
            </div>
            <div class="box_2 lastttt">
               <!-- 파일 업로드 필드 추가 -->
               <input type="file" name="file1" required> <input
                  type="file" name="file2" required> <input type="file"
                  name="file3" required>
            </div>
         </div>
      </div>
      <div class="info">
         <div class="category_box">
            <div class="box_1">
               <span>Short Comment 01</span>
            </div>
            <div class="box_2">
               <input type="text" name="short_com1" required>
            </div>
         </div>
      </div>
      <div class="info">
         <div class="category_box">
            <div class="box_1">
               <span>Short Comment 02</span>
            </div>
            <div class="box_2">
               <input type="text" name="short_com2" required>
            </div>
         </div>
      </div>
      <div class="info">
         <div class="category_box">
            <div class="box_1">
               <span>Long Comment</span>
            </div>
            <div class="box_2">
               <input type="text" name="long_com" required>
            </div>
         </div>
      </div>
      <br> <br>
      <div style="float: right; margin-right: 220px;">
         <input type="submit" value="登録">
      </div>
   </form>
</section>
</body>
</html>


