package spring._4annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("chevroletBean")// setting id of Bean
@Scope("prototype")// setting scope it is means that every time when get bean will be created the new object
public class Chevrolet implements Automobile{

    @Value("${automobile.chevrolet}") //for get value from property file
    private String brand;

    public Chevrolet(){
            System.out.println("            Chevrolet created -");
        }

    @Override
    public void ride() {
            System.out.println("     The " + this.brand + "   is cumming ");
        }
}
