package com.xtwy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xtwy.bean.GoodsType;
import com.xtwy.service.GoodsTypeService;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月15日上午10:40:35
 * @描述: 商品类型控制器
 */
@Controller
@RequestMapping("/goodsType")
public class GoodsTypeController {
	
	@Autowired
	private GoodsTypeService goodTypeService;
	/**
	 * 跳转首页
	 * @return
	 */
	@GetMapping("/index")
	public String index() {
		return "admin/goodstype/goodsType";
	}
	/**
	 * 添加类型
	 * @param goodsType
	 * @return
	 */
	@PutMapping("/add")
	public @ResponseBody String add(@RequestBody GoodsType goodsType) {
		goodTypeService.addGoodsType(goodsType);
		return "1";
	}
	/**
	 * 读取类型数据
	 * @return
	 */
	@GetMapping("/getGoodsTypeAll")
	public  @ResponseBody List<GoodsType> getGoodsTypeAll() {
		List<GoodsType> list=goodTypeService.getGoodsTypeAll();
		return list;
	}
	/**
	 * 删除类型数据
	 * @param keys
	 * @return
	 */
	@DeleteMapping("/delete")
	public @ResponseBody String delete(@RequestBody Integer[] keys) {
		goodTypeService.removeGoodsType(keys);
		return "1";
	}
	/**
	 * 修改数据类型
	 * @param goodsType
	 * @return
	 */
	@PostMapping("/edit")
	public @ResponseBody String edit(@RequestBody GoodsType goodsType) {
		goodTypeService.editGoodsType(goodsType);
		return "1";
	}
	
}
