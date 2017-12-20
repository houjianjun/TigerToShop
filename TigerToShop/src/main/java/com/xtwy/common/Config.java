package com.xtwy.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月19日下午8:02:14
 * @描述: 配置文件类
 */
public class Config {
	/**
	 * 获取上传路径
	 * @return
	 * @throws IOException
	 */
	public static String getUploadPath() throws IOException {
		Properties properties = new Properties();
		// 使用ClassLoader加载properties配置文件生成对应的输入流
		InputStream in = Config.class.getClassLoader().getResourceAsStream("conf.properties");
		// 使用properties对象加载输入流
		properties.load(in);
		// 获取key对应的value值
		String path = properties.getProperty("uploadPath");
		return path;
	}
}
