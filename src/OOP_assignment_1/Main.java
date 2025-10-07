package OOP_assignment_1;


public class Main {
    public static void main(String[] args) {

        Cactus cactus = new Cactus("Igge", 0.2);
        Palm palm = new Palm("Laura", 5);
        Carnivorous carnivorous = new Carnivorous("Meatloaf", 0.7);
        Palm palm2 = new Palm("Olof", 1);

        UserDialog.start();

    }
}