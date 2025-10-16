package OOP_2_8_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void main() {

        String temp;
        double tempD;
        File f = new File("src/OOP_2_8_2/temp.txt");
        ArrayList<Double> tempList = new ArrayList<>();

        try(Scanner scanner = new Scanner(f)) {

            while (scanner.hasNextLine()) {
                temp = scanner.nextLine();
                temp = temp.replace(",", ".");
                tempD = Double.parseDouble(temp);
                tempList.add(tempD);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        double tlMin = Collections.min(tempList);
        double tlMax = Collections.max(tempList);
        System.out.println("min value: " + tlMin + "\n"
                + "max value: " + tlMax);

        double average = 0;
        for (double d : tempList) {
            average += d;
        }
        average /= tempList.size();
        System.out.println("average: " + average);

    }
}