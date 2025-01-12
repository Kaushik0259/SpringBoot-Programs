package com.anudip.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherDTO {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	
//	@Column(length=25, nullable = false)
	//@NotBlank(message="Teacher name can not be blank..") // validation
	private String tname;
	
//	@Column(length=25,nullable = false)
	//@NotBlank(message="Trainer surname name can not be blank..") // validation
	private String tsurname;
	
//	@Column(length=25,nullable = false, unique=true)
	//@NotBlank(message="Trainer email can not be blank..") // validation
	//@Email(message="Email id is not proper")
	private String temail;
	
//	@Column(length=25,nullable = false, unique=true)
	//@NotBlank(message="Phone Number can not be blank..") // validation
	private String tphone;
	
//	@Column(length=25,nullable = false)
	//@NotBlank(message="Designation can not be blank..") // validation
	private String designation;


}
