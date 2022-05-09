package com.example.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String name;
	private double price;
	private String brand;
	private String category;
	private int reg_no;
	private String manufacturer_id;
		
	public Product() {
		super();
	}

	public Product(String name, double price, String brand, String category, int reg_no,
			String manufacturer_id) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.category = category;
		this.reg_no = reg_no;
		this.manufacturer_id = manufacturer_id;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReg_no() {
		return reg_no;
	}

	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}

	public String getManufacturer_id() {
		return manufacturer_id;
	}

	public void setManufacturer_id(String manufacturer_id) {
		this.manufacturer_id = manufacturer_id;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", category="
				+ category + ", reg_no=" + reg_no + ", manufacturer_id=" + manufacturer_id + "]";
	}
	
}
