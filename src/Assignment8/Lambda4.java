package Assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda4 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Roshan", "Samyag", "Rishabh", "Sadvika"));

        Predicate<String> odd = s -> (s.length() % 2) == 0;
        list.removeIf(odd);

        System.out.println(list);
    }
}
