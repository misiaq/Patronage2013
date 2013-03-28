package task2.model;

import java.util.Date;

public class PlayerModel {

	private Long id;
	private String username;
	private String email;
/*	 	
  	private String gender;
	private String phonenumber;
	private String phoneOS;
	
	*/
	private Date date;

	public PlayerModel (){
		
	}
	
	public PlayerModel(String username, String email){
		this.username = username;
		this.email = email;
		this.date = new Date();
	}
/*	
	public PlayerModel(String username, String email, String gender, String phonenumber, String phoneOS){
		this.username = username;
		this.email = email;
		this.gender = gender;
		this.phonenumber = phonenumber;
		this.phoneOS = phoneOS;
		this.date = new Date();
	}
	*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = username;
    }

    /*
     * 
     * tutaj reszta bedzie
     * 
     * */

    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
	
}
