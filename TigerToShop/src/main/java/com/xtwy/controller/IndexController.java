package com.xtwy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.xtwy.bean.Goods;
import com.xtwy.service.GoodsService;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月19日下午4:45:22
 * @描述: 首页
 */
@Controller
public class IndexController {
	@Resource
	private GoodsService goodsService;
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	/**
	 * 首页显示商品列表
	 * @return
	 */
	@GetMapping("/goodsList")
	public @ResponseBody List<Goods> getFloorGoodsList(){
		List<Goods> list=goodsService.getFloorGoodsList("建材家具");
		return list;
	}
	/**
	 * 
	 * @return
	 */
	@GetMapping("/getGoodsDetail/{goodsId}")
	public ModelAndView getGoodsDetail(@PathVariable("goodsId") Integer goodsId) {
		Goods goods=goodsService.getGoods(goodsId);
		ModelAndView mv=new ModelAndView();
		mv.addObject("goods", goods);
		mv.setViewName("goods");
		return mv;
	}
}
