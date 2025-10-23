package OOP_assignment_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;

public class Reader {

    ArrayList<Member> members = new ArrayList<>();

    public ArrayList<Member> read(Path p) {
        try (BufferedReader br = Files.newBufferedReader(p)) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                String name = data[0];
                String address = data[1];
                String email = data[2];
                String id = data[3];
                LocalDate memberDate = LocalDate.parse(data[4]);
                LocalDate lastPaymentDate = LocalDate.parse(data[5]);
                String memberType = data[6];
                Member member = new Member(name, address, email, id,
                        memberDate, lastPaymentDate, memberType);
                members.add(member);
            }
        } catch (NoSuchFileException e) {
            System.out.println("Ingen fil med det namnet kunde hittas.");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Ett fel uppstod. (IO Exception)");
        }
        return members;
    }
}