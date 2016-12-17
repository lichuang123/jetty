/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.novel.web;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.novel.entity.CmsNovelChapter;
import com.thinkgem.jeesite.modules.novel.service.CmsNovelChapterService;

/**
 * 图书章节管理Controller
 * @author lichuang
 * @version 2016-12-16
 */
@Controller
@RequestMapping(value = "${adminPath}/novel/cmsNovelChapter")
public class CmsNovelChapterController extends BaseController {

	@Autowired
	private CmsNovelChapterService cmsNovelChapterService;
	
	@ModelAttribute
	public CmsNovelChapter get(@RequestParam(required=false) String id) {
		CmsNovelChapter entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = cmsNovelChapterService.get(id);
		}
		if (entity == null){
			entity = new CmsNovelChapter();
		}
		return entity;
	}
	
	//@RequiresPermissions("novel:cmsNovelChapter:view")
	@RequestMapping(value = {"list", ""})
	public String list(CmsNovelChapter cmsNovelChapter, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<CmsNovelChapter> page = cmsNovelChapterService.findPage(new Page<CmsNovelChapter>(request, response), cmsNovelChapter); 
		model.addAttribute("page", page);
		return "modules/novel/cmsNovelChapterList";
	}

	//@RequiresPermissions("novel:cmsNovelChapter:view")
	@RequestMapping(value = "form")
	public String form(CmsNovelChapter cmsNovelChapter, Model model) {
		model.addAttribute("cmsNovelChapter", cmsNovelChapter);
		return "modules/novel/cmsNovelChapterForm";
	}

	//@RequiresPermissions("novel:cmsNovelChapter:edit")
	@RequestMapping(value = "save")
	public String save(CmsNovelChapter cmsNovelChapter, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, cmsNovelChapter)){
			return form(cmsNovelChapter, model);
		}
		cmsNovelChapterService.save(cmsNovelChapter);
		addMessage(redirectAttributes, "保存章节成功");
		return "redirect:"+Global.getAdminPath()+"/novel/cmsNovelChapter/?repage";
	}
	
	@RequestMapping(value = "saveChapter")
	@ResponseBody
	public HashMap<String, String> saveChapter(CmsNovelChapter cmsNovelChapter, Model model, RedirectAttributes redirectAttributes) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		try {
			cmsNovelChapterService.save(cmsNovelChapter);
			map.put("re", "success");
			return map;
		} catch (Exception e) {
			// TODO: handle exception
			map.put("re", e.getMessage());
			return map;
		}
		
		//addMessage(redirectAttributes, "保存章节保存成功成功");
		//return "redirect:"+Global.getAdminPath()+"/novel/cmsNovelChapter/?repage";
	}
	//@RequiresPermissions("novel:cmsNovelChapter:edit")
	@RequestMapping(value = "delete")
	public String delete(CmsNovelChapter cmsNovelChapter, RedirectAttributes redirectAttributes) {
		cmsNovelChapterService.delete(cmsNovelChapter);
		addMessage(redirectAttributes, "删除章节保存成功成功");
		return "redirect:"+Global.getAdminPath()+"/novel/cmsNovelChapter/?repage";
	}

}