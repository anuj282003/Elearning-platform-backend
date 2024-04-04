package com.example.demo.utilities;

import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "random_id")
    @GenericGenerator(name = "random_id", strategy = "com.example.demo.utilities.CustomRandomIdGenerator")
	String userId;
	String password;
	String username;
	String email;
	String userRole;
	 @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	   private List<Attendance> attendances;
	 

	public User(String userId, String password, String username, String email, String userRole,
			List<Attendance> attendances) {
		super();
		this.userId = userId;
		this.password = password;
		this.username = username;
		this.email = email;
		this.userRole = userRole;
		this.attendances = attendances;
	}
	public List<Attendance> getAttendances() {
		return attendances;
	}
	public void setAttendances(List<Attendance> attendances) {
		this.attendances = attendances;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
		this.email = email;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", username=" + username + ", email=" + email
				+ ", userRole=" + userRole + ", attendances=" + attendances + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
