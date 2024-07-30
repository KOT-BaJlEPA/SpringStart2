package spring._5IoCAndDIUseJavaClass._1FirstWay;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component("windowsillBean")// bean id
@Scope("prototype") // setting scope
public class Windowsill  {
    private static int count = 0;
private List<Plant> plantList = new ArrayList<Plant>();
//public Windowsill() {
//    System.out.println("                Windowsill constructor --");
//}

    public Windowsill(@Qualifier("chamomileBean") Plant plant1, @Qualifier("wormwoodBean") Plant plant2) {
        this.plantList.add(plant1);
        this.plantList.add(plant2);
        count++;
        System.out.println("                Windowsill constructor ++" + count);
    }

    public void getInfo(){
        Iterator<Plant> iterator = this.plantList.iterator();
        while (iterator.hasNext()){
            System.out.println("        Plant " + count);
            iterator.next().getSpecies();
        }
    }

}
