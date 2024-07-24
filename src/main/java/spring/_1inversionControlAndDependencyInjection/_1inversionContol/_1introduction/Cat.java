package spring._1inversionControlAndDependencyInjection._1inversionContol._1introduction;

public class Cat implements Pet{
    @Override
    public void voice() {
        System.out.println("Meow -meow");
    }
}
