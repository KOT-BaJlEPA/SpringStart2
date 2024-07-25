package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._2createDependencyInjectionUseGetterSetter._1getterSetterAndValues;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("_1inversionControlAndDependencyInjection/appContextFor_gettingSetterAndValues.xml");
        Person person = context.getBean("myPerson", Person.class);
        String s = person.toString();
        System.out.println(s);
        context.close();
    }
}
