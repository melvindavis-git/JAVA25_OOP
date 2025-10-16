package OOP_2_6;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChangeTest {

    Change c = new Change();

    @Test
    public void changeTest(){
        int cost = 345;
        int paidAmount = 500;
        int expected = 155;
        int actual = c.getChange(cost, paidAmount);
        assertEquals(expected, actual);
    }

    @Test
    public void valuePresentTest(){
        // 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1
        assertTrue(c.getValues().getFirst() == 1000);
        assertTrue(c.getValues().get(1) == 500);
        assertTrue(c.getValues().get(2) == 200);
        assertTrue(c.getValues().get(3) == 100);
        assertTrue(c.getValues().get(4) == 50);
        assertTrue(c.getValues().get(5) == 20);
        assertTrue(c.getValues().get(6) == 10);
        assertTrue(c.getValues().get(7) == 5);
        assertTrue(c.getValues().get(8) == 2);
        assertTrue(c.getValues().getLast() == 1);
    }

    @Test
    public void howManyValuesTest(){
        int value = 100;
        int change = 130;
        int expected = 1;

        int value2 = 500;
        int change2 = 2300;
        int expected2 = 4;

        assertEquals(expected, c.getAmountOfValues(value, change));
        assertEquals(expected2, c.getAmountOfValues(value2, change2));
    }

    @Test
    public void getRestTest(){
        int change = 130;
        int value = 100;
        int amountValue = 1;
        int expectedRest = 30;

        int change2 = 5;
        int value2 = 2;
        int amountValue2 = 2;
        int expectedRest2 = 1;

        assertEquals(expectedRest, c.getRest(change, value, amountValue));
        assertEquals(expectedRest2, c.getRest(change2, value2, amountValue2));
    }

    @Test
    public void getRestModuluTest(){
        int change = 130;
        int value = 100;
        int expectedRest = 30;

        int change2 = 5;
        int value2 = 2;
        int expectedRest2 = 1;

        assertEquals(expectedRest, c.getRestModulu(change, value));
        assertEquals(expectedRest2, c.getRestModulu(change2, value2));
    }

    @Test
    public void getChangeListTest(){
        int change = 2793;
        List<Integer> expected = List.of(2, 1, 1, 0, 1, 2, 0, 0, 1, 1);
        assertEquals(expected, c.getChangeList(change));
    }

    @Test
    public void getKrLappar(){
        String kronor = "kronor";
        String lappar = "lappar";
        assertEquals(kronor, c.getMoneyType(1));
        assertEquals(kronor, c.getMoneyType(2));
        assertEquals(kronor, c.getMoneyType(5));
        assertEquals(kronor, c.getMoneyType(10));
        assertEquals(lappar, c.getMoneyType(20));
        assertEquals(lappar, c.getMoneyType(50));
        assertEquals(lappar, c.getMoneyType(100));
        assertEquals(lappar, c.getMoneyType(200));
        assertEquals(lappar, c.getMoneyType(500));
        assertEquals(lappar, c.getMoneyType(1000));
    }

    @Test
    public void getPrint(){
        int change = 2793;
        List<Integer> expected = List.of(2, 1, 1, 0, 1, 2, 0, 0, 1, 1);
        String expected1 = "Antal 1-kronor: 1";
        String expected2 = "Antal 2-kronor: 1";
        String expected3 = "Antal 5-kronor: 1";
        String expected4 = "Antal 10-kronor: 0";
        String expected5 = "Antal 20-lappar: 2";
        String expected6 = "Antal 50-lappar: 1";
        String expected7 = "Antal 100-lappar: 0";
        String expected8 = "Antal 200-lappar: 1";
        String expected9 = "Antal 500-lappar: 1";
        String expected10 = "Antal 1000-lappar: 2";

        assertEquals(expected1, c.getPrint(1, 1));
        assertEquals(expected2, c.getPrint(2, 1));

    }

}