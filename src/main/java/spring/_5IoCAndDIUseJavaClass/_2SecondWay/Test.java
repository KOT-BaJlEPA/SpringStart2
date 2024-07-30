package spring._5IoCAndDIUseJavaClass._2SecondWay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        Configuration2.class);
        Windowsill windowsill = context.getBean("getWindowsill", Windowsill.class);
        windowsill.getInfo();

        Plant plant1 = context.getBean("getChamomile", Plant.class);
        plant1.getSpecies();
        Plant plant2 = context.getBean("getWormwood", Plant.class);
        plant2.getSpecies();
        context.close();
    }
}
