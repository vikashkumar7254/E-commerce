package com.ecom.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Seller {

	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
	private Integer sellerId;

	@NotNull(message = "Please enter the first name")
	@Pattern(regexp = "[A-Za-z\\s]+", message = "First Name should contains alphabets only")
	private String firstName;

	@NotNull(message = "Please enter the last name")
	@Pattern(regexp = "[A-Za-z\\s]+", message = "last Name should contains alphabets only")
	private String lastName;

	@Pattern(regexp = "[A-Za-z0-9!@#$%^&*_]{8,15}", message = "Please Enter a valid Password")
	private String password;

	@NotNull(message = " Please Enter Your Mobile Number")
	@Pattern(regexp = "[6789]{1}[0-9]{9}", message = "Enter a valid Mobile Number")
	private Integer mobile;

	@Email
	private String emailId;

	private List<Product> product;

}
