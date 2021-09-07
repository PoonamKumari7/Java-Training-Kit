package com.techment.dto;

public class CustomerDto {
	
	private int id;
	private String name;
	private String address;
	private int age;
	private String email;
	private String mobile;
	
	
	
	public CustomerDto(int id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public CustomerDto() {
		super();
	}

	public CustomerDto(int id, String name, String address, int age, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
}
