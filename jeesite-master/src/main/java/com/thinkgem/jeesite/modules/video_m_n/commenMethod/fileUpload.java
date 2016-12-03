package com.thinkgem.jeesite.modules.video_m_n.commenMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class fileUpload {

	static Log log = LogFactory.getLog(fileUpload.class);
	/**
	 * @param address 下载文件完整路径名，如：E:/aa/bb/abc.jpg
	 * @param response HttpServletResponse
	 * @param fileName 原文件名
	 * 
	 * */
	public static void fileDownload(String address,HttpServletResponse response,String fileName) throws IOException{
		
		log.debug("文件下载路径.............."+address+"-----原文件名-------"+fileName);
		InputStream is = new FileInputStream(new File(address));
		//String name = address.substring(address.lastIndexOf("/")+1);
		OutputStream os = response.getOutputStream();
		response.setHeader("Content-Disposition", "filename=" + new String(fileName.getBytes("gb2312"), "iso8859-1"));
		response.setContentType("application/vnd-ms-excel");
		byte[] data = new byte[1024];
		int len;
		while((len=is.read(data))!=-1){
			os.write(data, 0, len);
		}
		is.close();
		os.close();
	}
}
