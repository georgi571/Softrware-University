package _1ProgrammingBasicsWithJavaMay2023._8Exam._1MainExam;

import java.util.Scanner;

public class _06MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int lastDigit = n / 100;
        int secondDigit = n % 100;
        secondDigit = secondDigit / 10;
        int firstDigit = n % 10;
        firstDigit = firstDigit / 1;
        for (int i = 1; i <= firstDigit ; i++) {
            for (int j = 1; j <= secondDigit ; j++) {
                for (int k = 1; k <= lastDigit; k++) {
                    int sum = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, sum);
                }
            }
        }
    }
}
