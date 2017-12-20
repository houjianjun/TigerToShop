package com.xtwy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xtwy.bean.Goods;
import com.xtwy.bean.GoodsClass;
import com.xtwy.service.GoodsService;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月18日下午5:09:51
 * @描述: 商品管理控制器
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
	@Resource
	private GoodsService goodsService;
	
	@GetMapping("/index")
	public String index() {
		return "admin/goods/goods";
	}
	
	@PutMapping("/add")
	public @ResponseBody String add(@RequestBody Goods goods) {
		if(null==goods.getGrounding()) {
			goods.setGrounding(0);
		}
		goodsService.addGoods(goods);
		return "1";
	}
	
	@DeleteMapping("/delete")
	public @ResponseBody String delete(@RequestBody Integer[] keys) {
		System.out.println(keys);
		goodsService.removeGoods(keys);
		return "1";
	}
	
	@GetMapping("getGoodsAll")
	public @ResponseBody List<Goods> getGoodsAll() {
		List<Goods> list=goodsService.getGoodsAll();
		//添加分页参数
		
		return list;
	}
}
