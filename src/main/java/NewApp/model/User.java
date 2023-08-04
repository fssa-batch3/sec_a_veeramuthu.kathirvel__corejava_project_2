package NewApp.model;

public class User {

	private String name;
	private String email;
	private String  Mobnum;
	private String password;
	private int  DOB ;
	private char gender;
	private int id;
	public String getName() {
		return name;
	}
	public User(String name, String email, String mobnum, String password, int dOB, char gender) {
		super();
		this.name = name;
		this.email = email;
		Mobnum = mobnum;
		this.password = password;
		DOB = dOB;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", Mobnum=" + Mobnum + ", password=" + password + ", DOB="
				+ DOB + ", gender=" + gender + "]";
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
	public int getDOB() {
		return DOB;
	}
	public void setDOB(int dOB) {
		DOB = dOB;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}