package src;//Natdanai Pinaves 6510405482
import src.models.Register;
import src.models.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Harit", "harit@ku.th", 20);
        Register register = new Register(user);
        register.validationAll();
    }
}