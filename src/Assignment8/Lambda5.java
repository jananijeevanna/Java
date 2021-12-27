package Assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda5 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Roshan", "Samyag", "Rishabh", "Sadvika"));

        StringBuilder str = new StringBuilder();
        list.forEach(name-> str.append(name.charAt(0)));
        System.out.println(str);
    }
}
