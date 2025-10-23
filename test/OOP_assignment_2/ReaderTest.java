package OOP_assignment_2;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class ReaderTest {

    Reader r = new Reader();
    Path p = Paths.get("test/OOP_assignment_2/testFileRead.txt");

    @Test
    public void readTest() {
        ArrayList<Member> testList = r.read(p);

        assertEquals("Admin", testList.get(0).getMemberType());
        assertEquals("Melvin Davis", testList.get(0).getName());
        assertNotEquals("8987676565", testList.get(0).getId());
    }
}