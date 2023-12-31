package _1ProgrammingBasicsWithJavaMay2023._8Exam._1MainExam;

import java.util.Scanner;

public class _04ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalSales = 0;
        int rateCounter = 0;
        for (int i = 1; i <= n ; i++) {
            int rating = Integer.parseInt(scanner.nextLine());
            int ratingNumber = rating % 10;
            ratingNumber = ratingNumber / 1;
            int sellingNumber = rating / 10;
            double sales = 0;
            if (ratingNumber == 2) {
                sales = sellingNumber * 0;
                totalSales += sales;
                rateCounter += 2;
            } else if (ratingNumber == 3) {
                sales = sellingNumber * 0.5;
                totalSales += sales;
                rateCounter += 3;
            } else if (ratingNumber == 4) {
                sales = sellingNumber * 0.7;
                totalSales += sales;
                rateCounter += 4;
            }else if (ratingNumber == 5) {
                sales = sellingNumber * 0.85;
                totalSales += sales;
                rateCounter += 5;
            } else if (ratingNumber == 6) {
                sales = sellingNumber * 1;
                totalSales += sales;
                rateCounter += 6;
            }
        }
        double averageRate = 1.0 * rateCounter / n;
        System.out.printf("%.2f%n", totalSales);
        System.out.printf("%.2f%n", averageRate);
    }
}