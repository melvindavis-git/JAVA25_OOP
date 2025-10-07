package OOP_assignment_1;

public enum Liquid {
    TAP_WATER("kranvatten", "liter"),
    PROTEIN_DRINK("proteindryck", "liter"),
    MINERAL_WATER("mineralvatten", "centiliter");

    public final String liquidType;
    public final String liquidUnit;

    Liquid(String liquidType, String liquidUnit) {
        this.liquidType = liquidType;
        this.liquidUnit = liquidUnit;
    }
}