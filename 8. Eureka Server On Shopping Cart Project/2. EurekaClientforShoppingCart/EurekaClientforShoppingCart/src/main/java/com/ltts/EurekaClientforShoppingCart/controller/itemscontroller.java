package com.ltts.EurekaClientforShoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.EurekaClientforShoppingCart.dao.itemsdao;
import com.ltts.EurekaClientforShoppingCart.model.items;

@RestController
public class itemscontroller {

	@Autowired
	itemsdao itd;
		
		@RequestMapping("/items")
		public List<items> getAllItems()
		{
			return itd.getAllItems();
		}
		
}

