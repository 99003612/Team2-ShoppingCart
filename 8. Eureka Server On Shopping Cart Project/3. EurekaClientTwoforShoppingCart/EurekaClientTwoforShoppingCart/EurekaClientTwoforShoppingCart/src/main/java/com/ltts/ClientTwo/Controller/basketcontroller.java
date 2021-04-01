package com.ltts.EurekaClientTwoforShoppingCart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.EurekaClientTwoforShoppingCart.dao.basketdao;
import com.ltts.EurekaClientTwoforShoppingCart.Model.basket;

@RestController
public class basketcontroller {

	@Autowired
	basketdao bd;
			
	@RequestMapping("/basket")
	public List<basket> getAllBaskets()
	{
		return bd.getAllBaskets();
	}
			
}