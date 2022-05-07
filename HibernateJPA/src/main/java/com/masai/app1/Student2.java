package com.masai.app1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userStudent")
public class Student2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userId")
	private int id;
	@Column(name="userName")
	private String name;
	@Column(name="userAddress")
	private String address;
	@Column(name="userCity")
	private String city;
		
	public Student2() {
		super();
	}

	public Student2(int id, String name, String address, String city) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + "]";
	}
}
