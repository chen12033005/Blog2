<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript">
	function changeClass(obj) {
		var li = obj.parentNode; //获取父节点
		li.className = "active";
	}
</script>
	
<div class="data_list">
	<div class="data_list_title">
		<img src="${pageContext.request.contextPath}/static/images/about_icon.png"/>&nbsp;我的相册
	</div>	
	<div class="datas">
			<ul>	
				<c:forEach items="${blogList}" var="blog">
					<li style="margin-bottom: 30px">
					  	<span class="title">
					  		<a href="${pageContext.request.contextPath}/blog/articles/${blog.id}.html">测试</a>
					  	</span>
					  <span class="img">
					  	<div class="col-md-8">
                                                                            这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章
                                                                            这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章
                                                                            这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章
                                                                            这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章这是测试文章
					  	</div>
					  		<c:forEach items="${blog.imageList }" var="image">
					  			<a href="${pageContext.request.contextPath}/foreground/blogger/myAlbumList.jsp" ><img style="margin-left: 7%;" src="${pageContext.request.contextPath}/static/userImages/0.jpg"/></a>
					  			&nbsp;&nbsp;
					  		</c:forEach>
					  		
					</li>
				</c:forEach>
				</li>
				<!-- <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:10px;" /> -->																												
			</ul>			
	</div> 
	<div style="text-align: center;">
			<nav>
			  <ul class="pagination">
			    ${pageCode }
			 </ul>
			</nav>
		</div> 	
</div>