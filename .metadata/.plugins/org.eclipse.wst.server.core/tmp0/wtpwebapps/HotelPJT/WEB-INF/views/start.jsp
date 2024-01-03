<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>PlanIt Trip</title>
  <style>
    body {
      padding: 0;
      border: none;
      margin: auto;
      font-family: 'Arial', sans-serif;
      background: white;
;
    }

    header {
      background: url('background_image.jpg') center/cover no-repeat;
      color: #fff;
      text-align: center;
      padding: 0px;
      height: 100vh; /* Set the height of the banner to 100% of the viewport height */
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
    }

    #logo {
      width: 100px; /* Adjust as needed */
      height: auto;
    }

    h1, p {
      margin: 10px 0;
    }

    #search-bar {
      padding: 10px;
      margin: 20px;
      width: 60%;
      font-size: 16px;
    }

    #featured-destinations {
      display: flex;
      justify-content: space-around;
      margin: 20px;
    }

    .destination {
      text-align: center;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 5px;
      width: 30%;
      background: rgba(255, 255, 255, 0.8);
    }

    #book-now-btn {
      background: #1EDDFF;
      color: #fff;
      padding: 15px 30px;
      font-size: 18px;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    #social-icons {
      margin-top: 20px;
    }

    .social-icon {
      margin: 0 10px;
      width: 30px;
      height: 30px;
      object-fit: cover;
      border-radius: 50%;
    }
     .main_image {
    position: relative;

  }
  	.main_image:hover {
  		cursor: pointer;
  	}
  .main_image_text {
    position: absolute;
    top: 40%;
    left: 50%;
    transform: translate( -50%, -50% );
    color: white;
  }

  </style>
</head>
<body>

  <header>
    <img class="logo" alt width="260" height="228"
             src="https://www.planit.jp/wp-content/uploads/2020/02/Transparent-Logo-300x261.png"
              onclick="location.href='start'"
              style="cursor: pointer;" >
    <h1>Explore the World with Us!</h1>
    <p>Discover Amazing Destinations and Adventures</p>

    <input type="text" id="search-bar" placeholder="調べたい場所を入力してください。">

    <div id="featured-destinations">

		<p>Details</p>
		<div class="main_image">
        	<img src="https://a.cdn-hotels.com/gdcs/production9/d1110/4de47580-21c8-445f-ad4d-f9d767f46a52.jpg?impolicy=fcrop&w=1600&h=1066&q=medium"
        	 style="width: 160px; height: auto; border-radius: 10%;" alt="Destination 1">
			<h1 class="main_image_text" style="font-size:35px">TOKYO</h1>
        </div>
        <p>Details</p>

		<div class="main_image">
        <img src="https://rimage.gnst.jp/livejapan.com/public/article/detail/a/20/00/a2000366/img/basic/a2000366_main.jpg"
        	 style="width: 160px; height: auto; border-radius: 10%;" alt="Destination 1">
        	 <h1 class="main_image_text" style="font-size:35px">OSAKA</h1>
		</div>
        <p>Details</p>

		<div class="main_image" onclick="location.href='master'">
         <img src="https://www.crossroadfukuoka.jp/storage/tourism_attractions/12343/responsive_images/Xe2DsFgtzeQmkTADNBhziwV6MfGNB2Ck99CIEP8g__1690_1125.jpg"
        	 style="width: 160px; height: auto; border-radius: 10%;" alt="Destination 1">
        	 <h1 class="main_image_text" style="font-size:35px">FUKU</h1>
        </div>
        <p>Details</p>
    </div>

    <button id="book-now-btn">Go To Japan</button>

    <!-- <div id="social-icons">
      <img class="social-icon" src="facebook_icon.png" alt="Facebook">
      <img class="social-icon" src="twitter_icon.png" alt="Twitter">
      <img class="social-icon" src="instagram_icon.png" alt="Instagram">
    </div> -->
  </header>

</body>
</html>