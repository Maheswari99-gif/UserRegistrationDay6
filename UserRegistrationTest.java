package com.capgemini.userregistration;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	//only tests for first name performed as RegEx for first and last names are same
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserException{
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = false;
    	result = userValidator.validateFirstName("Maheswari");
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenFirstName_WhenNotStartCapital_ShouldReturnFalse()throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
		userValidator.validateFirstName("mahi");
    }
    
    @Test
    public void givenFirstName_WhenContainOtherThanLetters_ShouldReturnFalse()throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
		userValidator.validateFirstName("m@hi");
    }
    
    @Test
    public void givenEmailId_WhenPoper_ShouldReturnTrue()throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = false;
		result = userValidator.validateEmail("maheswarikoyyani999@gmail.com");
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenEmailId_WhenNotAtTheSymbol_ShouldReturnFalse() throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
		userValidator.validateEmail("mahi.com");
    }
    
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() throws UserException{
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = false;
		result = userValidator.validateMobileNo("91 8639799567");
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenMobileNo_WhenNotProper_ShouldReturnFalse() throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
		userValidator.validateMobileNo("564321");
    }
    
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = false;
		result = userValidator.validatePassword("Msri@12");
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenPassword_WhenMoreThanOneSpecialChar_ShouldReturnFalse() throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
		boolean result=false;
		result=userValidator.validatePassword("masr9");
		Assert.assertFalse(result);
    }
    }
