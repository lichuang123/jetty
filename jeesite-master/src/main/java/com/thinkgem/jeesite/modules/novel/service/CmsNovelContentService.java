/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.novel.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.novel.entity.CmsNovelContent;
import com.thinkgem.jeesite.modules.novel.dao.CmsNovelContentDao;

/**
 * 描述Service
 * @author lichuang
 * @version 2016-12-16
 */
@Service
@Transactional(readOnly = true)
public class CmsNovelContentService extends CrudService<CmsNovelContentDao, CmsNovelContent> {

	public CmsNovelContent get(String id) {
		return super.get(id);
	}
	
	public List<CmsNovelContent> findList(CmsNovelContent cmsNovelContent) {
		return super.findList(cmsNovelContent);
	}
	
	public Page<CmsNovelContent> findPage(Page<CmsNovelContent> page, CmsNovelContent cmsNovelContent) {
		return super.findPage(page, cmsNovelContent);
	}
	
	@Transactional(readOnly = false)
	public void save(CmsNovelContent cmsNovelContent) {
		super.save(cmsNovelContent);
	}
	
	@Transactional(readOnly = false)
	public void delete(CmsNovelContent cmsNovelContent) {
		super.delete(cmsNovelContent);
	}
	
}