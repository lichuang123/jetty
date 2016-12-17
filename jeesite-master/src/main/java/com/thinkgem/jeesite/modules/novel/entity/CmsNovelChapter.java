/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.novel.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 图书章节管理Entity
 * @author lichuang
 * @version 2016-12-16
 */
public class CmsNovelChapter extends DataEntity<CmsNovelChapter> {
	
	private static final long serialVersionUID = 1L;
	private String chaptername;		// 章节名称
	private Integer novelId;		// 所属图书id
	
	private String novelName; //所属图书名称
	public CmsNovelChapter() {
		super();
	}

	public CmsNovelChapter(String id){
		super(id);
	}

	@Length(min=0, max=32, message="章节名称长度必须介于 0 和 32 之间")
	public String getChaptername() {
		return chaptername;
	}

	public void setChaptername(String chaptername) {
		this.chaptername = chaptername;
	}
	
	public Integer getNovelId() {
		return novelId;
	}

	public void setNovelId(Integer novelId) {
		this.novelId = novelId;
	}

	public String getNovelName() {
		return novelName;
	}

	public void setNovelName(String novelName) {
		this.novelName = novelName;
	}
	
}