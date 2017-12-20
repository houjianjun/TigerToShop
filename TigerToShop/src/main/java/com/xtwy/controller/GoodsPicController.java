package com.xtwy.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xtwy.bean.GoodsPic;
import com.xtwy.common.Base64Pic;
import com.xtwy.common.Config;
import com.xtwy.service.GoodsPicService;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月19日下午6:42:36
 * @描述: 图片上传控制类
 */
@Controller
@RequestMapping("/goodsPic")
public class GoodsPicController {
	@Resource
	private GoodsPicService goodsPicServie;

	@RequestMapping("/index")
	public String index() {
		return "/goodspic/goodsPic";
	}

	@PostMapping("/add")
	public @ResponseBody String add(String goodsPath,Integer goodsId,Integer isFirst) {
		String path="";
		try {
			//使用Base64编码上传
			path = Base64Pic.GenerateImage(goodsPath, Config.getUploadPath());
			GoodsPic goodsPic=new GoodsPic();
			goodsPic.setIsFirst(isFirst);
			goodsPic.setGoodsId(goodsId);
			goodsPic.setGoodsPath(path);
			goodsPicServie.addGoodsPic(goodsPic);	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "1";
	}
	@GetMapping("/getGoodsPic/{goodsId}")
	public @ResponseBody List<GoodsPic> getGoodsPic(@PathVariable("goodsId") Integer goodsId){
		System.out.println(goodsId);
		//获取所有商品
		List<GoodsPic> list=goodsPicServie.getGoodsPic(goodsId);
		return list;
	}
}
