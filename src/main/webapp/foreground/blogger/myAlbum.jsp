<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
	function changeClass(obj) {
		var li = obj.parentNode; //获取父节点
		li.className = "active";
	}
</script>

<div class="row">
	<c:forEach items="${albums}" var="album">
		<a href='${pageContext.request.contextPath}/album/pictureList/${album.id}.html'>
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