package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._3Arrays._2Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e))
                        .toArray();
        int rotation = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= rotation ; i++) {
            int firstElement = numbers[0];
            for (int j = 0; j < numbers.length - 1; j++) {
                numbers[j] = numbers[j + 1];
            }
            numbers[numbers.length - 1] = firstElement;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
