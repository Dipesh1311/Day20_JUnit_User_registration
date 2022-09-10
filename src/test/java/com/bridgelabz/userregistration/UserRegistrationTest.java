package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void testFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("Dipesh");
        Assert.assertEquals(true, result);
    }
    @Test
    public void testLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateLastName("Rathod");
        Assert.assertEquals(true, result);
    }
    @Test
    public void testEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateEmail("abc.xyz@gmail.com.in");
        Assert.assertEquals(true, result);
    }
}
