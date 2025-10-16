package OOP_2_1;

public class Square implements Figure{

    private int length;
    private int width;

    public Square (int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public int getArea() {
        return length*width;
    }

    @Override
    public int getCircumference() {
        return (length*2) + (width*2);
    }
}