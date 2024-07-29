package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._3createDependencyInjectionUseAutowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._3createDependencyInjectionUseAutowired._1AutowiredToConstructor.Nokia;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("_1inversionControlAndDependencyInjection/_4dependencyInjectionUseAutowired/applicationConfigAutowired.xml");
        Smartphone smartphone1 = context.getBean("nokiaBean", Smartphone.class);
        Smartphone smartphone2 = context.getBean("nokia2Bean", Smartphone.class);
        Smartphone smartphone3 = context.getBean("nokia3Bean", Smartphone.class);

        smartphone1.getBrand();
        smartphone2.getBrand();
        smartphone3.getBrand();

        context.close();
    }
}
