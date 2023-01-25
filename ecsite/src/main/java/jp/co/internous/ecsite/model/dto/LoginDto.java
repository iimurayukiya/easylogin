package jp.co.internous.ecsite.model.dto;

import jp.co.internous.ecsite.model.entity.User;

public class LoginDto {
	
	private long id;
	private String userName;
	private String password;
	private String fullName;
	
	public LoginDto(org.springframework.boot.autoconfigure.security.SecurityProperties.User user) {}
	
	public LoginDto(User user) {
		this.setId(user.getId());
		this.setUserName(user.getUserName());
		this.setPassword(user.getPassword());
		this.setFullName(user.getFullName());
	}

	public LoginDto(long id, String userName, String password, String fullName) {
		this.setId(id);
		this.setUserName(userName);
		this.setPassword(password);
		this.setFullName(fullName);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
