<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<script type="text/javascript">
	function checkData() {

		var q = document.getElementById("q").value.trim();
		if(q == null || q == "") {
			alert("请输入您要查询的关键字！");
			return false;
		} else {
			return true;
		}
	}
</script>

<nav class="navbar navbar-default navbar-fixed-top">
<div class="col-md-12">	
	  <div class="container-fluid">				    
	    <!-- Collect the nav links, forms, and other content for toggling -->
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	      <ul class="nav navbar-nav">
	      	<li><a class="navbar-brand" href="${pageContext.request.contextPath}/index.html" onclick="changeClass(this)">博客首页</a></li>
	        <li><a class="navbar-brand" href="${pageContext.request.contextPath}/blogger/aboutme.html" onclick="changeClass(this)">博主简历</a></li>
	        <li><a class="navbar-brand" href="${pageContext.request.contextPath}/blogger/myalbum.html" onclick="changeClass(this)">我的相册</a></li>
	        <li><a class="navbar-brand" href="${pageContext.request.contextPath}/blogger/resource.html" onclick="changeClass(this)">资源小站</a></li>
	        <!-- <li><a class="navbar-brand" href="#" target="blank">我的CSDN</a></li> -->
	      </ul>
	      <form action="${pageContext.request.contextPath}/blog/search.html" class="navbar-form navbar-right" role="search" method="post" onsubmit="return checkData()">
	        <div class="form-group">
	          <input type="text" id="q" name="q" value="${q }" class="form-control" placeholder="请输入要查询的关键字">
	        </div>
	        <button type="submit" class="btn btn-default">搜索</button>
	      </form>
	    </div><!-- /.navbar-collapse -->
	  </div><!-- /.container-fluid -->
</div>
</nav>
<!-- 
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand mycolor" href="/blog?pageNum=1">
                <strong>
                <div style="font-size:150%">MYBLOG</div>
            </strong>
            </a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="blog-nav-item active" id="blog"><a href="/blog?pageNum=1" class="mycolor">博客</a></li>
                <li class="blog-nav-item" id="home"><a href="/home" class="mycolor">关于</a></li>
                <li class="blog-nav-item" id="edit"><a href="/jsp/console/xietong/xietong.jsp" class="mycolor">控制台</a>
                </li>
            </ul>
            <form class="navbar-form navbar-right" action="/blog/query" id="queryBlog">
                <div class="box">
                    <i class="fab fa-sistrix fa-lg"></i>
                    <input name="pageNum" value="1" style="display:none;">
                    <input name="category" id="category" style="display:none;">
                    <input type="text" class="form-control" placeholder="Search..." name="keyword" onkeypress="query()">
                </div>
            </form>
        </div>
    </div>
</nav> -->
