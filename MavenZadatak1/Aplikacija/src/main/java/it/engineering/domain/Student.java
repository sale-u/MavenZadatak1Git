package it.engineering.domain;

public class Student {
	
	private final String userName;
	private final String email;
	
	public Student(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Student [userName=" + userName + ", email=" + email + "]";
	}
	
	

}
