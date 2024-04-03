package com.ecom.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SellerSession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer sessionId;

	private String token;

	private String userType;

	private LocalDateTime sessionStartTime;

	private LocalDateTime sessionEndTime;

}
