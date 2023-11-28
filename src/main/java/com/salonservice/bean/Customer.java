package com.salonservice.bean;


import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;
	private String email;
	private String contactNo;
	private String password;
	private String dob;

	private Role role=Role.CUSTOMER;
	
	@OneToOne
	private Address address;

	@OneToMany
	private List<Order> orders = new ArrayList<Order>();

	

	public Customer() {
		super();
	}

	public Customer(Integer id, String name, String email, String contactNo, String password, String dob, Role role,
			Address address, List<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.password = password;
		this.dob = dob;
		this.address = address;
		this.orders = orders;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}


		
}

