package com.salonservice.bean;

public class CustomerDTO {

	private Integer id;

	private String name;
	private String email;
	private String contactNo;
	private String password;
	private String dob;
	
	public CustomerDTO() {
		super();
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	public CustomerDTO(Integer id, String name, String password, String contactNo, String email, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.contactNo = contactNo;
		this.email = email;
		this.dob = dob;
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


}
