package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._2createDependencyInjectionUseGetterSetter;

public class House {
    private Door door;
    private Window window;

    public House() {
        System.out.println("House constructor without args");
    }

    public House(Door door, Window window) {
        System.out.println("House constructor with args");
        this.door = door;
        this.window = window;
    }

    @Override
    public String toString() {
        return "House{" +
                "do0r=" + door +
                ", window=" + window +
                '}';
    }

    public void setDoor(Door door) {
        System.out.println("House setDoor");
        this.door = door;
    }

    public void setWindow(Window window) {
        System.out.println("House setWindow");
        this.window = window;
    }
}
