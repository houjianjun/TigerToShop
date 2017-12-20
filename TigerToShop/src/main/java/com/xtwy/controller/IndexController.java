package com.xtwy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月19日下午4:45:22
 * @描述: 首页
 */
@Controller
public class IndexController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
