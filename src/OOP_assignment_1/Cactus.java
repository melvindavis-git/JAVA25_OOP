package OOP_assignment_1;

public class Cactus extends Plant {

    private double liquidAmountNeeded = 2;

    public Cactus(String name, double height) {
        super(name, height, Liquid.MINERAL_WATER);
    }

    //Polymorfism, override från interface "Nutrition"
    @Override
    public double calculateLiquidAmount() {
        return liquidAmountNeeded;
    }
}