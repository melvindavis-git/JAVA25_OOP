package OOP_2_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle c = new Circle(4);

    @Test
    void getArea() {
        assert(c.getArea() == 50);
    }

    @Test
    void getCircumference() {
        assert(c.getCircumference() == 25);
    }
}