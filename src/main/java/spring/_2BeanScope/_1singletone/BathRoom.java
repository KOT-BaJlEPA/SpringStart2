package spring._2BeanScope._1singletone;

public class BathRoom {
    private int area;

    public void setArea(int area) {
        System.out.println(" set area to " + area);
        this.area = area;
    }

    @Override
    public String toString() {
        return "BathRoom{" +
                "area=" + area +
                '}';
    }

    public BathRoom(int area) {
        System.out.println( " constructor BathRoom +");
        this.area = area;
    }

    public BathRoom() {
        System.out.println( " constructor BathRoom -");
    }
}
