package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._2DataTypesAndVariables._1Lab;

import java.util.Scanner;

public class _10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int number = i;
            int sum = 0;
            while (number > 0) {
                int currentNumber = number % 10;
                sum += currentNumber;
                number = number / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n",i);
            } else {
                System.out.printf("%d -> False%n",i);
            }
        }
    }
}
