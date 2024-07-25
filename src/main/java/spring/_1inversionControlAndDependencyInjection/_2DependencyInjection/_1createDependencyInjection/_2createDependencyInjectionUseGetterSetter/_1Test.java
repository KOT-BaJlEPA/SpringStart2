package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._2createDependencyInjectionUseGetterSetter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _1Test {
    public static void main(String[] args) {
        //Create Spring Container(Application context)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "_1inversionControlAndDependencyInjection/AppContextFor_2useGetterSetter.xml");
        //get Object from context
        House house = context.getBean("house", House.class);
        System.out.println(house);
        context.close();
    }
}
