package com.thinkgem.jeesite.modules.video_m_n.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.video_m_n.service.MusicTableService;

@Controller
@RequestMapping(value = "${adminPath}/video_m_n/musicTableController")
public class MusicTableController extends BaseController {

	@Autowired
	private MusicTableService musicTableService;
	
	@RequestMapping(value="showMusicPermission",method = RequestMethod.GET)
	private ModelAndView showMusicPermission(@RequestParam("id")Integer id){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("modules/video_m_n/music_show");
		return mv;
	}
}