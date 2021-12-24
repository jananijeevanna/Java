package Assignment9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTraderAssignment {


    public static void main(String[] args) {

        Trader A = new Trader("Mumbai", "Ram");
        Trader B = new Trader("Pune", "Ganesh");
        Trader C= new Trader("Indore", "Modi");
        Trader D = new Trader("Chennai", "Dhoni");
        Trader E  = new Trader("Pune", "Mitchell");

        List<Trader> traderList = Arrays.asList(A,B,C,D,E);

        //Question 9
        List<String> distinctCities = traderList.stream().map(trader -> trader.getCity()).distinct().collect(Collectors.toList());
        System.out.println(distinctCities);

        //Question 10:
        List<Trader> tradersFromPune = traderList.stream()
                .filter(trader -> trader.getCity().equalsIgnoreCase("Pune"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        tradersFromPune.forEach(trader -> System.out.println(trader.getName()));

        //Question 11
        List<String> namesOfWorkers = traderList.stream()
                .map(trader -> trader.getName()).sorted().collect(Collectors.toList());
        System.out.println(namesOfWorkers);


    }
}
