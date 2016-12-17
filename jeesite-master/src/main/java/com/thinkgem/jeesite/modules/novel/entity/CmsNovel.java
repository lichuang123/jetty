/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.novel.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 小说增删该查Entity
 * @author 李闯
 * @version 2016-12-15
 */
public class CmsNovel extends DataEntity<CmsNovel> {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String novelName;		// 小说名称
	private String novelAuthor;		// 小说作者
	private String novelImage;		// 小说缩略图
	private String novelDesc;		// 小说描述
	private String novelCategory;		// 0表示小说 1表示文学 2表示 杂文
	private String novelStatus;		// 小说状态 0连载中 1表示已完本
	private Integer novelAprHit;		// 点赞数(支持）
	private Integer novelOppHit;		// 点赞数（反对）
	private Date novelCreatetime;		// 创建时间
	
	//分类名称
	private String classifyName;
	
	public CmsNovel() {
		super();
	}

	public CmsNovel(String id){
		super(id);
	}


	public String getNovelName() {
		return novelName;
	}

	public void setNovelName(String novelName) {
		this.novelName = novelName;
	}

	public String getNovelAuthor() {
		return novelAuthor;
	}

	public void setNovelAuthor(String novelAuthor) {
		this.novelAuthor = novelAuthor;
	}
	
	
	public String getNovelImage() {
		return novelImage;
	}

	public void setNovelImage(String novelImage) {
		this.novelImage = novelImage;
	}
	
	//@Length(min=0, max=255, message="小说描述长度必须介于 0 和 255 之间")
	public String getNovelDesc() {
		return novelDesc;
	}

	public void setNovelDesc(String novelDesc) {
		this.novelDesc = novelDesc;
	}
	
	//@Length(min=0, max=2, message="0表示小说 1表示文学 2表示 杂文长度必须介于 0 和 2 之间")
	public String getNovelCategory() {
		return novelCategory;
	}

	public void setNovelCategory(String novelCategory) {
		this.novelCategory = novelCategory;
	}
	
	//@Length(min=0, max=1, message="小说状态 0连载中 1表示已完本长度必须介于 0 和 1 之间")
	public String getNovelStatus() {
		return novelStatus;
	}

	public void setNovelStatus(String novelStatus) {
		this.novelStatus = novelStatus;
	}
	
	//@Length(min=0, max=18, message="点赞数(支持）长度必须介于 0 和 18 之间")

	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getNovelCreatetime() {
		return novelCreatetime;
	}



	

	public Integer getNovelAprHit() {
		return novelAprHit;
	}

	public void setNovelAprHit(Integer novelAprHit) {
		this.novelAprHit = novelAprHit;
	}

	public Integer getNovelOppHit() {
		return novelOppHit;
	}

	public void setNovelOppHit(Integer novelOppHit) {
		this.novelOppHit = novelOppHit;
	}

	public void setNovelCreatetime(Date novelCreatetime) {
		this.novelCreatetime = novelCreatetime;
	}

	public String getClassifyName() {
		return classifyName;
	}

	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}
	
}