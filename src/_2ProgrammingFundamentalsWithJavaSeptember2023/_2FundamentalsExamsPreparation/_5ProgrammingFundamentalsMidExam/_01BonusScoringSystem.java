package _2ProgrammingFundamentalsWithJavaSeptember2023._2FundamentalsExamsPreparation._5ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class _01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0.0;
        double studentAttend = 0.0;
        for (int i = 1; i <= numberOfStudents; i++) {
            int attendForTheStudent = Integer.parseInt(scanner.nextLine());
            double currentBonusPoint = Math.ceil(1.0 * attendForTheStudent / numberOfLectures * (5 + additionalBonus));
            if (attendForTheStudent > studentAttend) {
                bonusPoints = currentBonusPoint;
                studentAttend = attendForTheStudent;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n",bonusPoints);
        System.out.printf("The student has attended %.0f lectures.%n", studentAttend);
    }
}
