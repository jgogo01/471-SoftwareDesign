package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DataSourceDB dataSourceDB = new DataSourceDB();
//        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
//        Bank bank = new Bank("My Bank", dataSourceFile);
//        ATM atm = new ATM(bank);
//        AtmUI atmUI = new AtmUI(atm);

        //Spring handel create object
        ApplicationContext context = new AnnotationConfigApplicationContext("bean.xml");
        //Get Return Object From Spring
        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}
