package OOP_2_9;

public class CreatePerson {

    private String firstName;
    private String lastName;
    private String address;
    private String postCodeAndCity;
    private int age;
    private int weight;
    private int height;

    public CreatePerson(String firstName, String lastName,
                        String address, String postCodeAndCity,
                        int age, int weight, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postCodeAndCity = postCodeAndCity;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPostCodeAndCity() {
        return postCodeAndCity;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
