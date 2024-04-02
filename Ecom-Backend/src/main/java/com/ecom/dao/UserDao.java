package com.ecom.dao;

import java.util.Date;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDao {
	private int userId;
	private String name;
	private String email;
	private String password;
	private String address;
	private String gender;
	private String phone;
	private Date date;
	private boolean active;  
	

}
