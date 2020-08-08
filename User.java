package com.revature.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;



public class User {
	
	private Integer id;
	
	private String name;
	
	@Size(min=2, message="The name must have at least 2 letters")
	private String first;
	
	private String middle;
	
	private String last;
	
	private String address;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private String zip;
	
	private String phone;
	
	private String number;
	
	private String email;
	
	protected User() {
		
	}
	
	

	public User(Integer id, @Size(min = 2, message = "The name must have at least 2 letters") String name,
			String first, String middle, String last, String address, String street, String city, String state,
			String zip, String phone, String number, String email) {
		super();
		this.id = id;
		this.name = name;
		this.first = first;
		this.middle = middle;
		this.last = last;
		this.address = address;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.number = number;
		this.email = email;
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

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", first=" + first + ", middle=" + middle + ", last=" + last
				+ ", address=" + address + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", phone=" + phone + ", number=" + number + ", email=" + email + "]";
	}
	
	

}
