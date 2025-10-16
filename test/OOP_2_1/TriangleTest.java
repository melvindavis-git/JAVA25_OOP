package OOP_2_1;

import org.junit.jupiter.api.Test;

class TriangleTest {

    Triangle t = new Triangle(4, 6, 8);

    @Test
    void getAreaTest() {
        assert(t.getArea() == 12);
    }

    @Test
    void getCircumferenceTest() {
        assert(t.getCircumference() == 20);
    }

}
