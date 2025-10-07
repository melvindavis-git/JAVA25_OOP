package OOP_assignment_1;

import java.util.ArrayList;

/*
- "Plant" är en abstrakt klass (man ska inte kunna skapa ett objekt av "Plant").
- "Plant" impementerar interfacet "Nutrition" som har metoden "calculateLiquidAmount()".
- Klasserna "Palm", "Carnivorous" & "Cactus" är subklasser till superklassen "Plant",
  sätter krav på de olika plant-klasserna - de måste ha metoden "calculateLiquidAmount()".

Inkapsling:
- Variablerna är privata, har "private" access modifiers.
- Getters och setters för att komma åt och ändra värden.
- I det här fallet behövdes endast getters för att komma åt variablernas värden.
 */

public abstract class Plant implements Nutrition {

    private String name;
    private double height;
    private Liquid liquid;
    private static ArrayList<Plant> plants = new ArrayList<>();

    public Plant(String name, double height, Liquid liquid) {
        this.name = name;
        this.height = height;
        this.liquid = liquid;
        plants.add(this);
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public Liquid getLiquid() {
        return liquid;
    }


    public static ArrayList<Plant> getPlants() {
        return plants;
    }

    public static String getPlantNames() {
        String plantNames = "";
        for (Plant p : plants) {
            plantNames += p.getName() + " ";
        }
        return plantNames;
    }

}