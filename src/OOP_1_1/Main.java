package OOP_1_1;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("ABC123", "Volvo", "Red");
        CarOwner owner1 = new CarOwner("Melvin", 20, "adress12345");

        owner1.buyCar(car1);
        owner1.whatCar();
        owner1.sellCar();
        owner1.whatCar();

    }
}
