package OOP_assignment_2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Registry {
    private ArrayList<Member> members;
    private Writer writer;
    private Path p = Paths.get("src/OOP_assignment_2/PT.txt");

    public Registry(ArrayList<Member> members, Writer writer) {
        this.members = members;
        this.writer = writer;
    }

    public void search() {
        System.out.println("Best Gym Ever (x to exit)");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("namn/personnummer: ");
            String input = scanner.nextLine();
            input = input.trim();

            if (input.equalsIgnoreCase("x")) {
                System.out.println("Programmet avslutas.");
                break;
            }

            boolean found = false;

            for (Member m : members) {
                if (m.getName().equalsIgnoreCase(input) || m.getId().equals(input)) {
                    found = true;
                    if (m.isMember()) {
                        System.out.println(m.getName() + " är en nuvarande medlem" +
                                " (medlemstyp: " + m.getMemberType() + ")");
                        writer.write(p, m);
                    } else {
                        System.out.println(m.getName() + " är en före detta medlem");
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println(input + " finns inte i systemet.");
                System.out.println();
            }
        }

    }

}