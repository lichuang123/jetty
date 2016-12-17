/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.novel.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.novel.entity.CmsNovel;
import com.thinkgem.jeesite.modules.novel.service.CmsNovelService;

/**
 * 小说增删该查Controller
 * @author 李闯
 * @version 2016-12-15
 */
@Controller
@RequestMapping(value = "${adminPath}/novel/cmsNovel")
public class CmsNovelController extends BaseController {

	@Autowired
	private CmsNovelService cmsNovelService;
	
	@ModelAttribute
	public CmsNovel get(@RequestParam(required=false) String id) {
		CmsNovel entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = cmsNovelService.get(id);
		}
		if (entity == null){
			entity = new CmsNovel();
		}
		return entity;
	}
	
	//@RequiresPermissions("novel:cmsNovel:view")
	@RequestMapping(value = {"list", ""})
	public String list(CmsNovel cmsNovel, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<CmsNovel> page = cmsNovelService.findPage(new Page<CmsNovel>(request, response), cmsNovel); 
		model.addAttribute("page", page);
		return "modules/novel/cmsNovelList";
	}

//	@RequiresPermissions("novel:cmsNovel:view")
	@RequestMapping(value = "form")
	public String form(CmsNovel cmsNovel, Model model) {
		model.addAttribute("cmsNovel", cmsNovel);
		return "modules/novel/cmsNovelForm";
	}

	//@RequiresPermissions("novel:cmsNovel:edit")
	@RequestMapping(value = "save")
	public String save(CmsNovel cmsNovel, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, cmsNovel)){
			return form(cmsNovel, model);
		}
		cmsNovelService.save(cmsNovel);
		addMessage(redirectAttributes, "保存小说成功");
		return "redirect:"+Global.getAdminPath()+"/novel/cmsNovel/?repage";
	}
	
	//@RequiresPermissions("novel:cmsNovel:edit")
	@RequestMapping(value = "delete")
	public String delete(CmsNovel cmsNovel, RedirectAttributes redirectAttributes) {
		cmsNovelService.delete(cmsNovel);
		addMessage(redirectAttributes, "删除小说成功");
		return "redirect:"+Global.getAdminPath()+"/novel/cmsNovel/?repage";
	}

}