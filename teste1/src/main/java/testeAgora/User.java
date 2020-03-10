package testeAgora;

public class User {
	
	public String user;
	public String pass;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public User(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	

}
