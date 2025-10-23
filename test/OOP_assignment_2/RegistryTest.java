package OOP_assignment_2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RegistryTest {

    @Test
    void searchTest() {

        Member m1 = new Member
                ("Person1", "Xvägen 1 101010 Stockholm", "person1@fakemail.se",
                        "010203-1111", LocalDate.of(2020, 12, 30),
                        LocalDate.of(2025, 10, 20), "Platina");
        Member m2 = new Member
                ("Person2", "Xvägen 1 101010 Stockholm", "person2@fakemail.se",
                        "010203-2222", LocalDate.of(2020, 12, 30),
                        LocalDate.of(2022, 12, 30), "Guld");

        ArrayList<Member> members = new ArrayList<>();
        members.add(m1);
        members.add(m2);

        String input = "Person1";
        for (Member m : members) {
            if (input.equalsIgnoreCase(m.getName())) {
                assertTrue(m.isMember());
                assertEquals("Platina", m.getMemberType());
                assertEquals("010203-1111", m.getId());
            }
        }

        String input2 = "Person2";
        for (Member m : members) {
            if (input2.equalsIgnoreCase(m.getName())) {
                assertFalse(m.isMember());
                assertEquals("Guld", m.getMemberType());
                assertEquals("010203-2222", m.getId());
                assertNotEquals("999", m.getId());
            }
        }

    }
}