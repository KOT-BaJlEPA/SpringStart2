package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._1createDependencyInjectionUseConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _1Test {
    public static void main(String[] args) {
        //Create Spring Container(Application context)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "_1inversionControlAndDependencyInjection/AppContextFor_1useConstructor.xml");
        //get Object from context
        House house = context.getBean("house", House.class);
        System.out.println(house);
        context.close();
    }
}
