package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAO.DataPersistImplementation;
import com.example.Exception.ProductException;
import com.example.bean.Product;

@RestController
public class ProductController {
	
	@Autowired
	DataPersistImplementation dao; 
	
	@GetMapping("/products")
	public List<Product> getAllProducts() throws ProductException {
		
		List<Product> li = dao.getAllProducts();
		
		return li;
	}
	
	@PostMapping("/addProducts")
	public String addProduct(@RequestBody Product product) throws ProductException {
		
		boolean flag = dao.addProduct(product);
		
		if (flag)
			return "Added Product";
		
		return "Product Not Added";
	}
}
