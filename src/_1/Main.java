package _1;


import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer[], Integer> func = (arr) -> Arrays.stream(arr)
                .distinct()
                .sorted().reduce(0, (num1, num2) -> (num1 * 10 + num2));

        System.out.println(func.apply(new Integer[]{1, 2, 2, 3}));
    }
}
