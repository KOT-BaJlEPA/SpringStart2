package spring._5IoCAndDIUseJavaClass._2SecondWay;

import org.springframework.stereotype.Component;

//@Component("plantBean")//id of Bean
public interface Plant {
    default void getSpecies(){
        System.out.println("                I am Plant");
    }

}
