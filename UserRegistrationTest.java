package com.capgemini.userregistration;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	//only tests for first name performed as RegEx for first and last names are same
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = false;
    	try {
			result = userValidator.validateFirstName("Maheswari");
		} catch (UserException e) {
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
    
    
    @Test
    public void givenFirstName_WhenNotStartCapital_ShouldReturnFalse()throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
    	try {
		userValidator.validateFirstName("mahi");
    	}catch(UserException e) {
    		e.printStackTrace();
    	}
    }
    
    @Test
    public void givenFirstName_WhenContainOtherThanLetters_ShouldReturnFalse()throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
    	try {
    		userValidator.validateFirstName("m@hi");
        	}catch(UserException e) {
        		e.printStackTrace();
        	}
    }
    
    @Test
    public void givenEmailId_WhenPoper_ShouldReturnTrue()throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = false;
    	try {
		result = userValidator.validateEmail("maheswarikoyyani999@gmail.com");
    	} catch (UserException e) {
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenEmailId_WhenNotAtTheSymbol_ShouldReturnFalse() throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
    	try {
    		userValidator.validateFirstName("mahi.com");
        	}catch(UserException e) {
        		e.printStackTrace();
        	}
    }
    
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() throws UserException{
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = false;
    	try {
		result = userValidator.validateEmail("91 8639799568");
    	} catch (UserException e) {
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenMobileNo_WhenNotProper_ShouldReturnFalse() throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
		try {
    		userValidator.validateFirstName("564321");
        	}catch(UserException e) {
        		e.printStackTrace();
        	}
    }
    
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
		boolean result = false;
    	try {
		result = userValidator.validateEmail("Msri@12");
    	} catch (UserException e) {
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    	
    }
    
    @Test
    public void givenPassword_WhenMoreThanOneSpecialChar_ShouldReturnFalse() throws UserException {
    	UserRegistration userValidator =  new UserRegistration();
    	try {
    		userValidator.validateFirstName("msg2");
        	}catch(UserException e) {
        		e.printStackTrace();
    }
    }
}
