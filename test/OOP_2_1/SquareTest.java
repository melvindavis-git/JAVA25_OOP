package OOP_2_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square s = new Square(4, 4);

    @Test
    void getAreaTest() {
        assert(s.getArea() == 16);
    }

    @Test
    void getCircumferenceTest() {
        assert(s.getCircumference() == 16);
    }

}