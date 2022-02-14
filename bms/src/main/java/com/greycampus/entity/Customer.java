package com.greycampus.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_table")
public class Customer {

	@Id
	@Column(name = "Phone_Number")
	private Integer phone;
	@Column(name = "First_Name")
	private String firstname;
	@Column(name = "Last_Name")
	private String lastname;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Type")
	private String type;
	@Column(name = "House_Number")
	private Integer house;
	@Column(name = "Street")
	private String street;
	@Column(name = "City")
	private String city;
	@Column(name = "Pincode")
	private Long pincode;
	@Column(name = "State")
	private String state;
	@Column(name = "Country")
	private String country;
	@Column(name = "Created_By")
	public String created_by;
	@Column(name = "Created_On")
	public Date created_on;
	@Column(name = "Updated_By")
	public String updated_by;
	@Column(name = "Updated_On")
	public Date updated_on;
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getHouse() {
		return house;
	}
	public void setHouse(Integer house) {
		this.house = house;
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
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public Date getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}
	
	public Customer(Integer phone, String firstname, String lastname, String gender, String type, Integer house,
			String street, String city, Long pincode, String state, String country, String created_by, Date created_on,
			String updated_by, Date updated_on) {
		super();
		this.phone = phone;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.type = type;
		this.house = house;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}
	public Customer() {
	}
	
	@Override
	public String toString() {
		return "Customer [phone=" + phone + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", type=" + type + ", house=" + house + ", street=" + street + ", city=" + city + ", pincode="
				+ pincode + ", state=" + state + ", country=" + country + ", created_by=" + created_by + ", created_on="
				+ created_on + ", updated_by=" + updated_by + ", updated_on=" + updated_on + ", getPhone()="
				+ getPhone() + ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname()
				+ ", getGender()=" + getGender() + ", getType()=" + getType() + ", getHouse()=" + getHouse()
				+ ", getStreet()=" + getStreet() + ", getCity()=" + getCity() + ", getPincode()=" + getPincode()
				+ ", getState()=" + getState() + ", getCountry()=" + getCountry() + ", getCreated_by()="
				+ getCreated_by() + ", getCreated_on()=" + getCreated_on() + ", getUpdated_by()=" + getUpdated_by()
				+ ", getUpdated_on()=" + getUpdated_on() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
