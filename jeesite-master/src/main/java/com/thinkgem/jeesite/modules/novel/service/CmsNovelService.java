/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.novel.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.novel.entity.CmsNovel;
import com.thinkgem.jeesite.modules.novel.dao.CmsNovelDao;

/**
 * 小说增删该查Service
 * @author 李闯
 * @version 2016-12-15
 */
@Service
@Transactional(readOnly = true)
public class CmsNovelService extends CrudService<CmsNovelDao, CmsNovel> {

	public CmsNovel get(String id) {
		return super.get(id);
	}
	
	public List<CmsNovel> findList(CmsNovel cmsNovel) {
		return super.findList(cmsNovel);
	}
	
	public Page<CmsNovel> findPage(Page<CmsNovel> page, CmsNovel cmsNovel) {
		return super.findPage(page, cmsNovel);
	}
	
	@Transactional(readOnly = false)
	public void save(CmsNovel cmsNovel) {
		super.save(cmsNovel);
	}
	
	@Transactional(readOnly = false)
	public void delete(CmsNovel cmsNovel) {
		super.delete(cmsNovel);
	}
	
}