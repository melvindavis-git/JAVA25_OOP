package OOP_1_1;

public class Car {

    private String plate;
    private String model;
    private String color;

    public Car(String plate, String model, String color) {
        this.plate = plate;
        this.model = model;
        this.color = color;
    }

    public String getCarInfo() {
        return this.plate + " " + this.model + " " + this.color;
    }


}
