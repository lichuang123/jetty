package com.thinkgem.jeesite.modules.video_m_n.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.video_m_n.service.VideoTableService;

/*@RequestMapping(value = "${adminPath}/video_m_n/videotable")*/
@Controller
@RequestMapping(value = "${adminPath}/video_m_n/videoTableController/")
public class VideoTableController extends BaseController {

	Log log = LogFactory.getLog(VideoTableController.class);
	
	@Autowired
	private VideoTableService videoTableService;
	
	@RequestMapping(value="selectHostVideo",method=RequestMethod.GET)
	public ModelAndView selectHostVideo(){
		ModelAndView mv = new ModelAndView();
		Map<String,Object> v_map = new HashMap<String,Object>();
		v_map.put("belongto", "1");
		v_map.put("start", 0);
		v_map.put("pageSize", 4);
		List<Map<String,Object>> v_list = videoTableService.selectHostVideo(v_map);
		log.debug("=========selectHostVideo============="+v_list);
		mv.addObject("v_list", v_list);
		mv.setViewName("modules/video_m_n/index");
		return mv;
		
		//return "modules/video_m_n/index";
	}
	
	@RequestMapping(value="showVideoPermission",method=RequestMethod.GET)
	public ModelAndView showVideoPermission(@RequestParam("id")Integer id){
		ModelAndView mv = new ModelAndView();
		List<Map<String,Object>> list = videoTableService.showPermissionVideo(id);
		log.debug("==================sohwVideoPermission==============="+list);
		mv.addObject("list", list);
		if(list.size()>0) mv.addObject("list_0", list.get(0));
		else mv.addObject("list_0", null);
		mv.setViewName("modules/video_m_n/page2");
		return mv;
	}
	
	@RequestMapping(value="fileDownload",method=RequestMethod.GET)
	public void fileDownload(@RequestParam("id")Integer id,HttpServletRequest request){
		
	}
}
