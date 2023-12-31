package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._3Arrays._2Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e))
                        .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numbers.length - 1 ; i++) {
            int currentNumber = numbers[i];
            for (int j= i + 1; j <= numbers.length - 1; j++) {
                int nextNumber = numbers[j];
                if (currentNumber + nextNumber == magicSum) {
                    System.out.printf("%d %d%n", numbers[i], numbers[j]);
                }
            }
        }
    }
}
