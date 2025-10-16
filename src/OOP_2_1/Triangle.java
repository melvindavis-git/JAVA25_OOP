package OOP_2_1;

public class Triangle implements Figure{

    private int width;
    private int length;
    private int side;

    public Triangle(int width, int length, int side) {
        this.width = width;
        this.length = length;
        this.side = side;
    }

    @Override
    public int getArea(){
        return (width*length)/2;
    }

    @Override
    public int getCircumference(){
        return width+(side*2);
    }
}
