/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.novel.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 描述Entity
 * @author lichuang
 * @version 2016-12-16
 */
public class CmsNovelContent extends DataEntity<CmsNovelContent> {
	
	private static final long serialVersionUID = 1L;
	private Integer novelId;		// 图示id
	private Integer chapterId;		// 章节id
	private String novelName;		// 小说名称
	private String novelContent;		// novel_content
	private Date createtime;		// createtime
	//新增所属章节名称
	private String chaptername;
	public CmsNovelContent() {
		super();
	}

	public CmsNovelContent(String id){
		super(id);
	}

	public Integer getNovelId() {
		return novelId;
	}

	public void setNovelId(Integer novelId) {
		this.novelId = novelId;
	}
	
	public Integer getChapterId() {
		return chapterId;
	}

	public void setChapterId(Integer chapterId) {
		this.chapterId = chapterId;
	}
	
	@Length(min=0, max=50, message="小说名称长度必须介于 0 和 50 之间")
	public String getNovelName() {
		return novelName;
	}

	public void setNovelName(String novelName) {
		this.novelName = novelName;
	}
	
	public String getNovelContent() {
		return novelContent;
	}

	public void setNovelContent(String novelContent) {
		this.novelContent = novelContent;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getChaptername() {
		return chaptername;
	}

	public void setChaptername(String chaptername) {
		this.chaptername = chaptername;
	}
	
	
}