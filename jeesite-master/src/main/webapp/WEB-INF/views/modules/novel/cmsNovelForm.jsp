<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>小说管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		/* $(document).ready(function() {
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
		}); */
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/novel/cmsNovel/">小说列表</a></li>
		<li class="active"><a href="${ctx}/novel/cmsNovel/form?id=${cmsNovel.id}">小说${not empty cmsNovel.id?'修改':'添加'}</a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="cmsNovel" action="${ctx}/novel/cmsNovel/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">小说名称：</label>
			<div class="controls">
				<form:input path="novelName" htmlEscape="false" maxlength="32" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">小说作者：</label>
			<div class="controls">
				<form:input path="novelAuthor" htmlEscape="false" maxlength="32" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">小说缩略图：</label>
			<div class="controls">
				<%-- <form:input path="novelImage" htmlEscape="false" maxlength="100" class="input-xlarge " /> --%>
				<input type="hidden" id="novelImage" name="novelImage" value="${cmsNovel.novelImage}" />
				<sys:ckfinder input="novelImage" type="thumb" uploadPath="/novel" selectMultiple="false"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">小说描述：</label>
			<div class="controls">
				<%-- <form:input path="novelDesc" htmlEscape="false" maxlength="255" class="input-xlarge "/> --%>
				
                     <textarea class="form-control" rows="3" name="novelDesc" style="width: 274px">${cmsNovel.novelDesc}</textarea> 

			</div>
		</div>
		<div class="control-group">
			<label class="control-label">所属分类：</label>
			<div class="controls">
				<%-- <form:input path="novelCategory" htmlEscape="false" maxlength="2" class="input-xlarge "/> --%>
				
					<select class="combobox" name="novelCategory" id="novelCategory">
					  <option>请选择</option>
					  <option value="1" <c:if test="${'1' eq cmsNovel.novelCategory}">selected</c:if>>小说</option>
					  <option value="2" <c:if test="${'2' eq cmsNovel.novelCategory}">selected</c:if>>文学</option>
					  <option value="3" <c:if test="${'3' eq cmsNovel.novelCategory}">selected</c:if>>杂文</option>
					</select>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">小说状态：</label>
			<div class="controls">
				<%-- <form:input path="novelStatus" htmlEscape="false" maxlength="1" class="input-xlarge "/> --%>
				   <select class="combobox" name="novelStatus" id="novelStatus">
					  <option value="0" <c:if test="${'0' eq cmsNovel.novelStatus}">selected</c:if>>连载中</option>
					  <option value="1" <c:if test="${'1' eq cmsNovel.novelStatus}">selected</c:if>>已完成</option>  
				 </select>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">点赞数(支持）：</label>
			<div class="controls">
				<form:input path="novelAprHit" htmlEscape="false" maxlength="18" class="input-xlarge " />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">点赞数（反对）：</label>
			<div class="controls">
				<form:input path="novelOppHit" htmlEscape="false" maxlength="18" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">创建时间：</label>
			<div class="controls">
				<input name="novelCreatetime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${cmsNovel.novelCreatetime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
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