	function playOrStop(){
		
	}
	
	function bf(){
		 var audio = document.getElementById('music1'); 
		 if(audio!==null){             
		    //检测播放是否已暂停.audio.paused 在播放器播放时返回false.
		     alert(audio.paused);
		  if(audio.paused)                     {                 
		      audio.play();//audio.play();// 这个就是播放  
		  }else{
		   audio.pause();// 这个就是暂停
		  }
		 } 
		}

	function chooseOrder(url,id,vtcId){
		$("#audio_id")[0].src=url;
		var aa = $("#chooseOrderF")[0].childElementCount;
		for(var i = 1 ;i<aa+1;i++){
			$("#chooseOrder"+i).removeClass("on");
		}
		$("#chooseOrder"+id).addClass("on");
		$("#playId")[0].innerHTML = "暂停";
		/*$("#video_like_hite_vtcId").val(vtcId);
		$("#sourceId")[0].src = url;
		$("#myVideo")[0].src = url;
		$("#myVideo")[0].play();
		var aa = $("#chooseOrderF")[0].childElementCount;
		for(var i = 1 ;i<aa+1;i++){
			$("#chooseOrder"+i).removeClass("on");
		}
		$("#chooseOrder"+id).addClass("on");
		$("#playOrpused")[0].innerHTML = "";
		$("#playOrpused")[0].innerHTML = "暂停";*/
		//selectThreeCount(vtcId);
		//videoHiteChange();
		//videoLikeChange();
		//$("#chooseOrder"+id).removeClass("on");
	}
	
	function removeHdclass(){
		var aa = $("#chooseOrderF")[0].childElementCount;
		for(var i = 1 ;i<aa;i++){
			$("#chooseOrder"+i)[0].style.display = "inline-block";
		}
		$("#showMore")[0].style.display = "none";
	}