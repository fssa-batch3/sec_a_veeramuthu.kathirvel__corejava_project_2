package com.fssa.pacapp.model;

public class PackageBook {
	
	private String name;
	private String email;
	private boolean hotel;
	private String food ;
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
	public boolean isHotel() {
		return hotel;
	}
	public void setHotel(boolean hotel) {
		this.hotel = hotel;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public PackageBook(String name, String email, boolean hotel, String food) {
		super();
		this.name = name;
		this.email = email;
		this.hotel = hotel;
		this.food = food;
	}


}
