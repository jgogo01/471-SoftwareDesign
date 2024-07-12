//Natdanai Pinaves 6510405482
package services;

import models.User;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    List<String> notAllowDomains = Arrays.asList("ku.th","live.ku.th", "kutech.club");

    @Override
    public void isValid(User user) {
        if (user.getEmail() == null || user.getEmail() .trim().equals("")) {
            throw new IllegalArgumentException("Name should not empty");
        }
        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if(!validEmailPattern.matcher(user.getEmail()).matches()) {
            throw new IllegalArgumentException("Email is wrong format");
        }
        if(notAllowDomains.contains(user.getEmail().split("@")[1])) {
            throw new IllegalArgumentException("Domain Email is not allow");
        }
    }
}
