package spring._1inversionControlAndDependencyInjection._1inversionContol._1introduction;

public class TestWihoutSpringContainer {
    public static void main(String[] args) {
        Pet dog = new Dog();
		dog.voice();
    }
}
