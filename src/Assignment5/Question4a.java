package Assignment5;

public class Question4a {

    public static void main(String[] args) {
        Pair p = new Pair();
        p.setKey("1");
        p.setValue("Hello");

        System.out.println(p);
    }
}
 class Pair {

    private String key;
    private String value;

    public void setKey(String key) {
        if( key instanceof String)
            this.key = key;
    }

    public void setValue(String value) {
        if( value instanceof String)
            this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}