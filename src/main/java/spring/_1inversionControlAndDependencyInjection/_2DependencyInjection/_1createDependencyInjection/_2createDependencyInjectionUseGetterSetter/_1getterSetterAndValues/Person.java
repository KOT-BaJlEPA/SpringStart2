package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._2createDependencyInjectionUseGetterSetter._1getterSetterAndValues;

public class Person {
    private  String name;
    private  int age;
    private Pet pet;

    public Person(String name, int age, Pet pet) {
        System.out.println("Person constructor with argument");
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person constructor without argument");
    }

    @Override
    public String toString() {
        this.pet.voice();
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

}
