package _1ProgrammingBasicsWithJavaMay2023._5WhileLoop._1Lab;

import java.util.Scanner;

public class _08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double totalGrade = 0.0;
        int year = 1;
        int countPoorGrade = 0;
        while (year <= 12) {
            if (countPoorGrade > 1) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4.00) {
                countPoorGrade++;
                continue;
            }
            totalGrade += grade;
            year++;
            }
        if (countPoorGrade < 1) {
            double averageGrade = totalGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, year);
        }
    }
}
