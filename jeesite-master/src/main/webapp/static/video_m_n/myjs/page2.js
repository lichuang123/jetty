function play(){
	var status = document.getElementById('myVideo');
	if(status.paused){
		if($("#currentTime").val()!=""){
			$("#myVideo")[0].currentTime = $("#currentTime").val();
		}
		document.getElementById('myVideo').play();
		$("#playOrpused")[0].innerHTML = "";
		$("#playOrpused")[0].innerHTML = "暂停";
		
	}else{
		$("#currentTime").val(status.currentTime);
		$("#myVideo")[0].pause();
		$("#playOrpused")[0].innerHTML = "";
		$("#playOrpused")[0].innerHTML = "播放";
	}
}
function chooseOrder(url,id){
	$("#sourceId")[0].src = url;
	$("#myVideo")[0].src = url;
	$("#myVideo")[0].play();
	var aa = $("#chooseOrderF")[0].childElementCount;
	for(var i = 1 ;i<aa+1;i++){
		$("#chooseOrder"+i).removeClass("on");
	}
	$("#chooseOrder"+id).addClass("on");
	//$("#chooseOrder"+id).removeClass("on");
	
}
/*$(function(){
	myVideo.get(0).play();//动态播放、暂停视频【一定要有.get(0)】
	myVideo.get(0).pause();
	backAudio_btn.on('click',function(){
        if (!backAudio.paused) {
            backAudio.get(0).pause();
            backAudio.paused = true;
        }else{
            backAudio.get(0).play();
            backAudio.paused = false;
        }      
    });
})*/