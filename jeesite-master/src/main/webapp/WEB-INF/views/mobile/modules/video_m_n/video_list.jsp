<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<meta name="format-detection" content="email=no">
<meta name="wap-font-scale" content="no">
<title>影视列表</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="author" content="Jason">
<link href="${pageContext.request.contextPath}/static/video_m_n/css/style.css" type="text/css" rel="stylesheet" media="screen" />
<script type="text/javascript" src="${pageContext.request.contextPath}/static/video_m_n/myjs/jquery-1.12.4.min.js"></script>
</head>

<body>
<header class="header pr">影视专区<a href="" class="back pa">&lt;返回</a><a href="" class="search-icon pa">搜索</a></header>
<section class="list-box clearfix">
	<section class="links clearfix">
     <a href="">电视剧</a><a href="">电影</a><a href="">专题片</a>
    </section>
    <section class="list-box-con clearfix">
    	<header>电视剧<a href="">更多&gt;</a></header>
        <ul class="list-box-con-s clearfix">
        	<c:choose>
        		<c:when test="${not empty map.tv }">
        			<c:forEach items="${map.tv }" var="tv">
        				<li><a href=""><img src="${tv.video_photo_url }" /><em>${tv.video_name }</em><span>电视剧</span></a></li>
        			</c:forEach>
        		</c:when>
        	</c:choose>
        	
        </ul>
    </section>
    <section class="list-box-con clearfix">
    	<header>电影<a href="">更多&gt;</a></header>
        <ul class="list-box-con-s clearfix">
        	<c:choose>
        		<c:when test="${not empty map.movie }">
        			<c:forEach items="${map.movie }" var="movie">
        				<li><a href=""><img src="${movie.video_photo_url }" /><em>${movie.video_name }</em><span>电影</span></a></li>
        			</c:forEach>
        		</c:when>
        	</c:choose>
        	
        </ul>
    </section>
    <section class="list-box-con clearfix">
    	<header>专题片<a href="">更多&gt;</a></header>
        <ul class="list-box-con-s clearfix">
        	<c:choose>
        		<c:when test="${not empty map.subject }">
        			<c:forEach items="${map.subject }" var="subject">
        				<li><a href=""><img src="${subject.video_photo_url }" /><em>${subject.video_name }</em><span>专题片</span></a></li>
        			</c:forEach>
        		</c:when>
        	</c:choose>
        	
        </ul>
    </section>
</section>
</body>
</html>