//Natdanai Pinaves 6510405482
package src.models;

import src.services.AgeValidator;
import src.services.EmailValidator;
import src.services.NameValidator;
import src.services.Validator;
import java.util.Arrays;

import java.util.List;

public class Register {
    private final User user;
    List<Validator> validators = Arrays.asList(
            new NameValidator(),
            new EmailValidator(),
            new AgeValidator()
    );

    public Register(User user){
        this.user = user;
    }

    public boolean validationAll(){
        for(Validator validator : validators){
            validator.isValid(user);
        }
        return true;
    }
}
