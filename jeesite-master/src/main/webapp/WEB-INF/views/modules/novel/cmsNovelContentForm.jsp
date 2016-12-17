<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>描述管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			//$("#name").focus();
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/novel/cmsNovelChapter/">章节列表</a></li>
		<li class="active"><a href="${ctx}/novel/cmsNovelContent/form?id=${cmsNovelContent.id}">描述${not empty cmsNovelContent.id?'修改':'添加'}</a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="cmsNovelContent" action="${ctx}/novel/cmsNovelContent/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>	
			<div class="control-group">
			<label class="control-label">小说标题：</label>
			<div class="controls">
				<form:input path="novelName" htmlEscape="false" maxlength="50" class="input-xlarge "/>
			</div>
		</div>	
		<%-- <div class="control-group">
			<label class="control-label">图示id：</label>
			<div class="controls">
				<form:input path="novelId" htmlEscape="false" maxlength="18" class="input-xlarge  digits"/>
			</div>
		</div> --%>
		<div class="control-group">
			<label class="control-label">所属章节：</label>
			<div class="controls">
			
				<%-- <form:input path="chapterId" htmlEscape="false" maxlength="18" class="input-xlarge  digits"/> --%>
				<input type="text" name="chaptername" htmlEscape="false" maxlength="18" class="input-xlarge  digits" value="${cmsNovelContent.chaptername}" disabled="disabled"/>
				<input type="hidden" value="${cmsNovelContent.novelId}" name="novelId"/>
				<input type="hidden" value="${cmsNovelContent.chapterId}" name="chapterId"/>
			</div>
		</div>
	
		<div class="control-group">
			<label class="control-label">小说内容：</label>
			<div class="controls">
				<form:textarea id="novelContent" htmlEscape="true" path="" rows="4" maxlength="200" class="input-xxlarge" name="novelContent"/>
				<sys:ckeditor replace="novelContent" uploadPath="/cms/novel" />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">createtime：</label>
			<div class="controls">
				<input name="createtime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${cmsNovelContent.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="form-actions">
		<input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>