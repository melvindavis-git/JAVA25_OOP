package OOP_1_2;


public abstract class Vehicle implements Printable{

    private int speed;
    private int weight;

    public Vehicle(int speed, int weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public void changeSpeed(int speed) {
        this.speed = speed;
    }

    /*
    @Override
    public String toString() {
        return "Type: " + this.getClass().getSimpleName() + "\n" +
                "Speed: " + this.speed + "\n" +
                "Weight: " + this.weight;
    }
    */

    @Override
    public String toString() {
        return "Type: " + this.getClass().getSimpleName() + " ";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //public abstract void printMe();

}