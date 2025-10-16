package OOP_1_2;

public class Car extends Vehicle implements Haswheels {

    private int gears;
    private int currentGear;
    private final int wheels = 4;

    public Car(int speed, int weight, int gears, int currentGear) {
        super(speed, weight);
        this.gears = gears;
        this.currentGear = currentGear;
    }

    public void changeGears(int gear) {
        currentGear = gear;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Gears: " + gears + "\n" +
                "Current gear: " + currentGear;
    }

    @Override
    public void printMe() {
        System.out.println(super.toString() + "Speed: " + getSpeed() + " Weight: " + getWeight()
                + " Gears: " + gears + " Current gear: " + currentGear);
    }

    @Override
    public void printAmountOfWheels() {
        System.out.println("The car has " + wheels + " wheels");
    }
}
