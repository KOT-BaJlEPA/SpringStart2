package spring._5IoCAndDIUseJavaClass._1FirstWay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wormwoodBean") // bean id
@Scope("prototype") // setting scope
public class Wormwood implements Plant{
    private static int count = 0;
    @Value("${plant.wormWood}")//setting value of field
    private String specify;

    public Wormwood() {
        count++;
        System.out.println("                Wormwood constructor --" + count + "\n");

    }

    @Override
    public void getSpecies() {
        System.out.println("                I am " + this.specify + count);
    }
}
