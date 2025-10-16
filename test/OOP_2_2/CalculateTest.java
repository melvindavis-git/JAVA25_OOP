package OOP_2_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    Calculate c = new Calculate(15000,13000, 800);

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