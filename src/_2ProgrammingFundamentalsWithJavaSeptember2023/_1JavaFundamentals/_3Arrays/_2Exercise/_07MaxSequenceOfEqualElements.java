package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._3Arrays._2Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e))
                        .toArray();
        int lognestOne = 0;
        int findNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentLongestOne = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    currentLongestOne += 1;
                } else {
                    break;
                }
            }
            if (lognestOne < currentLongestOne) {
                lognestOne = currentLongestOne;
                findNumber = numbers[i];
            }
        }
        if (lognestOne == 0) {
            System.out.print(numbers[0]);
        } else {
            for (int i = 1; i <= lognestOne + 1 ; i++) {
               System.out.print(findNumber + " ");
            }
        }
    }
}
