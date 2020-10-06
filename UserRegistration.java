package com.capgemini.userregistration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class UserRegistration {
	
	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);
	
	public boolean validateFirstName(String firstName) throws UserException {
		if(firstName.matches("^[A-Z]{1}[a-z]{2,}$"))
			return true;
		else
			throw new UserException("Invalid First Name");
	}

	public boolean validateLastName(String lastName) throws UserException {
		if(lastName.matches("^[A-Z]{1}[a-z]{2,}$"))
			return true;
		else 
			throw new UserException("Invalid Last Name");
	}	

	public boolean validateEmail(String emailId) throws UserException {
		if(emailId.matches("^[a-zA-Z0-9_]+([.+-]{1}[a-zA-Z0-9_]+)*[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z]{2,})?$"))
			return true;
		else
			throw new UserException("Invalid Email Id");
	}

	public boolean validateMobileNo(String mobileNo) throws UserException {
		if(mobileNo.matches("^[0-9]{2}[ ][0-9]{10}$"))
			return true;
		else
			throw new UserException("Invalid Mobile No");
	}

	public boolean validatePassword(String password) throws UserException {
		if(password.matches("(?=^.{8,}$)(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*[@#$%_][0-9a-zA-Z]*"))
			return true;
		else
			throw new UserException("Invalid Password");
	}


	public static void main( String[] args ) {
		UserRegistration userRegistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		LOG.info("First Name: ");
		try {
		String firstName = sc.nextLine();
		if(!(userRegistration.validateFirstName(firstName)))
			throw new UserException("Invalid First Name");
		}
		catch(UserException e) {
			
		}
		LOG.info("Last Name: ");
		try {
		String lastName = sc.nextLine();
		if(!(userRegistration.validateLastName(lastName)))
			throw new UserException("Invalid Last Name");
		}
		catch(UserException e) {
			
		}

		LOG.info("Email ID: ");
		try {
		String emailId = sc.nextLine();
		if(!(userRegistration.validateEmail(emailId)))
			throw new UserException("Invalid Email");
		}
		catch(UserException e) {
			
		}
		LOG.info("Mobile No: ");
		try {
		String mobileNo = sc.nextLine();
		if(!(userRegistration.validateMobileNo(mobileNo)))
			throw new UserException("Invalid Mobile Number");
		}
		catch(UserException e) {
			
		}

		LOG.info("Password: ");
		try {
		String password = sc.nextLine();
		if(!(userRegistration.validatePassword(password)))
			throw new UserException("Invalid Password");
		}
		catch(UserException e) {
			
		}
	}
	
}


