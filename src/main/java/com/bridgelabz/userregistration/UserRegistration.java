package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String fname) {

        return Pattern.matches(FIRST_NAME_PATTERN, fname);
    }
    String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateLastName(String lname) {
        return Pattern.matches(LAST_NAME_PATTERN, lname);
    }
    private static final String EMAIL_PATTERN = "^[a-z]{3,}[.\\w]*@[\\w]{3,}.[\\w]{2,3}[.a-z]*$";

    public boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_PATTERN, email);
    }
    private static final String MOBILENUMBER_PATTERN = "^[1-9]{2}-[1-9]{1}[\\d]{9}";

    public boolean validateMobileNumber(String mobileNumber) {
        return Pattern.matches(MOBILENUMBER_PATTERN, mobileNumber);
    }
    private static final String PASSWORD_PATTERN = "[A-Z]{1}[a-zA-Z]{7,}";

    public boolean validatePassword(String password) {
        return Pattern.matches(PASSWORD_PATTERN, password);
    }

}
