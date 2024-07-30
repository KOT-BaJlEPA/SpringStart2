package spring._4annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fordBean")// setting id of Bean
@Scope("prototype")// setting scope it is means that every time when get bean will be created the new object
public class Ford implements Automobile{
    @Value("${automobile.ford}") //for get value from property file
    private String brand;

    public Ford() {
        System.out.println("            Ford Constructor -");
    }

    @Override
    public void ride() {
        System.out.println("     The " + this.brand + "   is cumming ");
    }
}
