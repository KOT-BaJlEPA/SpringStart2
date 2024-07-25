package spring._1inversionControlAndDependencyInjection._1inversionContol._1introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithSpringContainer {
    public static void main(String[] args) {
        // create Spring Container - Application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("_1inversionControlAndDependencyInjection/appContext.xml");

        //get object from ApplicationContext
        Dog dog = (Dog) context.getBean("myDog");

        //other way create dog
        Pet dog2 = context.getBean("myDog", Pet.class);

        //call method
        dog.voice();
        dog2.voice();

        //get other object from ApplicationContext
        Cat cat = (Cat) context.getBean("myCat");

        //other way create cat
        Pet cat2 = context.getBean("myCat", Pet.class);

        //call method on other object
        cat.voice();
        cat2.voice();

        //close String Container - ApplicationContext
        context.close();
    }
}
