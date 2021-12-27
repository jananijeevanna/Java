package Assignment8;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;

public class Lambda3 {

    public static void main(String[] args) {

        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(100);

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        Predicate<Integer> greaterThan = i -> (i > 18);
        System.out.println(greaterThan.test(6));

        Function<Integer, Double> half = a -> a / 2.0;
        System.out.println(half.apply(300));

    }

}
