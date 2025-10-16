package OOP_1_1;

public class CarOwner extends Person {

    private Car car;

    public CarOwner(String name, int age, String address) {
        super(name, age, address);
    }

    public void whatCar(){
        if (car != null) {
            System.out.println(car.getCarInfo());
        } else {
            System.out.println(getName() + " does not own a car");
        }
    }

    public void buyCar(Car car){
        this.car = car;
    }

    public void sellCar() {
       this.car = null;
    }
}
