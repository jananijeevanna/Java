package Assignment6;

public class Contact {

long phoneNumber;
String name;
String email;
Enum gender;

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Contact(long phoneNumber, String name, String email, Enum gender) {

        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}
