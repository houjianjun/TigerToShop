package com.xtwy.controller;
/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月18日上午10:17:25
 * @描述: 商品类别神控制器
 */

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xtwy.bean.GoodsClass;
import com.xtwy.bean.GoodsType;
import com.xtwy.service.GoodsClassService;

@Controller
@RequestMapping("/goodsClass")
public class GoodsClassController {
	@Resource
	private GoodsClassService goodsClassServie;
	/**
	 * 跳转首页
	 * @return
	 */
	@GetMapping("/index")
	public String index() {
		return "admin/goodsclass/goodsClass";
	}
	/**
	 * 商品添加
	 * @param goodsType
	 * @return
	 */
	@PutMapping("/add")
	public @ResponseBody String add(@RequestBody GoodsClass goodsClass) {
		goodsClassServie.addGoodsClass(goodsClass);
		return "1";
	}
	
	/**
	 * 删除分类数据
	 * @param keys
	 * @return
	 */
	@DeleteMapping("/delete")
	public @ResponseBody String delete(@RequestBody Integer[] keys) {
		System.out.println(keys);
		goodsClassServie.removeGoodsClass(keys);
		return "1";
	}
	
	/**
	 * 所有商品分类数据
	 * @return
	 */
	@GetMapping("/getGoodsClassAll")
	public  @ResponseBody List<GoodsClass> getGoodsClassAll() {
		List<GoodsClass> list=goodsClassServie.getGoodsClassAll();
		System.out.println(list.size());
		return list;
	}
	
	/**
	 * 修改数据类型
	 * @param goodsType
	 * @return
	 */
	@PostMapping("/edit")
	public @ResponseBody String edit(@RequestBody GoodsClass goodsClass) {
		goodsClassServie.editGoodsClass(goodsClass);
		return "1";
	}
}
