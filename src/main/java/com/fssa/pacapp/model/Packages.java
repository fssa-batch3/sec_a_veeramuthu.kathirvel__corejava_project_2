package com.fssa.pacapp.model;

public class Packages {
	private int id;
	private String imageURL;
	private String description;
	private int price;
	private String duration;

	

	public Packages(String image, int price, String duration, String description) {
		this.imageURL = image;
		this.description = description;
		this.price = price;
		this.duration = duration;
	}

	public Packages(String image, int price, String duration, String description, int id) {
		this.imageURL = image;
		this.description = description;
		this.price = price;
		this.duration = duration;
		this.id = id;
	}
	public Packages(int id) {
		this.id = id;
		
	}


	
	public Packages() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "book2 [id="+ id +", image=" + imageURL + ", description=" + description + ", price=" + price + ", duration="
				+ duration + "]";
	}

	public Object getUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPackageId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
