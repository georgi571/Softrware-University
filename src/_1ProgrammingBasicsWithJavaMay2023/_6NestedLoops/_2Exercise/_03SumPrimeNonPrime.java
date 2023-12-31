package _1ProgrammingBasicsWithJavaMay2023._6NestedLoops._2Exercise;

import java.util.Scanner;

public class _03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int sumPrimeNumber = 0;
        int sumNoPrimeNumber = 0;
        while (!command.equals("stop")) {
            int currentNum = Integer.parseInt(command);
            int dividersCount = 0;
            if (currentNum < 0) {
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            for (int i = 1; i <= currentNum; i++) {
                if (currentNum % i == 0) {
                    dividersCount++;
                }
            }
            if (dividersCount > 2) {
                sumNoPrimeNumber += currentNum;
            } else {
                sumPrimeNumber += currentNum;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n" +
                "Sum of all non prime numbers is: %d%n", sumPrimeNumber, sumNoPrimeNumber);
    }
}
