package Assignment9;

public class Trader {

    private String name;
    private String city;

    public Trader(String city, String name) {
        this.city = city;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
