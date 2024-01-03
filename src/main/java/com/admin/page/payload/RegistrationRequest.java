package com.admin.page.payload;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regId;
	private String userId;
	private String assessment;
	private String date;
	private String testType;
}
