package com.example.model;

public class Phone {
	private String name;
	private String operatingSystem;
	private double price;
	private int yearOfManufacture;
	private int warrantyPeriod;
	
	public Phone() {

	}
	
	public Phone(String name, String operatingSystem, double price, int yearOfManufacture, int warrantyPeriod) {
		super();
		this.name = name;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.yearOfManufacture = yearOfManufacture;
		this.warrantyPeriod = warrantyPeriod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}
	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", operatingSystem=" + operatingSystem + ", price=" + price
				+ ", yearOfManufacture=" + yearOfManufacture + ", warrantyPeriod=" + warrantyPeriod + "]";
	}
	
}
