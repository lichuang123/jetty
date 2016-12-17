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
import com.thinkgem.jeesite.modules.novel.entity.CmsNovelContent;
import com.thinkgem.jeesite.modules.novel.service.CmsNovelContentService;

/**
 * 描述Controller
 * @author lichuang
 * @version 2016-12-16
 */
@Controller
@RequestMapping(value = "${adminPath}/novel/cmsNovelContent")
public class CmsNovelContentController extends BaseController {

	@Autowired
	private CmsNovelContentService cmsNovelContentService;
	
	@ModelAttribute
	public CmsNovelContent get(@RequestParam(required=false) String id) {
		CmsNovelContent entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = cmsNovelContentService.get(id);
		}
		if (entity == null){
			entity = new CmsNovelContent();
		}
		return entity;
	}
	
	//@RequiresPermissions("novel:cmsNovelContent:view")
	@RequestMapping(value = {"list", ""})
	public String list(CmsNovelContent cmsNovelContent, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<CmsNovelContent> page = cmsNovelContentService.findPage(new Page<CmsNovelContent>(request, response), cmsNovelContent); 
		model.addAttribute("page", page);
		return "modules/novel/cmsNovelContentList";
	}

	//@RequiresPermissions("novel:cmsNovelContent:view")
	@RequestMapping(value = "form")
	public String form(CmsNovelContent cmsNovelContent, Model model) {
		model.addAttribute("cmsNovelContent", cmsNovelContent);
		return "modules/novel/cmsNovelContentForm";
	}

	//@RequiresPermissions("novel:cmsNovelContent:edit")
	@RequestMapping(value = "save")
	public String save(CmsNovelContent cmsNovelContent, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, cmsNovelContent)){
			return form(cmsNovelContent, model);
		}
		cmsNovelContentService.save(cmsNovelContent);
		addMessage(redirectAttributes, "保存描述成功");
		return "redirect:"+Global.getAdminPath()+"/novel/cmsNovelChapter/list";
	}
	
	//@RequiresPermissions("novel:cmsNovelContent:edit")
	@RequestMapping(value = "delete")
	public String delete(CmsNovelContent cmsNovelContent, RedirectAttributes redirectAttributes) {
		cmsNovelContentService.delete(cmsNovelContent);
		addMessage(redirectAttributes, "删除描述成功");
		return "redirect:"+Global.getAdminPath()+"/novel/cmsNovelContent/?repage";
	}

}