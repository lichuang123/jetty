/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.novel.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.novel.entity.CmsNovel;

/**
 * 小说增删该查DAO接口
 * @author 李闯
 * @version 2016-12-15
 */
@MyBatisDao
public interface CmsNovelDao extends CrudDao<CmsNovel> {
	
}