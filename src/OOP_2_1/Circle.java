package OOP_2_1;

public class Circle implements Figure{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public int getCircumference() {
        return (int) ((radius*2) * Math.PI);
    }
}
