package com.masai.app1;

import java.util.List;
import java.util.Set;

import javax.annotation.processing.Generated;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "CustomTable")
public class Student {

	@Id
	@Column(name = "StudentId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "StudentName")
	private String name;
	
	@OneToMany(cascade= CascadeType.ALL)
	private List<Address> adress;	

//	@Embedded
//	@AttributeOverrides ( {
//		@AttributeOverride(name="pinCode",column=@Column(name="schlPin")),
//		@AttributeOverride(name="street",column=@Column(name="schlStreet")),
//	})
//	private Address Schladdress;
//	
//	@Embedded
//	@AttributeOverrides ({
//		@AttributeOverride(name="pinCode",column=@Column(name="homePin")),
//		@AttributeOverride(name="street",column=@Column(name="homeStreet")),
//	})
//	private Address homeAddress;

	@Column(name = "StudentCIty")
	private String city;

	public Student(String name, List<Address> adress, String city) {
		super();
		this.name = name;
		this.adress = adress;
		this.city = city;
	}

	public Student() {
		super();
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

	public List<Address> getAdress() {
		return adress;
	}

	public void setAdress(List<Address> adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", adress=" + adress + ", city=" + city + "]";
	}

	

}
