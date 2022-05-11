package com.example.DAO;

import java.util.List;


import com.example.Exception.ProductException;
import com.example.bean.Product;

public interface DataPersistInterface {
	
	public List<Product> getAllProducts() throws ProductException;
	public Product getProductById(int id) throws ProductException;
	public boolean addProduct(Product product) throws ProductException;
	public boolean deleteProductById(int id) throws ProductException;
	public boolean updateProduct(int id, Product product) throws ProductException;
}
