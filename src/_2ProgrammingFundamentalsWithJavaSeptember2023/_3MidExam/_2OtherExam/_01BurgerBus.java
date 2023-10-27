package _2ProgrammingFundamentalsWithJavaSeptember2023._3MidExam._2OtherExam;

import java.util.Scanner;

public class _01BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCity = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0.0;
        for (int i = 1; i <= numberOfCity ; i++) {
            String cityName = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());
            if (i % 3 == 0) {
                if (i % 5 == 0) {

                } else {
                    expenses *= 1.5;
                }
            } else if (i % 5 == 0) {
                income *= 0.90;
            }
            double profit = income - expenses;
            totalProfit += profit;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, profit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva. %n", totalProfit);
    }
}
