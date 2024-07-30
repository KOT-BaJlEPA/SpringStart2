package spring._4annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("_4annotation/appConfigAnnotation.xml");
        Garage garage = (Garage) context.getBean("garageBean", Garage.class);
        garage.getAutomobile();
        context.close();
    }
}
