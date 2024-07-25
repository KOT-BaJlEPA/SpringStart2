package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._2createDependencyInjectionUseGetterSetter._1getterSetterAndValues;

public class Dog implements Pet{

    protected String name;

    public Dog() {
        System.out.println("Dog constructor without arguments");
    }

    public Dog(String name) {
        System.out.println("Dog constructor with arguments");
        this.name = name;
    }

    public void setName(String name) {
        System.out.println("Dog setName set next name -  " + name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println(" the Dog " +this.name+ " says  bow - wow");
    }
}
