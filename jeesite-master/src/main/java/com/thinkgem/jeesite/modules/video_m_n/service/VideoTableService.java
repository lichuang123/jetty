package com.thinkgem.jeesite.modules.video_m_n.service;

import java.io.File;
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
