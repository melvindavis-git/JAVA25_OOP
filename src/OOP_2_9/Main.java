package OOP_2_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    static void main() {

        Path p1 = Paths.get("src/OOP_2_9/personuppgifter.txt");
        Path p2 = Paths.get("src/OOP_2_9/personuppgifterTALL.txt");
        String line1;
        String line2;

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


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}