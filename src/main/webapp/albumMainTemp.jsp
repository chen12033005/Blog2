<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/blog.css">
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>
<title>${title }</title>
<script type="text/javascript">
	function changeClass(obj) {
		var li = obj.parentNode; //获取父节点
		li.className = "active";
	}
</script>
<style type="text/css">
	body{
		padding-top:60px;
		padding-bottom:40px;
		background-color: #F5F5F5;
		font-family: microsoft yahei;
	}
	.position{
		position:fixed;
		left: 995px;
	    /* top: -250px; */ 
		width: 23.7%;
	}
	 .thumbnail>img, .thumbnail a>img, .carousel-inner>.item>img, .carousel-inner>.item>a>img{
		    width: 100%;
		}
	@media (min-width: 1000px){
		 .thumbnail>img, .thumbnail a>img, .carousel-inner>.item>img, .carousel-inner>.item>a>img{
		    height: 200;
		}
	}	
	.thumbnail .caption {
	    height: 160px;
	} 
</style>
</head>

<body>
	
		
<div class="container">
	<div class="row" style="padding-top: 20px">
		<jsp:include page="/foreground/common/menu.jsp"/>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row">
			<c:forEach items="${albums}" var="album">
			<a href='${pageContext.request.contextPath}/foreground/blogger/myAlbumList.jsp'>
				 <div class="col-md-4">
					<div class="thumbnail" >
						<img alt="300x200" src="${pageContext.request.contextPath}${album.albumPhoto }" />
						<div class="caption" >
							<h3>
								${album.title }
							</h3>
							<p class="miaoshu">
								${album.summary }
							</p>
							<!-- <p>
								 <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
							</p> -->
						</div>
					</div>
				</div>
				</a>	
			</c:forEach>
			</div>
		</div>
	</div>
</div>
<script>
$("p.miaoshu").each(function(){
	var maxWidth=110;
	if($(this).text().length>maxWidth){
	    $(this).text($(this).text().substring(0,maxWidth));
	    $(this).html($(this).html()+'…');
	}
	});	 
</script>	
</body>
</html>
