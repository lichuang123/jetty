/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.novel.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.novel.entity.CmsNovelChapter;
import com.thinkgem.jeesite.modules.novel.dao.CmsNovelChapterDao;

/**
 * 图书章节管理Service
 * @author lichuang
 * @version 2016-12-16
 */
@Service
@Transactional(readOnly = true)
public class CmsNovelChapterService extends CrudService<CmsNovelChapterDao, CmsNovelChapter> {

	public CmsNovelChapter get(String id) {
		return super.get(id);
	}
	
	public List<CmsNovelChapter> findList(CmsNovelChapter cmsNovelChapter) {
		return super.findList(cmsNovelChapter);
	}
	
	public Page<CmsNovelChapter> findPage(Page<CmsNovelChapter> page, CmsNovelChapter cmsNovelChapter) {
		return super.findPage(page, cmsNovelChapter);
	}
	
	@Transactional(readOnly = false)
	public void save(CmsNovelChapter cmsNovelChapter) {
		super.save(cmsNovelChapter);
	}
	
	@Transactional(readOnly = false)
	public void delete(CmsNovelChapter cmsNovelChapter) {
		super.delete(cmsNovelChapter);
	}
	
}