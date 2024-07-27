package spring._2BeanScope._2prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("_2BeanScope/appContextBeanScope.xml");
        System.out.println(" the object Flat and BathRoom will not be called until we cal the method getBean()");

        Flat2 flat1 = (Flat2) context.getBean("myFlat2", Flat2.class);
        Flat2 flat2 = (Flat2) context.getBean("myFlat2", Flat2.class);

        System.out.println();
        System.out.println( "   flat1   " + flat1);
        System.out.println( "       flat2   " + flat2);
        System.out.println();

        System.out.println(" change number of flat2 ");
        flat2.setNumberOfFlat(18);

        System.out.println();
        System.out.println( "   flat1   " + flat1);
        System.out.println( "       flat2   " + flat2);
        System.out.println(" it means that context return new object every time when we called the method getBean()");

        System.out.println();
        System.out.println(context.getBean("myFlat2", Flat2.class) == context.getBean("myFlat2", Flat2.class));
        //false
        context.close();



    }
}
