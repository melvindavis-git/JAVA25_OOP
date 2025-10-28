package OOP_assignment_2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    Member m1 = new Member
            ("Fredik Berggren", "Skolgränd 8 16819 Norrköping", "fredde@fakemail.se",
                    "851020-6728", LocalDate.of(2019, 12, 30),
                    LocalDate.now(), "Platina");
    Member m2 = new Member
            ("Fredik Berggren", "Skolgränd 8 16819 Norrköping", "fredde@fakemail.se",
                    "851020-6728", LocalDate.of(2019, 12, 30),
                    LocalDate.of(2020, 12, 30), "Platina");

    @Test
    public void isMemberTest() {
        assertTrue(m1.isMember());
        assertFalse(m2.isMember());
    }

}