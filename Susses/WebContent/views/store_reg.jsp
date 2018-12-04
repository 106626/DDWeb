<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		 <meta http-equiv="X-UA-Compatible" content="IE=edge">
  			<meta name="viewport" content="width=device-width,height=device-height,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<title></title>
		<!--<link rel="stylesheet" type="text/css" href="/Susses/plugins/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>-->
		 <link href="/Susses/plugins/bootstrap-3.3.7-dist/css/bootstrap2.min.css" rel="stylesheet">
		<style type="text/css">
			.my-login{
			
				background: rgba(255,255,255,0.6);
				width: 500px;
				padding:50px ;
				border-radius: 20px;
				
			}
			body{
			background: url(/Susses/img/bg.jpg) no-repeat;
			background-size: cover;
			font-size: 16px;
		}
		.row{
			margin-top:50px ;
			margin-left: 400px;
		}
		.fuwu{
			font-size: 10px;
		}
		</style>
	</head>
	<body>
		<div class="container-fluid" style="margin-top: 100px;">
			<div class="row my-login">
				<form class="form-horizontal" role="form">
					<fieldset style="margin-left:80px ;">
						<legend>商家注册入口</legend>
					
<div class="form-group has-feedback">
	
    <label for="firstname" class="col-sm-5 control-label">用户名</label>
   
    <div class="col-md-10" ">
    	<span class="glyphicon glyphicon-user form-control-feedback"></span>
      <input type="text" class="form-control" id="firstname" placeholder="请输入用户名">
    </div>
    
  </div>
  
  <div class="form-group has-feedback">
    <label for="lastname" class="col-sm-5 control-label">密码</label>
    <div class="col-md-10">
      <input type="password" class="form-control" id="lastname" placeholder="请输入密码">
      <span class="glyphicon glyphicon-lock form-control-feedback"></span>
    </div>
  </div>
  
  <div class="form-group has-feedback">
	
    <label for="firstname" class="col-sm-5 control-label">餐馆类型</label>
    
    <div class="col-md-10" >
    	<span class="glyphicon glyphicon-user form-control-feedback"></span>
      <input type="text" class="form-control" id="type" placeholder="请输入类型">
    </div>
  </div>
  
  <div class="form-group has-feedback">
    <label for="lastname" class="col-sm-5 control-label">餐馆地址</label>
    <div class="col-md-10">
      <input type="text" class="form-control" id="address" placeholder="请输入地址">
      <span class="glyphicon glyphicon-lock form-control-feedback"></span>
    </div>
  </div>
  
  <div class="form-group has-feedback">
    <label for="lastname" class="col-sm-5 control-label">餐馆图片</label>
    <div class="col-md-10">
      <input id="pic" type="file" name = 'pic' accept = "image/*" onchange = "selectFile()"/>
    <!-- <button onclick = "handIn()">提交</button> -->
    <script type="text/javascript">
        //var files = document.getElementById('pic').files;
        var form = new FormData();//通过HTML表单创建FormData对象
        var url = '127.0.0.1:8080/'
        function selectFile(){
            var files = document.getElementById('pic').files;
            console.log(files[0]);
            if(files.length == 0){
                return;
            }
            var file = files[0];
            //把上传的图片显示出来
            var reader = new FileReader();
            // 将文件以Data URL形式进行读入页面
            console.log(reader);
            reader.readAsBinaryString(file);
            reader.onload = function(f){
                var result = document.getElementById("result");
                var src = "data:" + file.type + ";base64," + window.btoa(this.result);
                result.innerHTML = '<img src ="'+src+'"/>';
            }
            console.log('file',file);
            ///////////////////
            form.append('file',file);
            console.log(form.get('file'));
        }
      <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </script>
    </div>
    </div>
  
  
  
  
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label class="fuwu">
          <input type="checkbox">我已阅读并同意<a href="#">服务条款</a>
        </label>
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-success">注册</button>
         <div class="text-right"><a href="store_login.jsp" >登录已有账号</a> </div>
    </div>
  </div>
			
</fieldset>
					
</form>					
					
  
				
			</div>
		</div>
		
		<script src="/Susses/plugins/jquery/jquery.min.js"></script>
		<script src="/Susses/js/bootstrap.min.js"></script>
	
	</body>
</html>
