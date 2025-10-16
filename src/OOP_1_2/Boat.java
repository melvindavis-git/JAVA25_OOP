package OOP_1_2;

public class Boat extends Vehicle{

    private int deadWeight;

    public Boat(int speed, int weight, int deadWeight) {
        super(speed, weight);
        this.deadWeight = deadWeight;
    }

    public void turn(){
        System.out.println("The boat is turning");
    }

    @Override
    public void printMe() {
        System.out.println(super.toString() + "Speed: " + getSpeed() + " Weight: " + getWeight()
                + " Deadweight: " + deadWeight);
    }
}
