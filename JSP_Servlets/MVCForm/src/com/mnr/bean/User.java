package com.mnr.bean;


public class User {
	private String email = "";
	private String password = "";
	
	private String message = "Error validating information";
	
	public String getMessage() {
		return message;
	}

	public User() {
		
	}
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validate(){
	
		if(email == null){
			message = "No email address set.";
			return false;
		}
		
		if(password == null){
			message = "no password set.";
			return false;
			
		}
		if(!email.matches("\\w+@\\w+\\.\\w+")){
			message = "Invalid email address";
			return false;
		}
		
		
		if(password.length() < 8){
			message = "Password too short";
			return false;
		}
		else if(password.matches("\\w*\\s+\\w*")){
			message = "Password can't contain space.";
			return false;
		}
		
		return true;
	}


}
