
package com.ltts.shopping.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.ltts.shopping.pagination.PaginationResult;


@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("contact")
	public String contact() {
		return "contact";
	}
	@GetMapping("location")
	public String location() {
		return "location";
	
}
	@GetMapping("product")
	public String product() {
		return "product";
	
}
	@GetMapping("etc")
	public String etc() {
		return "etc";
	
}
	@GetMapping("etc2")
	public String etc2() {
		return "etc2";
	
}
	@GetMapping("out")
	public String out() {
		return "out";
	
}
	@GetMapping("shoppingCart")
	public String shoppingCart() {
		return "shoppingCart";
}
	@GetMapping("shoppingCartConfirmation")
	public String shoppingCartConfirmation() {
		return "shoppingCartConfirmation";
	
}
	@GetMapping("shoppingCartCustomer")
	public String shoppingCartCustomer() {
		return "shoppingCartCustomer";
	
}
	@GetMapping("shoppingCartFinalize")
	public String shoppingCartFinalize() {
		return "shoppingCartFinalize";
	
}
	@GetMapping("search")
	public String search() {
		return "search";
	
}
/*
 * @RequestMapping("/productList") public String productList() { return
 * "productList"; }
 */
	   }
	


