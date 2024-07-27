package spring._3LifeCircleOfBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreateInitAndDestroyMethod {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("_3LifeCircleOfBean/appContextFor_createMethodIInitAndDestroy.xml");
        System.out.println("        before create Been");
        Triangle triangle = (Triangle) context.getBean("myTriangle");
        System.out.println(triangle);
        System.out.println("        after create Been");
        context.close();
        System.out.println("        after close context");
    }
}
