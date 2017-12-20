package com.xtwy.common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月19日下午7:48:32
 * @描述: Base64图片转换
 */
public class Base64Pic {
	/**
	 * 图片转化成base64字符串
	 * 
	 * @param imgFile
	 * @return
	 */
	public static String GetImageStr(String imgFile) {
		// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
		InputStream in = null;
		byte[] data = null;
		// 读取图片字节数组
		try {
			in = new FileInputStream(imgFile);
			data = new byte[in.available()];
			in.read(data);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new String(data);
	}

	/**
	 * base64字符串转化成图片  
	 * @param imgStr Base64字符
	 * @param outPath 输出路径
	 * @return
	 */
	public static String GenerateImage(String imgStr, String outPath) { 
		System.out.println("aaa"+imgStr);
			// 对字节数组字符串进行Base64解码并生成图片
		if (imgStr == null)
			// 图像数据为空
			return "";
		try {
			Date date=new Date();
			// 生成jpeg图片
			String imgFilePath = outPath+"\\"+date.getTime()+".jpg";// 新生成的图片
			OutputStream out = new FileOutputStream(imgFilePath);
			out.write(imgStr.getBytes());
			out.flush();
			out.close();
			return imgFilePath;
		} catch (Exception e) {
			return "";
		}
	}
}
