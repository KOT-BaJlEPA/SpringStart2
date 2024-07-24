package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._2createDependencyInjectionUseGetterSetter;

public class Door {
    private String colorDoor = "brown";

    public Door() {
    }

    public Door(String colorDoor) {
        this.colorDoor = colorDoor;
    }

    @Override
    public String toString() {
        return "Door{" +
                "colorDoor='" + colorDoor + '\'' +
                '}';
    }

    public String getColorDoor() {
        return colorDoor;
    }

    public void setColorDoor(String colorDoor) {
        this.colorDoor = colorDoor;
    }
}
