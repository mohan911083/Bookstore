/**
 * 
 */
package com.bridgelabz.bookstore.dto;

import lombok.Data;

@Data
public class UserDto {
	private String name;
	private String email;
	private String password;
	private Long mobileNumber;
	private String role;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	/*public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setMobileNumber(long l) {
		// TODO Auto-generated method stub
		
	}
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setRole(String string) {
		// TODO Auto-generated method stub
		
	}*/

}
