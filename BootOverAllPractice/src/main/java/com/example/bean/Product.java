package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	@Size(min=5, max=15, message="Enter name between range 5 & 15")
	private String name;
	
	@DecimalMin("12.15")
	private double price;
	
	@NotNull
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
