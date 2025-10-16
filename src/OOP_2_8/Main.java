package OOP_2_8;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static void main() {

        String temp;
        double tempD;
        String p = "src/OOP_2_8/temp.txt";
        ArrayList<Double> tempList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(p))) {

            while ((temp = br.readLine()) != null) {
                temp = temp.replace(",", ".");
                tempD = Double.parseDouble(temp);
                tempList.add(tempD);
            }
        } catch (IOException e) {
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