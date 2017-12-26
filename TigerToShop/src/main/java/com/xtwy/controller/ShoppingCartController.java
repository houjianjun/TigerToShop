package com.xtwy.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xtwy.bean.ShoppingCart;
import com.xtwy.service.ShoppingCartService;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月21日下午7:05:31
 * @描述: 购物车控制器
 */
@Controller
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
	@Resource
	private ShoppingCartService shoppingCartService;

	@GetMapping("/index")
	public String index() {
		return "shoppingcart";
	}

	@PutMapping("/add")
	public @ResponseBody String add(@RequestBody ShoppingCart shoppingCart) {
		shoppingCart.setAddDate(new Date());
		shoppingCartService.addShoppingCart(shoppingCart);
		return "1";
	}

	@GetMapping("/getShoppingCart/{memberId}")
	public @ResponseBody List<ShoppingCart> getShoppingCart(@PathVariable("memberId") Integer memberId) {
		List<ShoppingCart> list=shoppingCartService.getShoppingCart(memberId);
		return list;
	}
}
