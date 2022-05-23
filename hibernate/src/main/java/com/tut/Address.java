package com.tut;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table (name="Address_Data")

public class Address {
	//generatedValue: auto generation of id 
	@Id @GeneratedValue
	private int address_id;
	
	@Column (name="Street_name")
	private String street;
	
	//it will not be formed during table creation
	@Transient  
	private String landmark;
	
	//character limit
	@Column (length=6, nullable=true)
	private String pincode;
	
	//used for date only: Temporal
	@Temporal (TemporalType.DATE)
	private Date address_update;
	private boolean ispermenant;
	
	//lob, many to one (foreign key), one to many
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int address_id, String street, String landmark, String pincode, Date address_update,
			boolean ispermenant) {
		super();
		this.address_id = address_id;
		this.street = street;
		this.landmark = landmark;
		this.pincode = pincode;
		this.address_update = address_update;
		this.ispermenant = ispermenant;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Date getAddress_update() {
		return address_update;
	}
	public void setAddress_update(Date address_update) {
		this.address_update = address_update;
	}
	public boolean isIspermenant() {
		return ispermenant;
	}
	public void setIspermenant(boolean ispermenant) {
		this.ispermenant = ispermenant;
	}
	
}