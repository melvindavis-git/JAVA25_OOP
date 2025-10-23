package OOP_assignment_2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

public class Writer {

    public void write(Path p, Member m) {
        try (BufferedWriter bw = Files.newBufferedWriter(p, StandardOpenOption.APPEND)) {

            if (m.isMember()) {
                bw.write(m.getName() + " " + m.getId() + " " + LocalDate.now());
                bw.newLine();
            }

        } catch (NoSuchFileException e) {
            System.out.println("Ingen fil med det namnet kunde hittas.");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Ett fel uppstod. (IO Exception)");
        }
    }

}