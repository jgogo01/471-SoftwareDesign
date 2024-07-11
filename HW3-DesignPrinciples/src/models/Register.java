package models;

import services.AgeValidator;
import services.EmailValidator;
import services.NameValidator;
import services.Validator;

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
