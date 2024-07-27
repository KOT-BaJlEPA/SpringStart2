package spring._3LifeCircleOfBean;

public class Triangle {
    private int a, b, c;
    public Triangle() {
        System.out.println("Triangle constructor-");
    }
    public Triangle(int a, int b, int c) {
        System.out.println("Triangle constructor +");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        System.out.println("Triangle setA");
        this.a = a;
    }

    public void setB(int b) {
        System.out.println("Triangle setB");
        this.b = b;
    }

    public void setC(int c) {
        System.out.println("Triangle setC");
        this.c = c;
    }

    public void init (){
        System.out.println("Init Triangle " +
                "\n this method run after create Spring Container  and before getBean()" +
                " \n the name of the method can be any it is not necessary the init-method");
    }

    public void destroy(){
        System.out.println("destroy Triangle " +
                "\n this method run after context.close()  and before finish of program" +
                " \n the name of the method can be any it is not necessary the destroy-method");
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
