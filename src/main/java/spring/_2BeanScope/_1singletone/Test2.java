package spring._2BeanScope._1singletone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextBeanScope.xml");
        System.out.println(" the object Flat and BathRoom is created regardless of we call context.getBean() or not");

        Flat flat1 = (Flat) context.getBean("myFlat");
        Flat flat2 = (Flat) context.getBean("myFlat");

        System.out.println();
        System.out.println( "   flat1   " + flat1);
        System.out.println( "       flat2   " + flat2);
        System.out.println();

        System.out.println(" change number of flat2 ");
        flat2.setNumberOfFlat(18);

        System.out.println();
        System.out.println( "   flat1   " + flat1);
        System.out.println( "       flat2   " + flat2);
        System.out.println(" it means that context return only one object");
        context.close();



    }
}
