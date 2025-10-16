package OOP_2_9_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    static void main() {

        Path p1 = Paths.get("src/OOP_2_9_2/personuppgifter.txt");
        String line1;
        String line2;
        ArrayList<Person> personList = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(p1)) {

            while ((line1 = br.readLine()) != null && (line2 = br.readLine()) != null) {

                Person person = new Person(line1 + "," + line2);
                personList.add(person);

            }

            for (Person p : personList) {
                String[] data = p.getPersonuppgift().trim().split(",");
                int height = Integer.parseInt(data[5].trim());
                if (height > 200) {
                    System.out.println(p.getPersonuppgift());
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}