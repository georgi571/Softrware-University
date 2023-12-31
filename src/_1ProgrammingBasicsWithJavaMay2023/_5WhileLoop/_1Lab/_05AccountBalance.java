package _1ProgrammingBasicsWithJavaMay2023._5WhileLoop._1Lab;

import java.util.Scanner;

public class _05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalSum = 0;
        while (!input.equals("NoMoreMoney")) {
            double amount = Double.parseDouble(input);
            if (amount <= 0) {
                System.out.printf("Invalid operation!%n");
                break;
            }
            System.out.printf("Increase: %.2f%n",amount);
            totalSum += amount;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalSum);
    }
}
