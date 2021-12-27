package Assignment9;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTraderAssignment {


    public static void main(String[] args) {

        Trader A = new Trader("Delhi", "Ram");
        Trader B = new Trader("Pune", "Ganesh");
        Trader C= new Trader("Indore", "Modi");
        Trader D = new Trader("Chennai", "Dhoni");
        Trader E  = new Trader("Pune", "Mitchell");

        //Transaction
        Transaction firstTrans = new Transaction(A,2019, 40000);
        Transaction secTrans= new Transaction(B,2019, 10000);
        Transaction thirdTrans = new Transaction(C,2020, 20000);
        Transaction fourthTrans = new Transaction(D,2020, 30000);
        Transaction fifthTrans = new Transaction(E,2018, 20000);

        List<Transaction> transactions = Arrays.asList(firstTrans,secTrans,thirdTrans,fifthTrans,fourthTrans);


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

        //Question 12
        Optional<Trader> traders= traderList.stream()
                .filter(trader -> trader.getCity().equalsIgnoreCase("indore"))
                .findFirst();

        if(traders.isPresent()){
            System.out.println("There are workers from Indore.");
        }

        //Question 8
        StreamTraderAssignment streamTraderAssignment = new StreamTraderAssignment();

        streamTraderAssignment.transactionAssignment(transactions);


    }

    private  void transactionAssignment(List<Transaction> transactions) {
        List<Transaction> sortTrans = transactions.stream().filter(transaction -> transaction.getYear() == 2019)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        sortTrans.forEach(transaction -> System.out.println(transaction.getValue()));

        Optional<Transaction> tradersFromDelhi = transactions.stream().filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Delhi")).findAny();
        if(tradersFromDelhi.isPresent()) {
            System.out.println("Traders values from Traders living in Delhi");
            System.out.println(tradersFromDelhi.get().getValue());
        }
        System.out.println("Max Trade value ");
        System.out.println(transactions.stream().max(Comparator.comparing(Transaction::getValue)).get().getValue());
        System.out.println(" Min Trade Value ");
        System.out.println(transactions.stream().min(Comparator.comparing(Transaction::getValue)).get().getValue());

    }
}
