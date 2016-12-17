<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>小说管理</title>
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
		function addChapter(id,chapter){
			//alert(id);
			//alert(chapter);
			$('#novelName2').val(chapter);
			$('#novelId').val(id);
			//打开模态框
			$('#myModal').modal('show');
			
			
		}
		function addChaperPro(){
			//alert($('#novelName2').val());
			//alert($('#novelId').val());
			//小说章节名称
			var chapterName = $('#chapterName').val();
			//改章节所对应的图书
			var novelId = $('#novelId').val();
			$.ajax({
			     url: "${ctx}/novel/cmsNovelChapter/saveChapter",
			     type: "POST",
			     data: {'chaptername':chapterName,'novelId':novelId},
			     success: function( data){
			        // data 是返回的数据
			        // textStatus 可能为"success"、"notmodified"等
			        // jqXHR 是经过jQuery封装的XMLHttpRequest对象
			       // alert("返回的数据" + data.re);
			        if(data.re=='success'){
			        	alert("章节添加成功");
			        	//top.$.jBox.tip('请填写正文','提示');
			        	$('#myModal').modal('hidden');
			        	$('#chapterName').html("");
			        	
			        }
			    }
			});
		}
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/novel/cmsNovel/">小说列表</a></li>
		<li><a href="${ctx}/novel/cmsNovel/form">小说添加</a></li>
	</ul>
	<form:form id="searchForm" modelAttribute="cmsNovel" action="${ctx}/novel/cmsNovel/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<label>小说名称：</label><form:input path="novelName" htmlEscape="false" maxlength="50" class="input-small"/>&nbsp;
		
		<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>
		
	
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>ID</th><th>小说名称</th><th>小说作者</th><th>所属分类</th><th>更新时间</th><th>小说状态</th><th>操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="cmsNovel">
			<tr>
				<td>${cmsNovel.id}</td>
				<td>${cmsNovel.novelName}</td>
				<td>${cmsNovel.novelAuthor}</td>
				<td>${cmsNovel.classifyName}</a></td>
				<td><fmt:formatDate value="${cmsNovel.novelCreatetime}" type="both"/></td>
				<td><c:if test="${'0' eq cmsNovel.novelStatus}">连载中</c:if><c:if test="${'1' eq cmsNovel.novelStatus}">已完成</c:if></td>
				<td>
    				<a href="${ctx}/novel/cmsNovel/form?id=${cmsNovel.id}">修改</a>
					<a href="${ctx}/novel/cmsNovel/delete?id=${cmsNovel.id}" onclick="return confirmx('确认要删除该小说吗？', this.href)">删除</a>
					<a href="javascript:void(0)" onclick="addChapter('${cmsNovel.id}','${cmsNovel.novelName}')" data-toggle="modal" data-target="#myModal">添加章节</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
	<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"
               aria-hidden="true">×
            </button>
            <h4 class="modal-title" id="myModalLabel">
               	添加章节
            </h4>
         </div>
         <div class="modal-body">
           	<div class="uk-form-row">
				<div class="uk-form-controls">
				<label for="chapterName" class="uk-form-label" style="display:inline-block;padding: 0 10px;vertical-align: middle;margin-left:-7px;">章节名称</label>
				<input class="" id="chapterName" value=""  style="margin-left: 5px;width:400px;height:30px;" type="text" name="chapterName" placeholder="请输入章节名称">
			</div>
			<div class="uk-form-row">
				<div class="uk-form-controls">
				<label for="novelName" class="uk-form-label" style="display:inline-block;padding: 0 10px;vertical-align: middle;margin-left:-7px;">所属图书</label>
				<input class="" id="novelName2"   style="margin-left: 5px;width:400px;height:30px;" type="text" name="novelName" placeholder="请输入章节名称" disabled="disabled">
				<input type="hidden" id="novelId" name="" value="novelId"/>
			</div>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default"
               data-dismiss="modal">关闭
            </button>
            <button type="button" class="btn btn-primary" onclick="addChaperPro()">
               提交更改
            </button>
         </div>
      </div><!-- /.modal-content -->
   </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</body>


</html>