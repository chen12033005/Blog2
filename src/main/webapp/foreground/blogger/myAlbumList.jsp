<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no,minimal-ui">
  <title>相册列表</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/common.css">
</head>

<body>
  <ul id="list">
  </ul>
  <script src="${pageContext.request.contextPath}/static/js/lazy-load-img.js"></script>
  <script>
    (function () {
      var ul = document.getElementById('list')
      for (var i = 1; i <= 21; i++) {
        var li = document.createElement('li')
        li.innerHTML = '<img src="${pageContext.request.contextPath}/static/userImages/images/default.png" data-src="${pageContext.request.contextPath}/static/userImages/images/' + i + '.jpg">'
        ul.appendChild(li)
      }
      var lazyLoadImg = new LazyLoadImg({
    	  el: document.querySelector('#list'),
          mode: 'default', //默认模式，将显示原图，diy模式，将自定义剪切，默认剪切居中部分
          time: 300, // 设置一个检测时间间隔
          complete: true, //页面内所有数据图片加载完成后，是否自己销毁程序，true默认销毁，false不销毁
          position: { // 只要其中一个位置符合条件，都会触发加载机制
            top: 0, // 元素距离顶部
            right: 0, // 元素距离右边
            bottom: 0, // 元素距离下面
            left: 0 // 元素距离左边
          },
          diy: { //设置图片剪切规则，diy模式时才有效果
            backgroundSize: 'cover',
            backgroundRepeat: 'no-repeat',
            backgroundPosition: 'center center'
          },
          before: function () { // 图片加载之前执行方法
          },
          success: function (el) { // 图片加载成功执行方法
            el.classList.add('success')
          },
          error: function (el) { // 图片加载失败执行方法
            el.src = './images/error.png'
          }
        })
        // lazyLoadImg.start() // 重新开启懒加载程序
        // lazyLoadImg.destroy() // 销毁图片懒加载程序
    })()
  </script>
</body>

</html>