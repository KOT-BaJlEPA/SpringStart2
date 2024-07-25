package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._2createDependencyInjectionUseGetterSetter._2setterAndValuesUsePropertyFile;

public class Color {
    String color;
    public Color() {
        System.out.println(" constructor color without args");
    }
    public Color(String color) {
        System.out.println(" constructor color with args");
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        System.out.println("getter Color");
        return color;
    }

    public void setColor(String color) {
        System.out.println("setter Color set " + color);
        this.color = color;
    }


}
