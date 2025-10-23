package OOP_assignment_2;

import java.time.LocalDate;

public class Member {

    private String name;
    private String address;
    private String email;
    private String id;
    private LocalDate memberDate;
    private LocalDate lastPaymentDate;
    private String memberType;

    public Member(String name, String address, String email, String id,
                  LocalDate memberDate, LocalDate lastPaymentDate, String memberType) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.id = id;
        this.memberDate = memberDate;
        this.lastPaymentDate = lastPaymentDate;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getMemberType() {
        return memberType;
    }

    public boolean isWithinOneYear(LocalDate date) {
        return date.isAfter(LocalDate.now().minusYears(1));
    }

    public boolean isMember() {
        return isWithinOneYear(lastPaymentDate);
    }

}