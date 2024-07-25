package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._2createDependencyInjectionUseGetterSetter._2setterAndValuesUsePropertyFile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextFor_setterAndValuesUseFileProperties.xml");
        Color c = (Color) context.getBean("myColor");
        System.out.println(c);
        context.close();
    }
}
