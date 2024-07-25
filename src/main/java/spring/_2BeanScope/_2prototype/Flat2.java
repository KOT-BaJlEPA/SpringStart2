package spring._2BeanScope._2prototype;

public class Flat2 {
    private BathRoomPrototype bathRoom;
    private int numberOfFlat;


    @Override
    public String toString() {
        return "Flat2{" +
                "bathRoom=" + bathRoom +
                ", numberOfFlat=" + numberOfFlat +
                '}';
    }

    public Flat2() {
        System.out.println("Flat2 Constructor -");
    }

    public Flat2(int numberOfFlat, BathRoomPrototype bathRoom) {
        System.out.println("Flat2 Constructor +");
        this.bathRoom = bathRoom;
        this.numberOfFlat = numberOfFlat;
    }


    public void setNumberOfFlat(int numberOfFlat) {
        System.out.println("Flat2 Setter setNumberOfFlat -----   " + numberOfFlat);
        this.numberOfFlat = numberOfFlat;
    }
    public void setBathRoom(BathRoomPrototype bathRoom) {
        System.out.println("Flat2 Setter setBathRoom");
        this.bathRoom = bathRoom;
    }


}
