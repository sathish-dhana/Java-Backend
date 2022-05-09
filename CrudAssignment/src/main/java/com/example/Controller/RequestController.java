package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bean.Product;
import com.example.Exception.ProductException;
import com.example.service.ServiceImplementation;

@RestController
public class RequestController {
	
	@Autowired
	ServiceImplementation service;
	
	@PostMapping("/product")
	public String addProduct(@RequestBody Product product) {
		try {
			return service.addProduct(product);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") Integer id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/product/delete/{id}")
	public String deleteProductById(@PathVariable("id") Integer id) {
		try {
			return service.deleteProductById(id);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}
}
