package _3ProgrammingJavaAdvancedJanuary2024._1JavaAdvanced._5FunctionalProgramming._2Exersices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        Function<List<Integer>, Integer> findSmallestNumbers = list -> Collections.min(list);
        int smallesNumber = findSmallestNumbers.apply(numbers);
        System.out.printf("%d", numbers.lastIndexOf(smallesNumber));
    }
}
