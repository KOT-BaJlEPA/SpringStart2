package spring._1inversionControlAndDependencyInjection._3configurationFileUseAnnotation._1test;

import org.springframework.stereotype.Component;

@Component(value = "colorBean") //name of id which use to get Bean
public class Color {
    String color;

    public Color() {
        System.out.println("            Constructor of Color -");
    }

    public Color(String color) {
        System.out.println("            Constructor of Color +");

        this.color = color;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }
}
