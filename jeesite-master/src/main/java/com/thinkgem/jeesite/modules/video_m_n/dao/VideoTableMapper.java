package com.thinkgem.jeesite.modules.video_m_n.dao;

import java.util.List;
import java.util.Map;

import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.video_m_n.entity.VideoTable;

@MyBatisDao
public interface VideoTableMapper {
	
	List<Map<String,Object>> selectHostVideo(Map<String,Object> map);
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int insert(VideoTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int insertSelective(VideoTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    VideoTable selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int updateByPrimaryKeySelective(VideoTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int updateByPrimaryKey(VideoTable record);
}