<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" href="css/bootstrap-theme.css" />
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.js"></script>

		<style type="text/css">
			body {
				background-color: #ace;
				font-size: 16px;
			}

			.form {
				background: rgba(255, 255, 255, 0.6);
				position: absolute;
				top:150px;
				right: 80px;
				width: 300px;
			}
			
			.bg{
				margin: 0 auto;
				background-image: url(img/800-500.png);
				background-size: cover;
				background-repeat: no-repeat;
				opacity: 0.9;
				width: 100%;
				height: 550px;
				margin-top: 100px;
				position: relative;
			}
			
			.create{
				color: #000000;
				}
			
		</style>


	</head>
	<body>
		<!-- 登录表单 -->
		<div class="container">
			<div class="bg">
			<div class="form row">
				<form class="form-horizontal col-md-offset-2 col-sm-offset-2 col-xs-offset-2" id="login_form" method="post">
					<h3 class="form-title">系统登陆</h3>
					<div class="col-sm-10 col-md-10 col-xs-10 ">
						<div class="form-group">
							<br>
							<input class="form-control required" type="text" placeholder="id" name="id" autofocus="autofocus"
							 maxlength="20" />
						</div>
						<div class="form-group">
							<br>
							<input class="form-control required" type="password" placeholder="密码" name="password" maxlength="8" />
						</div>
						<div class="form-group">
							<hr />
							<a href="zhuce.html" id="register_btn" class="create">创建一个账户</a>
						</div>
						<div class="form-group">
							<input type="submit" class="btn btn-success pull-right" value="登录" />
						</div>
					</div>
				</form>
			</div>
			</div>
		</div>

	</body>
	<script type="text/javascript">
		$(document).ready(function(e) {
		
			$(".btn").click(function(){
				
				
				
				$.ajax({
					 
					url:"userlogin",
					data:$('#login_form').serialize(),
					type:"POST",				
					dataType:"text",
					async: false,
					success: function(data)
					{
						
						alert(data);
					},		
					 error:function (jqXHR, textStatus, errorThrown) {
						　　alert("进入error---");
				　　　　　　　　alert("状态码："+jqXHR.status);
				　　　　　　　
			            }

					});
				})
		});
	</script>
</html>
    
