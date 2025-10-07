package OOP_assignment_1;

public class Palm extends Plant {

    private double liquidAmountNeeded = 0.5;

    public Palm(String name, double height) {
        super(name, height, Liquid.TAP_WATER);
    }

    //Polymorfism, override från interface "Nutrition"
    @Override
    public double calculateLiquidAmount() {
        return liquidAmountNeeded * getHeight();
    }
}