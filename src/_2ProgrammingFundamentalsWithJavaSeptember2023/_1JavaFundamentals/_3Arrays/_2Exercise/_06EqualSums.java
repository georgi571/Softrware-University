package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._3Arrays._2Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e))
                        .toArray();
        boolean isArrayFind = false;
        for (int i = 0; i < numbers.length ; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i ; j++) {
                sumLeft += numbers[j];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                sumRight += numbers[j];
            }
            if (sumLeft == sumRight) {
                System.out.printf("%d", i);
                isArrayFind = true;
            }
        }
        if (!isArrayFind) {
            System.out.println("no");
        }
    }
}
