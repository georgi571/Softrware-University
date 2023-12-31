package _1ProgrammingBasicsWithJavaMay2023._6NestedLoops._1Lab;

import java.util.Scanner;

public class _04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int number1 = 0;
        int number2 = 0;
        boolean isThisIsMagicNumber = false;
        for (int i1 = n1; i1 <= n2 ; i1++) {
            for (int i2 = n1; i2 <= n2 ; i2++) {
                int result = i1 + i2;
                counter += 1;
                if (magicNumber == result) {
                    number1 = i1;
                    number2 = i2;
                    isThisIsMagicNumber = true;
                    break;
                }
                }
            if (isThisIsMagicNumber) {
                break;
            }
        }
        if (isThisIsMagicNumber) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, number1, number2, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
