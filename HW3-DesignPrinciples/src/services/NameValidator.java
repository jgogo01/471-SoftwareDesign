//Natdanai Pinaves 6510405482
package src.services;

import src.models.User;

public class NameValidator implements Validator {

    @Override
    public void isValid(User user) {
        if (user.getName() == null || user.getName().trim().equals("")) {
            throw new IllegalArgumentException("Name should not empty");
        }
        if (!user.getName().matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Name is wrong format");
        }
    }
}
