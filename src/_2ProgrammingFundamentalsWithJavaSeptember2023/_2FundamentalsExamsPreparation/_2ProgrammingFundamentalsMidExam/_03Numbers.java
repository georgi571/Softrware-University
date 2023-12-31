package _2ProgrammingFundamentalsWithJavaSeptember2023._2FundamentalsExamsPreparation._2ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.Scanner;

public class _03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e))
                        .toArray();
        int sumOfNumbers = 0;
        for (int number : numbers) {
            sumOfNumbers += number;
        }
        double averageNumber = 1.0 * sumOfNumbers / numbers.length;
        int counter = 0;
        Arrays.sort(numbers);
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] > averageNumber) {
                counter++;
                System.out.printf("%d ", numbers[i]);
                if (counter == 5) {
                    break;
                }
            }
        }
        if (counter == 0) {
            System.out.printf("No");
        }
    }
}
