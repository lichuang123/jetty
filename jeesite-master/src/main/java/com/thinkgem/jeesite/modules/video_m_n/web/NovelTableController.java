package com.thinkgem.jeesite.modules.video_m_n.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thinkgem.jeesite.common.web.BaseController;
/*@RequestMapping(value = "${adminPath}/video_m_n/noveltable")*/
@Controller
@RequestMapping(value = "${adminPath}/video_m_n/noveltable/")
public class NovelTableController extends BaseController {
	@RequestMapping("getNovelPage")
	public String getNovelPage(){
		return "modules/video_m_n/read_list";
	}
}
