package com.bridgelabz.userregistration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {
    UserRegistration user;

    @Before
    public void UserRegistrationObjectCreation() {
        user = new UserRegistration();
    }

    @After
    public void nullObject() {
        user = null;
    }

    @Test
    public void testFirstName_WhenProper_ShouldReturnTrue() {
        try {
            assertEquals(true, user.validateFirstName("Dipesh"));
        } catch (InvalidUserDetailsException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void testFirstName_WhenProper_ShouldReturnFalse() {
        try {
            assertEquals(true, user.validateLastName("dipesh"));
        } catch (InvalidUserDetailsException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void testLastName_WhenProper_ShouldReturnTrue() {
        try {
            assertEquals(true, user.validateLastName("Rathod"));
        } catch (InvalidUserDetailsException ex) {
            ex.printStackTrace();
        }

    }

    @Test
    public void testLastName_WhenProper_ShouldReturnFalse() {
        try {
            assertEquals(true, user.validateLastName("rathod"));
        } catch (InvalidUserDetailsException ex) {
            ex.printStackTrace();
        }

    }

    @Test
    public void testEmail_WhenProper_ShouldReturnTrue() {
        try {
            assertEquals(true, user.validateEmail("xyz@gmail.com"));
        } catch (InvalidUserDetailsException ex) {
            ex.printStackTrace();
        }

    }

    @Test
    public void testEmail_WhenProper_ShouldReturnFalse() {
        try {
            assertEquals(true, user.validateEmail("abc.123.oi@gmail.com"));
        } catch (InvalidUserDetailsException ex) {
            ex.printStackTrace();
        }

    }

    @Test
    public void testMobileNumber_WhenProper_ShouldReturnTrue() {
        try {
            assertEquals(true, user.validateMobileNumber("91-9856324174"));
        } catch (InvalidUserDetailsException ex) {
            ex.printStackTrace();
        }

    }

    @Test
    public void testMobileNumber_WhenProper_ShouldReturnFalse() {
        try {
            assertEquals(true, user.validateMobileNumber("91 7995840125"));
        } catch (InvalidUserDetailsException ex) {
            ex.printStackTrace();
        }

    }

    @Test
    public void testPassword_WhenProper_ShouldReturnTrue() {
        try {
            assertEquals(true, user.validatePassword("Dipesh@1"));
        } catch (InvalidUserDetailsException ex) {
            ex.printStackTrace();
        }

    }

    @Test
    public void testPassword_WhenProper_ShouldReturnFalse() {
        try {
            assertEquals(true, user.validatePassword("dipesh1"));
        } catch (InvalidUserDetailsException ex) {
            ex.printStackTrace();
        }

    }
}
