package com.thinkgem.jeesite.modules.video_m_n.service;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.modules.video_m_n.dao.MusicTableCountMapper;
import com.thinkgem.jeesite.modules.video_m_n.dao.MusicTableMapper;
import com.thinkgem.jeesite.modules.video_m_n.dao.VideoTableCountMapper;
import com.thinkgem.jeesite.modules.video_m_n.dao.VideoTableMapper;
import com.thinkgem.jeesite.modules.video_m_n.entity.VideoTable;
import com.thinkgem.jeesite.modules.video_m_n.entity.VideoTableCount;

@Service
@Transactional(readOnly = false)
public class VideoTableService extends BaseService {

	@Autowired
	private MusicTableCountMapper musicTableCountMapper;
	
	@Autowired
	private MusicTableMapper musicTableMapper;
	
	@Autowired
	private VideoTableMapper videoTableMapper;
	
	@Autowired
	private VideoTableCountMapper videoTableCountMapper;
	
	//查询播放、喜欢、不喜欢次数
	public Map<String,Object> selectThreeCount(Integer vtcId){
		Integer count = videoTableMapper.selectPlayCountById(vtcId);
		Integer count2 = count+1;
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("vtcId", vtcId);
		map.put("count", count2);
		videoTableMapper.updateVideoPlayCount(map);
		return videoTableMapper.selectThreeCount(vtcId);
	}
	
	//添加视频不喜欢次数
	public Integer addVideoHiteCount(Integer vtcId){
		Integer count = videoTableMapper.selectHiteCountById(vtcId);
		Integer count2 = count+1;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("vtcId", vtcId);
		map.put("count", count2);
		videoTableMapper.updateVideoHiteCount(map);
		return count2;
	}
	
	//添加视频点赞次数
	public Integer addVideoLikeCount(Integer vtcId){
		Integer count = videoTableMapper.selectLikeCountById(vtcId);
		Integer count2 = count+1;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("vtcId", vtcId);
		map.put("count", count2);
		videoTableMapper.updateVideoLikeCount(map);
		return count2;
	}
	
	//添加播放次数
	public Integer addVideoPlayCount(Integer vtcId){
		Integer count = videoTableMapper.selectPlayCountById(vtcId);
		Integer count2 = count+1;
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("vtcId", vtcId);
		map.put("count", count2);
		videoTableMapper.updateVideoPlayCount(map);
		return count2;
	}
	
	@Transactional(readOnly = true)
	public Map<String,Object> selectDownAddressById(Integer vtcId){
		return videoTableMapper.selectDownAddressById(vtcId);
	}
	
	@Transactional(readOnly = true)
	public List<Map<String,Object>> showPermissionVideo(Integer id){
		return videoTableMapper.showPermissionVideo(id);
	}
	
	@Transactional(readOnly = true)
	public List<Map<String,Object>> selectHostVideo(Map<String,Object> map){
		return videoTableMapper.selectHostVideo(map);
	}
	
	public void insertIntovideo(){
		File file = new File("G:/KuGouMVmp4");
		String[] fileName = file.list();
		for(String s:fileName){
			System.out.println(s+"=====");
			VideoTable vt = new VideoTable();
			vt.setVideoName(s);
			videoTableMapper.insertSelective(vt);
			int id = vt.getId();
			VideoTableCount vtc = new VideoTableCount();
			vtc.setVideoId(id);
			vtc.setVideoAddress("G:/KuGouMVmp4/"+s);
			videoTableCountMapper.insertSelective(vtc);
			//musicTableMapper.insertSelective(mt);
			//System.out.println(s);
		}
	}
}
