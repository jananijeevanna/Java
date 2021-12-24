package Assignment9;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAssignmentNews {

    public static void main(String[] args) {

        News firstNews = new News(1, "Test1", "User1", "Great News on budget" );
        News secondNews = new News(1, "Test1", "User2", "wonderful news about Technology" );
        News thirdNews = new News(2, "Test2", "User3", "This seems fake budget news" );
        News fourthNews = new News(3, "Test3", "User4", "This is so frightening" );

        List<News> newsList = new ArrayList<>();
        newsList.add(firstNews);
        newsList.add(secondNews);
        newsList.add(thirdNews);
        newsList.add(fourthNews);


        ///question 4-


        System.out.println(newsList.stream()
                .collect(Collectors.groupingBy(News::getNewsId)).keySet());
       /* filterFruitsByCalories.forEach(fruit -> System.out.println(fruit.getName()));

        //question 2:
        Stream<Fruit> sortByColor = fruitList.stream().sorted(Comparator.comparing(Fruit::getColor));
        System.out.println("Displaying fruits colorwise: ");
        sortByColor.forEach(fruit -> {System.out.print(fruit.getColor()+ ": ");
            System.out.println(fruit.getName());});

        //Question 3

        Stream<Fruit> filterRedFruitsByPrice = fruitList.stream().filter(fruit -> fruit.getColor().equalsIgnoreCase("red"))
                .sorted(Comparator.comparing(Fruit::getPrice));
        System.out.println("Red Fruits sorted by price ");
        filterRedFruitsByPrice.forEach(fruit -> System.out.println(fruit.getName()));
*/
    }
}
