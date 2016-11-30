package com.thinkgem.jeesite.modules.video_m_n.dao;

import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.video_m_n.entity.VideoTableCount;

@MyBatisDao
public interface VideoTableCountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_table_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_table_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int insert(VideoTableCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_table_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int insertSelective(VideoTableCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_table_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    VideoTableCount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_table_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int updateByPrimaryKeySelective(VideoTableCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_table_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int updateByPrimaryKey(VideoTableCount record);
}