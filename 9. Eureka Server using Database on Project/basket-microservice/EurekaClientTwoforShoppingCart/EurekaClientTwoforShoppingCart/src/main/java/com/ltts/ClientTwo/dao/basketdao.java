package com.ltts.EurekaClientTwoforShoppingCart.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.EurekaClientTwoforShoppingCart.Model.basket;

@Repository
public class basketdao 
{
	public List<basket> getAllBaskets()
	{
		List<basket> li = new ArrayList<basket>();
				
		li.add(new basket (1,"Basket 1","20/1/2021"));
				
		li.add(new basket (2,"Basket 2", "20/2/2021"));
		
		li.add(new basket (3,"Basket 3","20/3/2021"));
			
		return li;
	}
}