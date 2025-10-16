package OOP_2_9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDialog {

    public void start() {

        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/OOP_2_9/personuppgifter.txt", true))) {
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter address: ");
            String address = scanner.nextLine();
            System.out.print("Enter postcode and city: ");
            String postcodeAndCity = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            System.out.print("Enter weight (kg): ");
            int weight = scanner.nextInt();
            System.out.print("Enter height (cm): ");
            int height = scanner.nextInt();

            CreatePerson person = new CreatePerson(
                    firstName, lastName, address, postcodeAndCity, age, weight, height);

            bw.newLine();
            bw.write(person.getFirstName() + " " + person.getLastName() + ", " + person.getAddress() + ", " + person.getPostCodeAndCity());
            bw.newLine();
            bw.write(person.getAge() + ", " + person.getWeight() + ", " + person.getHeight());

            System.out.println(person.getFirstName() + " " + person.getLastName() +
                    " has been added to the txt file.");

        }
        catch(IOException e){
            e.printStackTrace();
        }


    }



}
