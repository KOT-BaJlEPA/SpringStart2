package spring._2BeanScope._1singletone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextBeanScope.xml");
        System.out.println(" the object Flat and BathRoom is created regardless of we call context.getBean() or not");
    }
}
