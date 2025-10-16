package OOP_1_2;

public class Train extends Vehicle implements Haswheels{

    private int amountOfTrainCars;
    private final int wheelsPerTrainCar = 4;

    public Train(int speed, int weight, int amountOfTrainCars) {
        super(speed, weight);
        this.amountOfTrainCars = amountOfTrainCars;
    }

    public void addTrainCars(int trainCars) {
        amountOfTrainCars += trainCars;
    }

    @Override
    public void printMe() {
        System.out.println(super.toString() + "Speed: " + getSpeed() + " Weight: " + getWeight()
                + " Train cars: " + amountOfTrainCars);
    }

    @Override
    public void printAmountOfWheels() {
        System.out.println("The train has " + (amountOfTrainCars * wheelsPerTrainCar) + " wheels");
    }
}
