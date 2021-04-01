package com.ltts.EurekaClientforShoppingCart.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.EurekaClientforShoppingCart.model.items;

	@Repository
	public class itemsdao {
		
		public List<items> getAllItems()
		{
			List<items> li = new ArrayList<items>();
			
			li.add(new items ("Shampoo",100.0,120,1));
			
			li.add(new items ("Soap",30.0,100,2));
			
			li.add(new items ("Bucket",10.0,200,3));
			
			return li;
		}
}

