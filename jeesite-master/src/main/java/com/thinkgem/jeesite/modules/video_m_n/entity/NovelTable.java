package com.thinkgem.jeesite.modules.video_m_n.entity;

import java.io.Serializable;
import java.util.Date;

public class NovelTable implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.id
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.novel_name
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private String novelName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.novel_content
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private String novelContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.novel_type
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private String novelType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.novel_belongTo
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private String novelBelongto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.novel_context
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private String novelContext;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.novel_createTime
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private Date novelCreatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.novel_createUser
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private String novelCreateuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.ATTRA
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private String attra;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.ATTRB
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private String attrb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.ATTRC
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private String attrc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.ATTRD
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private String attrd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.ATTRE
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private String attre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.ATTRF
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private String attrf;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column novel_table.ATTRG
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private String attrg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table novel_table
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.id
     *
     * @return the value of novel_table.id
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.id
     *
     * @param id the value for novel_table.id
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.novel_name
     *
     * @return the value of novel_table.novel_name
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public String getNovelName() {
        return novelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.novel_name
     *
     * @param novelName the value for novel_table.novel_name
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setNovelName(String novelName) {
        this.novelName = novelName == null ? null : novelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.novel_content
     *
     * @return the value of novel_table.novel_content
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public String getNovelContent() {
        return novelContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.novel_content
     *
     * @param novelContent the value for novel_table.novel_content
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setNovelContent(String novelContent) {
        this.novelContent = novelContent == null ? null : novelContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.novel_type
     *
     * @return the value of novel_table.novel_type
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public String getNovelType() {
        return novelType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.novel_type
     *
     * @param novelType the value for novel_table.novel_type
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setNovelType(String novelType) {
        this.novelType = novelType == null ? null : novelType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.novel_belongTo
     *
     * @return the value of novel_table.novel_belongTo
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public String getNovelBelongto() {
        return novelBelongto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.novel_belongTo
     *
     * @param novelBelongto the value for novel_table.novel_belongTo
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setNovelBelongto(String novelBelongto) {
        this.novelBelongto = novelBelongto == null ? null : novelBelongto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.novel_context
     *
     * @return the value of novel_table.novel_context
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public String getNovelContext() {
        return novelContext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.novel_context
     *
     * @param novelContext the value for novel_table.novel_context
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setNovelContext(String novelContext) {
        this.novelContext = novelContext == null ? null : novelContext.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.novel_createTime
     *
     * @return the value of novel_table.novel_createTime
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public Date getNovelCreatetime() {
        return novelCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.novel_createTime
     *
     * @param novelCreatetime the value for novel_table.novel_createTime
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setNovelCreatetime(Date novelCreatetime) {
        this.novelCreatetime = novelCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.novel_createUser
     *
     * @return the value of novel_table.novel_createUser
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public String getNovelCreateuser() {
        return novelCreateuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.novel_createUser
     *
     * @param novelCreateuser the value for novel_table.novel_createUser
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setNovelCreateuser(String novelCreateuser) {
        this.novelCreateuser = novelCreateuser == null ? null : novelCreateuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.ATTRA
     *
     * @return the value of novel_table.ATTRA
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public String getAttra() {
        return attra;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.ATTRA
     *
     * @param attra the value for novel_table.ATTRA
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setAttra(String attra) {
        this.attra = attra == null ? null : attra.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.ATTRB
     *
     * @return the value of novel_table.ATTRB
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public String getAttrb() {
        return attrb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.ATTRB
     *
     * @param attrb the value for novel_table.ATTRB
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setAttrb(String attrb) {
        this.attrb = attrb == null ? null : attrb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.ATTRC
     *
     * @return the value of novel_table.ATTRC
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public String getAttrc() {
        return attrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.ATTRC
     *
     * @param attrc the value for novel_table.ATTRC
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setAttrc(String attrc) {
        this.attrc = attrc == null ? null : attrc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.ATTRD
     *
     * @return the value of novel_table.ATTRD
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public String getAttrd() {
        return attrd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.ATTRD
     *
     * @param attrd the value for novel_table.ATTRD
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setAttrd(String attrd) {
        this.attrd = attrd == null ? null : attrd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.ATTRE
     *
     * @return the value of novel_table.ATTRE
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public String getAttre() {
        return attre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.ATTRE
     *
     * @param attre the value for novel_table.ATTRE
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setAttre(String attre) {
        this.attre = attre == null ? null : attre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.ATTRF
     *
     * @return the value of novel_table.ATTRF
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public String getAttrf() {
        return attrf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.ATTRF
     *
     * @param attrf the value for novel_table.ATTRF
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setAttrf(String attrf) {
        this.attrf = attrf == null ? null : attrf.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column novel_table.ATTRG
     *
     * @return the value of novel_table.ATTRG
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public String getAttrg() {
        return attrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column novel_table.ATTRG
     *
     * @param attrg the value for novel_table.ATTRG
     *
     * @mbggenerated Mon Nov 28 15:12:20 CST 2016
     */
    public void setAttrg(String attrg) {
        this.attrg = attrg == null ? null : attrg.trim();
    }
}