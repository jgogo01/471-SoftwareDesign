import models.Register;
import models.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Harit", "harit@ku.th", 20);
        Register register = new Register(user);
        register.validationAll();
    }
}