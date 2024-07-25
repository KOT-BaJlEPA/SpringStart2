package spring._2BeanScope._1singletone;

public class Flat {
    private BathRoom bathRoom;
    private int numberOfFlat;


    @Override
    public String toString() {
        return "Flat{" +
                "bathRoom=" + bathRoom +
                ", numberOfFlat=" + numberOfFlat +
                '}';
    }

    public Flat() {
        System.out.println("Flat Constructor -");
    }

    public Flat(int numberOfFlat, BathRoom bathRoom) {
        System.out.println("Flat Constructor +");
        this.bathRoom = bathRoom;
        this.numberOfFlat = numberOfFlat;
    }


    public void setNumberOfFlat(int numberOfFlat) {
        System.out.println("Flat Setter setNumberOfFlat -----   " + numberOfFlat);
        this.numberOfFlat = numberOfFlat;
    }
    public void setBathRoom(BathRoom bathRoom) {
        System.out.println("Flat Setter setBathRoom");
        this.bathRoom = bathRoom;
    }


}
