package OOP_1_2;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(70, 1500, 6, 5);
        Boat boat1 = new Boat(40, 300, 1000);
        Bike bike1 = new Bike(50, 250, 5, 3);
        Train train1 = new Train(200, 50000, 10);

        Haswheels hw = new Car(100, 2000, 6, 6);

        car1.printMe();
        boat1.printMe();
        bike1.printMe();
        train1.printMe();
        train1.printAmountOfWheels();


    }
}