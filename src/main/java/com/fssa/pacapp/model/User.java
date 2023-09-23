package com.fssa.pacapp.model;

public class User {

	private String name;
	private String email;
	private String Mobnum;
	private String password;
	private String DOB;
	private char gender;

	private int id;

	public User() {
	};

	public String getName() {
		return name;
	}

	public User(String name, String email, String mobnum, String password, String DOB, char gender) {
		this.name = name;
		this.email = email;
		this.Mobnum = mobnum;
		this.password = password;
		this.gender = gender;
	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", Mobnum=" + Mobnum + ", password=" + password + ", gender="
				+ gender + "]";
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

	public String getMobnum() {
		return Mobnum;
	}

	public void setMobnum(String mobnum) {
		Mobnum = mobnum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getGender() {
		return gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}