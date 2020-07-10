<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
       
        <script type="text/javascript">
			window.onload = function() {
				resetPage();
			}
			window.onresize = function() {
				resetPage();
			}

			function resetPage() {
				var deviceWidth = document.documentElement.clientWidth,
					scale = deviceWidth / 1440;
				document.body.style.zoom = scale;
			}
		</script>
		
<meta http-equiv="X-UA-Compatible" content="IE=Edge，chrome=1">
<link rel="stylesheet" type="text/css" href="css/index.css">
    <script type="text/javascript" src="js/index.js"></script>
<style type="text/css">
        @media screen and (min-width: 300px) and (max-width: 500px) {
            body {
                background-color:lightcyan;
            }
        }
@media screen and (min-width: 501px) and (max-width:800px){
body {
background-color:lightblue;
}
}


@media screen and (min-width:801px){
body {
background-color:/*orange*/lightcyan;
}
}
*{
    margin:0px;
    padding:0px;
}




			#yi {
				width: 100%;
				/*height: 70px;*/
				height: 55px;				
				/* background: url(img/7.png); */
				/*background-color: bisque;*/
			/* 	background-color: #202329; */
					background-size: cover; 
					background-size: 100% 100%; 

			}

			#yi ul {
				float: left;
			}

			#yi ul li {
				float: left;
				height: 60px;
				line-height: 60px;
				margin-left: 10px;
				font-size: 0.8em;
				display: block;
			}

			#yi a {
				color: whitesmoke;
				vertical-align: middle;
				text-decoration: none;


			}
			#yi1 {
							float: left;
							width: 50%;
							height: 60px;						
							background-color: black;
			
						}
			
			#yi1 ul {
							float: left;
						}
			
						#yi1 ul li {
							float: left;
							height: 60px;
							line-height: 60px;
							margin-left: 10px;
							font-size: 1.1em;
							display: block;
						}
			
						#yi1 a {
							color: whitesmoke;
							vertical-align: middle;
							text-decoration: none;
			
			
						}
			
			#yi2 {
				            float: right;
							width: 50%;
							height: 60px;
							background-color: black;
			
						}
			
			#yi2 ul {
							float: right;
							
						}
			
						#yi2 ul li {
							float: left;
							height: 60px;
							line-height: 60px;
							margin-left: 10px;
							font-size: 1.1em;
							display: block;
						}
			
						#yi2 a {
							color: whitesmoke;
							vertical-align: middle;
							text-decoration: none;
			
			
						}
			
			
	#jie {
				height: 160px;
				width: 100%;
				margin: 0 auto;
				/*background: url(西恩荣耀/背景1.jpg);*/
				background-color: greenyellow;
				background-size: cover;
				background-size: 100% 100%;
			}

			#jie ul {
				z-index: 2;
				float: right;
				background-color: #4178E8;
				width: 100%;
				position: relative;
				top: 0px;
				
			}


			#jie ul li {
				width: 100px;
				height: 50px;
				line-height: 50px;
				float: left;
				margin-left: 1px;
				font-size: 14px;
				list-style: none;
				padding-left: 76px;
				text-align: center;

			}

			#jie ul li a {
				color: white;

				display: block;
				text-decoration: none;
				text-align: center;
				font-weight: bold;
			}

			#jie ul li a:hover {
				/*color: gray;*/
				color: yellow;
			/*	background-color: #0A0A0A;*/
			background-color: #427DE8;
				
			}

			#jie ul li ul {
				position: relative;
				top: 0px;
				visibility: hidden;
				/*background-color: #0A0A0A;*/
				background-color: #427DE8;

			}

			#jie ul li ul li {
				float: none;
				/*background-color: #0A0A0A;*/
				background-color: #427DE8;
				list-style: none;
				padding-left: 0;
			}

			#jie ul li ul li a {
				color: #fff;

			}

			#jie ul li:hover ul,
			#jie ul li a:hover ul {
				visibility: visible;
			}
			#chen {
				height: 432px;
				width: 1400px;
				margin: auto;
				background-color: green;
			}
			#tao{
				width: 1400px;
				height: 1740px;
				background: url(西恩荣耀/大背景.jpg);
				background-size: cover;
				background-size: 100% 100%;
				margin: auto;
			}

			#jun {
				height: 780px;
				width: 1400px;
				background-image: url(33.jpg);
				background-size: cover;
				background-size: 100% 100%;
				margin: auto;				
				
			}

			#cai {
				height: 235px;
				width: 100%;
				position: relative;
				/* background: url(西恩荣耀/背景1.jpg); */
				background-size: cover;
				background-size: 100% 100%;
			}
			
			#td {
							width: 80%;
							height: 580px;
							margin: 0 auto;
							position: relative;
						/* 	background-color: white; */
						}
			
						#sd {
							width: 100%;
							margin: 0 auto;
							height: 100%;
							background-color: white;
							overflow: hidden;
			
						}
			
						#sd img {
							width: 100%;
							height: 100%;
						}
			
						#sd ul {
							width: 100%;
							height: 100%;
						}
			
						#sd ul li {
							width: 100%;
							height: 100%;
							display: none;
			
						}
			
						#fr {
							width: 400px;
							height: 15px;			                
							position: absolute;
							/*left: 37.66%;*/
							left: 33%;
							top: 100%;
						}
			
						#fr ul li {
							list-style: none;
							width: 15px;
							height: 15px;
							float: left;
							margin-left: 24px;
							border-top-left-radius: 15px;
							border-top-right-radius: 15px;
							border-bottom-left-radius: 15px;
							border-bottom-right-radius: 15px;
							background-color: white;
							cursor: pointer;
						}
			
						#fr .select {
							background-color: #008000;
						}
						#sin{
							position: absolute;
							left: 20px;
							top: 270px;
							line-height: 70px;
							height: 70px;
							width: 50px;
							font-size: 65px;
							color:white;
							
						}
						#cos{
							position: absolute;
							right: 20px;
							top: 270px;
							line-height: 70px;
							height: 70px;
							width: 50px;
							font-size: 65px;
							color:white;							
						}
						#xxs{
							width:100%;
							height: 10px;
							margin: 0 auto;
							position: relative;
							/*background-color: white;*/
							/*background-color: #121217;	*/
							background-color: #4178E8
