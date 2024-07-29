package spring._1inversionControlAndDependencyInjection._3configurationFileUseAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring._1inversionControlAndDependencyInjection._3configurationFileUseAnnotation._1test.Color;
import spring._1inversionControlAndDependencyInjection._3configurationFileUseAnnotation._1test.Color2;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("_1inversionControlAndDependencyInjection/_3withAnnotation/applicationContextUseAnnotation.xml");
        Color color = context.getBean("colorBean", Color.class);
        Color2 color2 = context.getBean("color2", Color2.class);//by default id
        context.close();

    }
}
