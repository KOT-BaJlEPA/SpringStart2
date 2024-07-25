package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._2createDependencyInjectionUseGetterSetter._1getterSetterAndValues;

public class Cat implements Pet{
    protected String name;

    public Cat() {
        System.out.println("Cat constructor without arguments");
    }

    public Cat(String name) {
        System.out.println("Cat constructor with arguments");
        this.name = name;
    }

    public void setName(String name) {
        System.out.println("Cat setName set next name -  " + name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println(" the cat " +this.name+ " says  Meow - meow");
    }
}
