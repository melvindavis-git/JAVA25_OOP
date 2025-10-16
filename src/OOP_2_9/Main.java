package OOP_2_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    static void main() {

        Path p1 = Paths.get("src/OOP_2_9/personuppgifter.txt");
        Path p2 = Paths.get("src/OOP_2_9/personuppgifterTALL.txt");
        String line1;
        String line2;
        Scanner scanner = new Scanner(System.in);

        try (BufferedReader br = Files.newBufferedReader(p1);
             BufferedWriter bw = Files.newBufferedWriter(p2)) {
            if (!Files.exists(p2)) {
                Files.createFile(p2);
            }

            while ((line1 = br.readLine()) != null && (line2 = br.readLine()) != null) {

                String[] numbers = line2.trim().split(",");
                int height = Integer.parseInt(numbers[2].trim());

                if (height > 200) {
                    bw.write(line1);
                    bw.newLine();
                    bw.write(line2);
                    bw.newLine();
                }

            }

            UserDialog ud = new UserDialog();
            System.out.print("Do you want to create a new person? (Y/N): ");
             String option = scanner.nextLine();
             if (option.equalsIgnoreCase("y")){
                 ud.start();
             }



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}