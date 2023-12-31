package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._3Arrays._2Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[rows];
        int[] secondArray = new int[rows];
        for (int i = 1; i <= rows ; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(e -> Integer.parseInt(e))
                            .toArray();
            int firstNumber = numbers[0];
            int secondNumber = numbers[1];
            if (i % 2 == 0) {
                firstArray[i - 1] = secondNumber;
                secondArray[i - 1] = firstNumber;
            } else {
                firstArray[i -1] = firstNumber;
                secondArray[i - 1] = secondNumber;
            }
        }
        for (int n1 : firstArray) {
            System.out.print(n1 + " ");
        }
        System.out.println();
        for (int n2 : secondArray) {
            System.out.print(n2 + " ");
        }
    }
}
