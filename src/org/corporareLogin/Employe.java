package org.corporareLogin;

public class Employe {
	
	private String username;
	private int password;
	
public void setUsername(String username) {
	
	if(username.equals("suresh")) {
		this.username  ="suresh personal account";
	}
	
		else if(username.equals("ravi")) {
			this.username ="ravi personal account";
		}
	
		else if(username.equals("sarath")) {
			this.username = "hcl office account";
		}
		else {
			this.username ="there is incorrect account";
		}
		}
	

public void setPassword(int password) {
	if(password==1234) {
		this.password=10000;
	}
	else if(password==4321) {
		this.password=20000;
	}
	else if(password==76541)
	{
		this.password=30000;
	}
	else {
		this.password=0;
	}
}
	public String  getUsername() {
		return username;
	}
	public int getpassword() {
		return password;
		
		
		
	}
		
	
	}




	

	


