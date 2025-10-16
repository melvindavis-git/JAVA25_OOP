package OOP_2_4;

public class Calculate {

    private int milesToday;
    private int milesOneYearAgo;
    private double fuelConsumption;

    public Calculate(int milesToday, int milesOneYearAgo, int fuelConsumption) {
        this.milesToday = milesToday;
        this.milesOneYearAgo = milesOneYearAgo;
        this.fuelConsumption = fuelConsumption;
    }

    public int getOneYearMiles(){
        return milesToday - milesOneYearAgo;
    }

    public double getOneYearFuel(){
        return fuelConsumption / getOneYearMiles();
    }

    public int getMilesToday() {
        return milesToday;
    }

    public int getMilesOneYearAgo() {
        return milesOneYearAgo;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
