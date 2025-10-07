package OOP_assignment_1;

public class Carnivorous extends Plant {

    private double baseAmountLiquid = 0.1;
    private double liquidAmountNeeded = 0.2;

    public Carnivorous(String name, double height) {
        super(name, height, Liquid.PROTEIN_DRINK);
    }

    //Polymorfism, override från interface "Nutrition"
    @Override
    public double calculateLiquidAmount() {
        return baseAmountLiquid + (liquidAmountNeeded * getHeight());
    }
}