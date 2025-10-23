package OOP_assignment_2;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

class WriterTest {

    Writer w = new Writer();
    Reader r = new Reader();
    Path p1 = Paths.get("test/OOP_assignment_2/testFileRead.txt");
    Path p2 = Paths.get("test/OOP_assignment_2/testFileWrite.txt");

    @Test
    public void writeTest() {
        ArrayList<Member> testList = r.read(p1);
        w.write(p2, testList.get(0));
    }

}