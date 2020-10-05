package com.capgemini.userregistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	//only tests for first name performed as RegEx for first and last names are same
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateFirstName("Maheswari");
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenFirstName_WhenNotStartCapital_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateFirstName("mahi");
    	Assert.assertFalse(result);
    }
    
    @Test
    public void givenFirstName_WhenContainOtherThanLetters_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateFirstName("m@hi");
    	Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateLastName("Koyyani");
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenLastName_WhenNotStartCapital_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateLastName("koyyani");
    	Assert.assertFalse(result);
    }
    
    @Test
    public void givenLastName_WhenContainOtherThanLetters_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateLastName("k@yyani");
    	Assert.assertFalse(result);
    }
    
    @Test
    public void givenEmailId_WhenPoper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateEmail("maheswarikoyyani999@gmail.com");
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenEmailId_WhenNotAtTheSymbol_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateEmail("mahi.com");
    	Assert.assertFalse(result);
    }
    
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateMobileNo("91 8639799567");
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenMobileNo_WhenNotProper_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validateMobileNo("564321");
    	Assert.assertFalse(result);
    }
    
   
    
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validatePassword("Msri@12");
    	Assert.assertTrue(result);
    }
    
    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
    	UserRegistration userValidator =  new UserRegistration();
    	boolean result = userValidator.validatePassword("masr9");
    	Assert.assertFalse(result);
    }
}