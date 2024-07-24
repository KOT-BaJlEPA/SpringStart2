package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._1createDependencyInjectionUseConstructor;

public class House {
    private Door door;
    private Window window;

    public House(Door door, Window window) {
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
}
