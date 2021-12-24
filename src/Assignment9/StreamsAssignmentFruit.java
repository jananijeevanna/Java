package Assignment9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsAssignmentFruit {

    public static void main(String[] args) {

        Fruit fruitOrange = new Fruit("Orange", 50, 100, "orange" );
        Fruit fruitApple = new Fruit("Apple", 110, 200, "red" );
        Fruit fruitGrape = new Fruit("Grape", 80, 150, "green" );
        Fruit fruitWaterMelon = new Fruit("WaterMelon", 150, 500, "red" );
        Fruit fruitBanana = new Fruit("Banana", 99, 10, "yellow" );

        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(fruitOrange);
        fruitList.add(fruitApple);
        fruitList.add(fruitGrape);
        fruitList.add(fruitWaterMelon);
        fruitList.add(fruitBanana);

        ///question 1-

        Stream<Fruit> filterFruitsByCalories = fruitList.stream().filter(fruit -> fruit.getCalories() < 100);
        System.out.println("Fruits with less than 100 calories: ");
        filterFruitsByCalories.forEach(fruit -> System.out.println(fruit.getName()));

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

    }
}
