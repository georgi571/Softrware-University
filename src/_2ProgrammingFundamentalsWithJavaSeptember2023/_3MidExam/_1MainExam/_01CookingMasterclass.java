package _2ProgrammingFundamentalsWithJavaSeptember2023._3MidExam._1MainExam;

import java.util.Scanner;

public class _01CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceForFlour = Double.parseDouble(scanner.nextLine());
        double priceForEgg = Double.parseDouble(scanner.nextLine());
        double priceForApron = Double.parseDouble(scanner.nextLine());
        double sumForFlour = (students - (students / 5)) * priceForFlour;
        double sumForEggs = students *10 * priceForEgg;
        double sumForApron = Math.ceil(students * 1.20) * priceForApron;
        double totalSum = sumForFlour + sumForEggs + sumForApron;
        if (totalSum <= budget) {
            System.out.printf("Items purchased for %.2f$.%n", totalSum);
        } else {
            double diff = totalSum - budget;
            System.out.printf("%.2f$ more needed.%n", diff);
        }
    }
}
