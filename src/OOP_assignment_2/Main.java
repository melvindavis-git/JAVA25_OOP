package OOP_assignment_2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    static void main() {
        Path p1 = Paths.get("src/OOP_assignment_2/personuppgifter.txt");

        Reader reader = new Reader();
        Writer writer = new Writer();
        Registry registry = new Registry(reader.read(p1), writer);
        registry.search();

    }
}