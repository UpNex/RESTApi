package com.bookshare.controller;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bookshare.model.Product;
import com.bookshare.mongoconfig.MongoDBAdapter;
import com.bookshare.utility.ProductUtils;

/**
 * Handles requests for the UpNxt android application.
 */
@Controller
@Configuration
@PropertySource("classpath:bookshare.properties")
public class HomeController {
	
	@Autowired
	Environment env;
	
	Random rand = new Random();
	HomeController(){
		
	}
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	MongoDBAdapter mongoDBAdapter = new MongoDBAdapter();
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@RequestParam(required=false) String error_message, Model model) {
		
		model.addAttribute("error_message", error_message );
		
		return "redirect:intent://com.hp.linkreadersdksample/#Intent;scheme=launch;package=com.hp.linkreadersdksample;S.content=WebContent;end";
		//product_redirect";
	}
	
	@RequestMapping(value = "/{product_id}", method = RequestMethod.GET)
	public String getProductInfo(@PathVariable("product_id") String product_id, Model model) {
		
		
		return "redirect:intent://com.hp.linkreadersdksample/#Intent;scheme=launch;package=com.hp.linkreadersdksample;S.content="+product_id+";end";
		//product_redirect";
	}	
	
	@RequestMapping(value="/set_product_details", method=RequestMethod.POST)
	@ResponseBody
	public String setProductDetails(@RequestBody Product product){
		//Product product = new Product("pizza","food","298","100g","8.9g","product_123");
		ProductUtils.setProductDetails(product);
		return "{Success:true}";
	}
	
	
	@RequestMapping(value="/get_product_details/{id}", method=RequestMethod.GET)
	public String getProductDetails(@PathVariable ("id") String id, Model model){
		Product product = ProductUtils.getProductDetails(id);
		model.addAttribute("product", product);
		return "product_details";
	}

}
