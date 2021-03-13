package com.model;

public class StudentBean {
	private int id;
	private String firstName;
	private String lastName;
	private String city;
	private int age;
	private String country;
	private String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public StudentBean(String firstName, String lastName, String city, int age, String country, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.age = age;
		this.country = country;
		this.gender = gender;
	}
	
	
	
	

}
