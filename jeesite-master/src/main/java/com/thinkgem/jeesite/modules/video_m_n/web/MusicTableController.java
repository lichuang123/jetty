package com.thinkgem.jeesite.modules.video_m_n.web;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

	Log log = LogFactory.getLog(MusicTableController.class);
	
	@Autowired
	private MusicTableService musicTableService;
	
	@RequestMapping(value="showMusicPermission",method = RequestMethod.GET)
	private ModelAndView showMusicPermission(@RequestParam("id")Integer id){
		ModelAndView mv = new ModelAndView();
		List<Map<String,Object>> list = musicTableService.showMusicPermission(id);
		log.debug("=====================showMusicPermission==============="+list);
		mv.addObject("list", list);
		mv.addObject("list_0", list.get(0));
		if(list.size()>14) mv.addObject("more",14);
		mv.setViewName("modules/video_m_n/music_show");
		return mv;
	}
}