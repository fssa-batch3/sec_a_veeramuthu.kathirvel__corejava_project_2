package com.fssa.pacapp.model;

public class Packages {
	
	private String imageURL;
	private String description;
	private int price;
	private String duration;
	 
	public Packages(){
		
		
	}
	public Packages(String image, int price, String duration, String description) {
		this.imageURL = image;
		this.description = description;
		this.price = price;
		this.duration = duration;
	}
	
	public String getImage() {
		return imageURL;
	}
	public void setImage(String image) {
		this.imageURL = image;
	}
	public String getDescription() {
		return description;
	}
	
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "book2 [image=" + imageURL + ", description=" + description + ", price=" + price + ", duration=" + duration
				+ "]";
	}
	
	

}
