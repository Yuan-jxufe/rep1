<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" href="css/bootstrap-theme.css" />
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.js"></script>
		<script type="text/javascript">
			function denglu1(){
			
				location.href="denglu.jsp";
			}
		
			function submit1(){
				
				$.ajax({
					 
					url:"userRegister",
					data:$('#register_form').serialize(),
					type:"POST",				
					dataType:"text",
					async: false,
					success: function(data)
					{
						if(data=="-1"){
						alert("id已存在！");
						}
						else
						alert("注册成功！")
						
					},		
					 error:function (jqXHR, textStatus, errorThrown) {
						　　alert("进入error---");
				　　　　　　　　alert("状态码："+jqXHR.status);
				　　　　　　　
			            }

					});
				
			}
		</script>

		<style>
			body {
				background: -webkit-linear-gradient(top left, #ace, #ffffff);
				font-size: 16px;
			}

			.form {
				background: rgba(255, 255, 255, 0.2);
				width: 500px;
				margin: 163px auto;
			}

			.nation {}
		</style>
	</head>
	<body>
		<div class="container">
			<div class="form row">
				<form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="register_form">
					<h3 class="form-title">创建你的账户</h3>
					<div class="col-sm-9 col-md-9">

						<div class="form-group">
							<input class="form-control required" type="text" placeholder="id" name="userid" autofocus="autofocus" required/>
						</div>
						<div class="form-group">
							<input class="form-control required" type="password" placeholder="密码" id="userpassword" name="userpassword" required />
						</div>
						<div class="form-group">
							<input class="form-control required" type="text" placeholder="姓名" name="username" autofocus="autofocus" />
						</div>

						<div class="form-group">
							<input class="form-control required" type="text" placeholder="毕业学校" name="useruniversity" autofocus="autofocus" />
						</div>
						<div class="form-group">
							<input class="form-control required" type="text" placeholder="专业" name="usermojar" autofocus="autofocus" />
						</div>
						<div class="form-group">
							<input class="form-control required" type="text" placeholder="联系电话" name="usertelephone" autofocus="autofocus" />
						</div>
						<div class="form-group">
							民&nbsp;&nbsp;族：<select class="nation " name="usernation"></select>
						</div>
						<div class="form-group">
							性&nbsp;&nbsp;别：<input type="radio" name="usersex" value="男" checked />男&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="radio" name="usersex" value="女" />女
						</div>
						<div class="form-group">
							生&nbsp;&nbsp;日： <select id="date-sel-year" name="userbrithday" rel="2015">
								<select class="sel_year" name="year"></select>年
								<select class="sel_month" name="month"></select>月
								<select class="sel_day" name="day"></select>日

						</div>

						<div class="form-group">
							<input type="submit" class="btn btn-success pull-right" onclick="submit1()" value="注册" />
							<input type="botton" class="btn btn-info pull-left" id="back_btn" onclick="denglu1()" value="返回" />
						</div>
					</div>
				</form>
			</div>
		</div>
	</body>
	<script type="text/javascript">
		var nations = ["汉族", "蒙古族", "回族", "藏族", "维吾尔族", "苗族", "彝族", "壮族", "布依族", "朝鲜族", "满族", "侗族", "瑶族", "白族",
			"土家族", "哈尼族", "哈萨克族", "傣族", "黎族", "傈僳族", "佤族", "畲族", "高山族", "拉祜族", "水族", "东乡族", "纳西族", "景颇族", "柯尔克孜族", "土族",
			"达斡尔族", "仫佬族", "羌族", "布朗族", "撒拉族", "毛南族", "仡佬族", "锡伯族", "阿昌族", "普米族", "塔吉克族", "怒族", "乌孜别克族", "俄罗斯族", "鄂温克族",
			"德昂族", "保安族", "裕固族", "京族", "塔塔尔族", "独龙族", "鄂伦春族", "赫哲族", "门巴族", "珞巴族", "基诺族"
		];
		var option = "";
		for (var i = 0; i <
			nations.length; i++) {
			option += '<option value="' +  nations[i] + '">' + nations[i] + '</option>';
		}
		$(option).appendTo(".nation");
		
		$(function () {
		// 出生年月插件
		$.ms_DatePicker({
		YearSelector: ".sel_year",
		MonthSelector: ".sel_month",
		DaySelector: ".sel_day"
		});
		});
		
		(function($){
		$.extend({
		ms_DatePicker: function (options) {
		            var defaults = {
		                YearSelector: "#sel_year",
		                MonthSelector: "#sel_month",
		                DaySelector: "#sel_day",
		                FirstText: "--",
		                FirstValue: 0
		            };
		            var opts = $.extend({}, defaults, options);
		            var $YearSelector = $(opts.YearSelector);
		            var $MonthSelector = $(opts.MonthSelector);
		            var $DaySelector = $(opts.DaySelector);
		            var FirstText = opts.FirstText;
		            var FirstValue = opts.FirstValue;
		            // 初始化
		            var str = "<option value=\"" + FirstValue + "\">" + FirstText + "</option>";
		            $YearSelector.html(str);
		            $MonthSelector.html(str);
		            $DaySelector.html(str);
		 
		            // 年份列表
		            var yearNow = new Date().getFullYear();
		            for (var i = yearNow; i >= 1900; i--) {
		                var yearStr = "<option value=\"" + i + "\">" + i + "</option>";
		                $YearSelector.append(yearStr);
		            }
		 
		            // 月份列表
		            for (var i = 1; i <= 12; i++) {
		                var monthStr = "<option value=\"" + i + "\">" + i + "</option>";
		                $MonthSelector.append(monthStr);
		            }
		 
		            // 日列表(仅当选择了年月)
		            function BuildDay() {
		                if ($YearSelector.val() == 0 || $MonthSelector.val() == 0) {
		                    // 未选择年份或者月份
		                    $DaySelector.html(str);
		                } else {
		                    $DaySelector.html(str);
		                    var year = parseInt($YearSelector.val());
		                    var month = parseInt($MonthSelector.val());
		                    var dayCount = 0;
		                    switch (month) {
		                        case 1:
		                        case 3:
		                        case 5:
		                        case 7:
		                        case 8:
		                        case 10:
		                        case 12:
		                            dayCount = 31;
		                            break;
		                        case 4:
		                        case 6:
		                        case 9:
		                        case 11:
		                            dayCount = 30;
		                            break;
		                        case 2:
		                            dayCount = 28;
		                            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
		                                dayCount = 29;
		                            }
		                            break;
		                        default:
		                            break;
		                    }
		 
		                    for (var i = 1; i <= dayCount; i++) {
		                        var dayStr = "<option value=\"" + i + "\">" + i + "</option>";
		                        $DaySelector.append(dayStr);
		                    }
		                }
		            }
		            $MonthSelector.change(function () {
		                BuildDay();
		            });
		            $YearSelector.change(function () {
		                BuildDay();
		            });
		        } // End ms_DatePicker
		});
		})(jQuery);

	</script>
</html>
