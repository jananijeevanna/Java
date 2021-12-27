package Assignment8;

import java.util.HashMap;
import java.util.Map;

public class Lambda6 {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("Apple", "Peach");
        map.put("Banana","Orange");
        map.put("Yellow","Black");
        map.put("Red","Purple");

        StringBuilder str = new StringBuilder();

        map.entrySet().forEach(name -> str.append(name.getKey()).append(name.getValue()) );

        System.out.println(str);

    }



}
