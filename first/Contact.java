package com.example.demo;

public class Contact {
	private String roll;
    private String name;
    private String email;
    
 
    public Contact() {
        super();
    }
 
    public Contact( String roll,String name, String email) {
        super();
        this.roll = roll;
        this.name = name;
        this.email = email;
        
    }
    

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	
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

	
 
   
 
}