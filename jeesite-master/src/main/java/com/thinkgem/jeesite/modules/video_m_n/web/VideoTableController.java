package com.thinkgem.jeesite.modules.video_m_n.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.video_m_n.service.VideoTableService;

/*@RequestMapping(value = "${adminPath}/video_m_n/videotable")*/
@Controller
@RequestMapping(value = "${adminPath}/video_m_n/videoTableController/")
public class VideoTableController extends BaseController {

	@Autowired
	private VideoTableService videoTableService;
	
	@RequestMapping(value="selectHostVideo",method=RequestMethod.GET)
	public String selectHostVideo(){
		//ModelAndView mv = new ModelAndView();
		/*Map<String,Object> v_map = new HashMap<String,Object>();
		v_map.put("belongto", "1");
		v_map.put("start", 0);
		v_map.put("pageSize", 4);
		List<Map<String,Object>> v_list = videoTableService.selectHostVideo(v_map);
		mv.addObject("v_list", v_list);*/
		System.out.println("============================================");
		/*mv.setViewName("modules/video_m_n/index");
		return mv;*/
		return "modules/video_m_n/index";
	}
}
