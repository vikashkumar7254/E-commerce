package com.ecom.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="user_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int userId;
	@Column(nullable=false)
	private String name;
	@Column(unique=true, nullable=false)
	private String email;
	@Column(nullable=false)
	private String password;
	private String address;
//	private String about;
	@Column(nullable=false)
	private String gender;
	@Column(nullable=false, length=10)
	private String phone;
	@Column(name="CreateAt")
	private Date date;
	private boolean active;
	@OneToOne(mappedBy="user")
	private Cart cart;
	@ManyToMany(fetch=FetchType.EAGER)
	Set<Roles>role= new HashSet<>();

	
}
