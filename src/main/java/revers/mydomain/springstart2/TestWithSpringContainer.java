package revers.mydomain.springstart2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithSpringContainer {
    public static void main(String[] args) {
        // create Spring Container - Application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        //get object from ApplicationContext
        Dog dog = (Dog) context.getBean("myDog");

        //call method
        dog.voice();

        //get other object from ApplicationContext
        Cat cat = (Cat) context.getBean("myCat");

        //call method on other object
        cat.voice();
    }
}
