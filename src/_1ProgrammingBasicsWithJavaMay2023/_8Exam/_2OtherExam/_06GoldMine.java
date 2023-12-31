package _1ProgrammingBasicsWithJavaMay2023._8Exam._2OtherExam;

import java.util.Scanner;

public class _06GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLocation = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfLocation; i++) {
            double expectedAverageGold = Double.parseDouble(scanner.nextLine());
            int numberOfDays = Integer.parseInt(scanner.nextLine());
            double totalMinedGold = 0.0;
            for (int j = 0; j < numberOfDays; j++) {
                double minedGoldForTheDay = Double.parseDouble(scanner.nextLine());
                totalMinedGold += minedGoldForTheDay;
            }
            double averageMinedGold = totalMinedGold / numberOfDays;
            if (averageMinedGold >= expectedAverageGold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageMinedGold);
            } else {
                double diff = expectedAverageGold - averageMinedGold;
                System.out.printf("You need %.2f gold.%n", diff);
            }
        }
    }
}