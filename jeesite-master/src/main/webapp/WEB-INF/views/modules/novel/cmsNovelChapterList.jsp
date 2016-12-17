<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>章节管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/novel/cmsNovelChapter/">章节列表</a></li>
		<%-- <li><a href="${ctx}/novel/cmsNovelChapter/form">章节修改</a></li> --%>
	</ul>
	<form:form id="searchForm" modelAttribute="cmsNovelChapter" action="${ctx}/novel/cmsNovelChapter/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<label>章节名称：</label><form:input path="chaptername" htmlEscape="false" maxlength="50" class="input-small"/>&nbsp;
	    <li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
	    <li class="clearfix"></li>
	
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>ID</th>
				<th>章节名称</th>
				<th>所属图书</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="cmsNovelChapter">
			
			<tr>
				<td>${cmsNovelChapter.id}</td>
				<td>${cmsNovelChapter.chaptername}</td>
				<td>${cmsNovelChapter.novelName}</td>
				<td>
    				<a href="${ctx}/novel/cmsNovelChapter/form?id=${cmsNovelChapter.id}">修改</a>
					<a href="${ctx}/novel/cmsNovelChapter/delete?id=${cmsNovelChapter.id}" onclick="return confirmx('确认要删除该章节吗？', this.href)">删除</a>
					<a href="${ctx}/novel/cmsNovelContent/form?chapterId=${cmsNovelChapter.id}&chaptername=${cmsNovelChapter.chaptername}&novelId=${cmsNovelChapter.novelId}">添加内容</a>
					<a href="${ctx}/novel/cmsNovelContent/form?id=${cmsNovelChapter.id}">添加内容</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>