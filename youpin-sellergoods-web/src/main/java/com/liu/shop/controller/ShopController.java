package com.liu.shop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.SellerService;

@RestController
@RequestMapping("/goods")
public class ShopController {
	
	@Reference
	private SellerService sellerService;
	
	
	@RequestMapping("/findBrands")
	public List<TbBrand>  findBrand() {
		
		return sellerService.findAll();
	}

}
