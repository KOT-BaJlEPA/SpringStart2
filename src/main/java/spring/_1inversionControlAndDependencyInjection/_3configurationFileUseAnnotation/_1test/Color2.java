package spring._1inversionControlAndDependencyInjection._3configurationFileUseAnnotation._1test;

import org.springframework.stereotype.Component;

@Component() //name of id which use to get Bean. by default is name of class to downCase first symbol
public class Color2 {
    String color;

    public Color2() {
        System.out.println("            Constructor of Color2 -");
    }

    public Color2(String color) {
        System.out.println("            Constructor of Color2 +");

        this.color = color;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }
}
