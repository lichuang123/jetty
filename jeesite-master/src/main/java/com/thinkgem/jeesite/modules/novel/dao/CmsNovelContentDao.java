/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.novel.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.novel.entity.CmsNovelContent;

/**
 * 描述DAO接口
 * @author lichuang
 * @version 2016-12-16
 */
@MyBatisDao
public interface CmsNovelContentDao extends CrudDao<CmsNovelContent> {
	
}