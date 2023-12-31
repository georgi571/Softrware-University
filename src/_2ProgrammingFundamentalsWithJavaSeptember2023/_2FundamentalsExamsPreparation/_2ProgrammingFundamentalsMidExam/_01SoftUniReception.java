package _2ProgrammingFundamentalsWithJavaSeptember2023._2FundamentalsExamsPreparation._2ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class _01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployeeEfficiency  = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency  = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency  = Integer.parseInt(scanner.nextLine());
        int studentsCount  = Integer.parseInt(scanner.nextLine());
        int totalEmployeeEfficiencyPerHour = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;
        int needHours = 0;
        int restTime = 0;
        while (studentsCount > 0) {
            studentsCount -= totalEmployeeEfficiencyPerHour;
            needHours += 1;
            if (studentsCount > 0 && needHours % 3 == 0) {
                restTime += 1;
            }
        }
        int totalHours = needHours + restTime;
        System.out.printf("Time needed: %dh.",totalHours);
    }
}
