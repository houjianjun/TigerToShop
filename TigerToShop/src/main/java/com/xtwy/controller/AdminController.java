package com.xtwy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月14日下午7:19:40
 * @描述: 管理员控制器
 */

@Controller
@RequestMapping("/admin")
public class AdminController {
	@RequestMapping("/login")
	public String login() {
		System.out.println("------");
		return "login";
	}
	
	@RequestMapping("index")
	public String index() {
		return "admin/index";
	}
}
