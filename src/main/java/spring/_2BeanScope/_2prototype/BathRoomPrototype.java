package spring._2BeanScope._2prototype;

public class BathRoomPrototype {
    private int area;

    public void setArea(int area) {
        System.out.println(" set area to " + area);
        this.area = area;
    }

    @Override
    public String toString() {
        return "BathRoom2{" +
                "area=" + area +
                '}';
    }

    public BathRoomPrototype(int area) {
        System.out.println( " constructor BathRoom2 +");
        this.area = area;
    }

    public BathRoomPrototype() {
        System.out.println( " constructor BathRoom2 -");
    }
}
