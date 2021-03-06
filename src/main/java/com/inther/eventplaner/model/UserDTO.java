package com.inther.eventplaner.model;

import lombok.Data;

@Data
public class UserDTO {
	private int id;
	private String username;
	private String password;
	private String email;
	private String firstname;
	private String lastname;
}