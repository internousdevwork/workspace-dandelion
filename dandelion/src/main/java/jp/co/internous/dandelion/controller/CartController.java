package jp.co.internous.dandelion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sampleweb/cart")
public class CartController {

	@RequestMapping("/")
	public String index() {
		return "cart";
	}
}
