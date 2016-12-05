	
	function showMusicPermission(id){
		window.location.href = "../musicTableController/showMusicPermission.do?id="+id;
	}

	function showVideoPermission(id){
		window.location.href = "showVideoPermission.do?id="+id;
	}
	
	//video_search.jsp start................
	function searchVideo(){
		var searchName = $("#searchName").val();
		if(searchName != "" ){
			$.ajax({
				url:"searchVideo.do",
				data:{searchName:searchName},
				dataType:"JSON",
				type:"POST",
				success:function(data){
					var text = "";
					if(data.length>0){
						$.each(data,function(i,obj){
							text += "<a onclick=\"showVideoPermission("+obj.id+");\">"+obj.video_name+"</a>";
						});
					}else{
						text += "<a color='red'>没有关于'"+searchName+"'的结果</a>";
					}
					$("#search-list-con")[0].innerHTML = "";
					$("#search-list-con")[0].innerHTML += text; 
				},
				error:function(e){
					alert("search video error:"+e.status);
				}
			})
		}
		
	}
	//video_search.jsp end..................