;						
						}
			#de1 {
				height: 40px;
				width: 100%;
				/*background-color: #121217;*/
				background-color: #4178E8
;
				position: relative;
			}
</style>
<title>响应式布局</title>
</head>


<body>
	<!--<div id="yi">
							
						</div>-->
					<div class="navbar-container">
        <!-- 左边图标和logo -->
        <div class="navbar-left">
            <a href="">
                <img src="img/logo.png" class="img1">
            </a>
            <a href="">
                <img src="img/33.png" class="img">
            </a>
        </div>
        <!-- 导航菜单-->
        <ul class="navbar-list">
            <li class="navbar-item">
                <a href="">首页</a>
            </li>
            <li class="navbar-item">
                <a href="">分页</a>
            </li>
            <li class="navbar-item">
                <a href="">新闻动态</a>
            </li>
            <li class="navbar-item">
                <a href="">个人中心</a>
            </li>
        </ul>
        <!-- 搜索框 -->
        <div class="navbar-search">
            <input type="text" class="search" placeholder="search">
            <button class="search-btn">
                <img src="./img/search.png">
            </button>
        </div>
        <!-- 登录注册 -->
        <div class="navbar-sign">
            <!--<button>个人登录</button>-->
            <input type="button" value="个人登录" onclick="denglu1()"style="background-color: #fff;padding: 0px;border: 1px solid #eee; padding: 4px 7px;border-radius: 4px; position: relative;top: 2px;">
            <input type="button" value="企业登录" onclick="#"style="background-color: #fff;padding: 0px;border: 1px solid #eee; padding: 4px 7px;border-radius: 4px; position: relative;top: 2px;">
            <input type="button" value="管理员登录" onclick="#"style="background-color: #fff;padding: 0px;border: 1px solid #eee; padding: 4px 7px;border-radius: 4px; position: relative;top: 2px;">
            <input type="button" value="注册" onclick="zhuce1()"style="background-color: #fff;padding: 0px;border: 1px solid #eee; padding: 4px 7px;border-radius: 4px; position: relative;top: 2px;">
            <!--<button>企业登录</button>
            <button>管理员登录</button>
            <button>注册</button>-->
        </div>
        <!-- 更多按钮 -->
        <!--小屏幕显示 -->
        <div class="navbar-morebox">
            <button class="more-btn">
                <img src="./img/more.png" alt="">
            </button>
        </div>
    </div>
    <!-- 手机或平板屏幕显示 -->
    <ul class="small-list" id="small-list">
        <li class="small-item">
            <a href="">首页</a>
        </li>
        <li class="small-item">
            <a href="">分页</a>
        </li>
        <li class="small-item">
            <a href="">新闻动态</a>
        </li>
        <li class="small-item">
            <a href="">个人中心</a>
        </li>
        <li class="small-item">
            <input type="text" class="search" placeholder="search">
            <button class="search-btn">
                <img src="./img/search.png">
            </button>
        </li>
        <li class="small-item">
            <button class="sign" onclick="javascript:window.location.href='http://blog.sina.com.cn/mleavs';">个人登录</button>
            <button class="sign" onclick="javascript:window.location.href='http://blog.sina.com.cn/mleavs';">企业登录</button>
            <button class="sign" onclick="javascript:window.location.href='http://blog.sina.com.cn/mleavs';">管理员登录</button>
            <button class="sign" onclick="javascript:window.location.href='http://blog.sina.com.cn/mleavs';">注册</button>
        </li>
    </ul>
	
	<div id="jie">
					<img src="img/17.png"align="center" style="height: 100%;width: 100%;">
					<ul style="padding-top: 150; ">

						<li><a href="">网站介绍</a>
							<!--<ul>
								<li >
									<a href="">      </a>
								</li>
							</ul>-->
						</li >

						<li><a href="">企业信息</a>
							<!--<ul>
								<li>
									<a href="">      </a>
								</li>
							</ul>-->
						</li>
						<li><a href="">岗位需求</a>
							<!--<ul>
								<li>
									<a href="">     </a>
								</li>
							</ul>-->
						</li>
						<li><a href="">投交简历</a>
							<!--<ul>
								<li>
									<a href="">      </a>
								</li>
							</ul>-->
						</li>
						<li><a href="">信息填报</a>
							<!--<ul>
								<li>
									<a href="">      </a>
								</li>
							</ul>-->
						</li>
						<li><a href="">进度查询</a>
							<!--<ul>
								<li>
									<a href="">      </a>
								</li>
							</ul>-->
						</li>
						<li><a href="">结果评价</a>
							<!--<ul>
								<li>
									<a href="">      </a>
								</li>
							</ul>-->
						</li>
						<li><a href="">联系客服</a>
							<!--<ul>
								<li>
									<a href="">      </a>
								</li>
							</ul>-->
							
						</li>
					
						<!--<li><a href="">OG碎梦</a>
							<ul>
								<li>
									<a href="">CN梦里的殇</a>
								</li>
							</ul>-->
							
							
					</ul>
				</div>
				<div id="td">
						<div id="fr">
							<ul>
								<li class="select"></li>
								<li></li>
								<li></li>
								<li></li>
								<li></li>
								<li></li>
								<li></li>
								<li></li>
								<li></li>
								<li></li>
							</ul>
			
						</div>
						<div id="sd">
							<ul>
								<li style="display: block;"><img src="img/6.jpg"></li>
								<li><img src="img/6.jpg"></li>
								<li><img src="img/3.jpg"></li>
								<li><img src="33.jpg"></li>
								<li><img src="img/5.jpg"></li>
								<li><img src="img/14.jpg"></li>
								<li><img src="img/6.jpg"></li>
								<li><img src="33.jpg"></li>
								<li><img src="img/5.jpg"></li>
								<li><img src="img/14.jpg"></li>
							</ul>
						</div>
						<div id="sin"style="cursor: pointer;">
							
						</div>
						<div id="cos"style="cursor: pointer;">
							
						</div>
					</div>
					<script type="text/javascript">
					function denglu1(){
						
						location.href="denglu.jsp";
					}
					function zhuce1(){
						
						location.href="zhuce.jsp";
					}
					
			var yuan = document.getElementById("fr");
			var lis1 = yuan.getElementsByTagName("li")
			var tupian = document.getElementById("sd");
			var lis2 = tupian.getElementsByTagName("li");

			var timer = null;
			var x = 0,y;
			sin.onmouseover=function(){sin.style.color="#00b106"}
			cos.onmouseover=function(){cos.style.color="#00b106"}
			sin.onmouseout=function(){sin.style.color="#FFFDFD"}
			cos.onmouseout=function(){cos.style.color="#FFFDFD"}
			sin.onclick=function(){
				clearInterval(timer);
				x--;
				if (x >= lis1.length) {
					x = 0;
				}
				if(x<0){
					x=9;
				}
				for (var j = 0; j < lis1.length; j++) {
					lis1[j].className = "";
					lis2[j].style.display = "none";
				}
				lis1[x].className = "select";
				lis2[x].style.display = "block";
				timer = setInterval(function() {
								x++;
								if (x >= lis1.length) {
									x = 0;
								}
								for (var j = 0; j < lis1.length; j++) {
									lis1[j].className = "";
									lis2[j].style.display = "none";
								}
								lis1[x].className = "select";
								lis2[x].style.display = "block";
				
							}, 1000);
			}
			cos.onclick=function(){
				clearInterval(timer);
				x++;
				if (x >= lis1.length) {
					x = 0;
				}
				for (var j = 0; j < lis1.length; j++) {
					lis1[j].className = "";
					lis2[j].style.display = "none";
				}
				lis1[x].className = "select";
				lis2[x].style.display = "block";
				timer = setInterval(function() {
								x++;
								if (x >= lis1.length) {
									x = 0;
								}
								for (var j = 0; j < lis1.length; j++) {
									lis1[j].className = "";
									lis2[j].style.display = "none";
								}
								lis1[x].className = "select";
								lis2[x].style.display = "block";
				
							}, 2000);
			}
			//tab切换
			for (var i = 0; i < lis1.length; i++) {

				lis1[i].onmouseover = function() {

					for (var j = 0; j < lis1.length; j++) {
						if (lis1[j] == this) {
							lis1[j].className = "select";
							lis2[j].style.display = "block";
						} else {
							lis1[j].className = "";
							lis2[j].style.display = "none";
						}

					}
				}
			}
			for (var i = 0; i < lis1.length; i++) {
				lis1[i].id = i;
				lis1[i].onmouseover = function() {
					clearInterval(timer);
					y=this.id;
					x = this.id;
					for (var j = 0; j < lis1.length; j++) {
						lis1[j].className = "";
						lis2[j].style.display = "none";
					}
					lis1[x].className = "select";
					lis2[x].style.display = "block";
				}
				x=y;
				lis1[i].onmouseout = function() {
					timer = setInterval(function() {
						
						
						x++;
						if (x >= lis1.length) {
							x = 0;
						}
						for (var j = 0; j < lis1.length; j++) {
							lis1[j].className = "";
							lis2[j].style.display = "none";
						}
						lis1[x].className = "select";
						lis2[x].style.display = "block";
					}, 2000)
				}
			}
			var x=0;
			timer = setInterval(function() {
				x++;
				if (x >= lis1.length) {
					x = 0;
				}
				for (var j = 0; j < lis1.length; j++) {
					lis1[j].className = "";
					lis2[j].style.display = "none";
				}
				lis1[x].className = "select";
				lis2[x].style.display = "block";

			},2000);
		</script>
				<div id="xxs"></div>
				<div id="de1">
					<p style="font-size:14px; line-height: 40px;margin-left: 20px;text-align: center;color:white;">Copyright © jiangcai chenjuncai
						All Rights Reserved |赣jxufe备2201804285号 1209805365@qq.com
						</p>
						</div>
			</div>

				
</body>
</html>