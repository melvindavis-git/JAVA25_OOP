package OOP_2_4;

import OOP_2_2.Calculate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    OOP_2_4.Calculate c = new OOP_2_4.Calculate(15000,13000, 800);

    @Test
    void getMilesYearTest(){
        assert(c.getOneYearMiles() == 2000);
    }

    @Test
    void getFuelConsumptionPerMile(){
        assert(c.getOneYearFuel() == 0.4);
        assert(c.getOneYearFuel() != 7);
    }
}