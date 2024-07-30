package spring._5IoCAndDIUseJavaClass._2SecondWay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("chamomileBean")//id of Bean
@Scope("prototype") // setting scope
public class Chamomile implements Plant {
    private static int count = 0;
    @Value("${plant.chamomile}") // setting value of field
    private String specify;

    public Chamomile() {
        count++;
        System.out.println("                Wormwood Chamomile --" + count + "\n");

    }


    @Override
    public void getSpecies() {
        System.out.println("                I am " + this.specify + count);
    }
}
