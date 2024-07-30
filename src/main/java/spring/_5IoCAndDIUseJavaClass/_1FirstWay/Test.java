package spring._5IoCAndDIUseJavaClass._1FirstWay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        spring._5IoCAndDIUseJavaClass._1FirstWay.Configuration1.class);
        Windowsill windowsill = context.getBean("windowsillBean", Windowsill.class);
        windowsill.getInfo();

        Plant plant1 = context.getBean("chamomileBean", Plant.class);
        plant1.getSpecies();
        Plant plant2 = context.getBean("wormwoodBean", Plant.class);
        plant2.getSpecies();
        context.close();
    }
}
