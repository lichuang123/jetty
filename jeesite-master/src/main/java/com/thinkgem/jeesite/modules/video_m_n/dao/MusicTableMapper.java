package com.thinkgem.jeesite.modules.video_m_n.dao;

import java.util.List;
import java.util.Map;

import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.video_m_n.entity.MusicTable;

@MyBatisDao
public interface MusicTableMapper {
	
	List<Map<String,Object>> selectHostMusic(Map<String,Object> map);
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int insert(MusicTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int insertSelective(MusicTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    MusicTable selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int updateByPrimaryKeySelective(MusicTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int updateByPrimaryKey(MusicTable record);
}