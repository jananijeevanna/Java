package Assignment5;

import java.util.Date;

public class Question4b {
    public static void main(String[] args) {
        Pair2 p = new Pair2();
        p.setKey("Today is ");
        p.setValue(new java.util.Date());

        System.out.println(p);
    }
}
class Pair2 {

    private String key;
    private Date value;

    public void setKey(String key) {
        if( key instanceof String)
            this.key = key;
    }

    public void setValue(Date value) {
        if( value instanceof Date)
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
