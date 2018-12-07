<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>后台管理</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css" href="/Susses/plugins/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
       <link rel="stylesheet" href="/Susses/frame/layui/css/layui.css">
    <link rel="stylesheet" href="/Susses/frame/static/css/style.css">
    <link rel="icon" href="/Susses/frame/static/image/code.png">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
    	#bgc{
    		background-color:#C4E3F3;
    	}
    </style>
  </head>
  <body id="bgc">
   <div class="container-fluid">
    	<!--1行占12列-->
    	<div class="row">
    	<div class="jumbotron text-center" style="margin-bottom:0" >
  <h1>管理员你好</h1>

		</div>
		 
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>                        
		      </button>
		      <a class="navbar-brand" href="04Admin.jsp">首页</a>
		    </div>
		    <div class="collapse navbar-collapse" id="myNavbar">
		      <ul class="nav navbar-nav">
		        <li class="dropdown">
				                <a href="#" class="dropdown-toggle" data-toggle="dropdown">会员/非会员商家管理 <b class="caret"></b>
				                </a>
				                <ul class="dropdown-menu">
				                    <li><a href="04sjxjpd.jsp" target="_blank">商家星级评定</a></li>
				                    <li><a href="04CRUD.jsp" target="_blank">会员/非会员商家信息CRUD</a></li>
				                    <li><a href="04hysh.jsp" target="_blank">会员/非会员审核</a></li>
				                    
				                </ul>
				</li>
		        <li class="dropdown">
				                <a href="#" class="dropdown-toggle" data-toggle="dropdown">外卖员管理 <b class="caret"></b></a>
				                <ul class="dropdown-menu">
				                    <li><a href="04wwysh.jsp" target="_blank">外卖员审核</a></li>
				                    <li><a href="04wwyCRUD.jsp" target="_blank">外卖员信息CRUD</a></li>
				                    
				                    
				                </ul>
				</li>
		        <li><a href="04ddgl.jsp" target="_blank">订单管理CRUD</a></li>
		        <li><a href="04tsxxgl.jsp" target="_blank">投诉信息管理</a></li>
		      </ul>
		    </div>
		    
		    
		    
		  </div>
		</nav>
		 
		<div class="container">
		    <div class="col-sm-8">	      
		      <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
<div id="main-line" style="width: 100%;height:400px;"></div>

<div id="main-bing" style="width: 100%;height:400px;"></div>

<script type="text/javascript" src="/Susses/frame/layui/layui.js"></script>
<script type="text/javascript" src="/Susses/frame/echarts/echarts.min.js"></script>
<script type="text/javascript">

    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main-line'));

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption({
        title: {
            text: '示例'
        },
        tooltip: {},
        legend: {
            data:['销量']
        },
        xAxis: {
            data: ["宫保鸡丁","宫保鸡丁","宫保鸡丁","宫保鸡丁","宫保鸡丁","宫保鸡丁"]
        },
        yAxis: {},
        series: [{
            name: '销量',
            type: 'bar',
            data: [5, 20, 36, 10, 10, 20]
        }]
    });

    // 基于准备好的dom，初始化echarts实例
    var chart = echarts.init(document.getElementById('main-bing'));

    // 配置
    chart.setOption({
        series : [
            {
                name: '访问来源',
                type: 'pie',
                radius: '55%',
                data:[
                    {value:400, name:'搜索引擎'},
                    {value:335, name:'直接访问'},
                    {value:310, name:'邮件营销'},
                    {value:274, name:'联盟广告'},
                    {value:235, name:'视频广告'}
                ]
            }
        ]
    });

    layui.use(['element'], function(){
        var element = layui.element
            ,$      = layui.jquery;

        // you code ...


    });
</script>
		      
		      
		      <!--<div class="fakeimg">图像</div>
		      <p>一些文本..</p>
		      <p>菜鸟教程，学的不仅是技术，更是梦想！！！菜鸟教程，学的不仅是技术，更是梦想！！！菜鸟教程，学的不仅是技术，更是梦想！！！</p>
		      <br>
		      <!--<h2>标题</h2>
		      <h5>副标题</h5>
		      <div class="fakeimg">图像</div>
		      <p>一些文本..</p>
		      <p>菜鸟教程，学的不仅是技术，更是梦想！！！菜鸟教程，学的不仅是技术，更是梦想！！！菜鸟教程，学的不仅是技术，更是梦想！！！</p>-->
		    </div>-->
		  </div>
		</div>
 
<div class="jumbotron text-center" style="margin-bottom:0">
  <p>底部内容</p>
</div>
    	</div>
    		
   </div>



    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="/Susses/plugins/jquery/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
   <script src="/Susses/plugins/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  </body>
</html>
