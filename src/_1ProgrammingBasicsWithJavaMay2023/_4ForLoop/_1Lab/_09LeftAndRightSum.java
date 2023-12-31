package _1ProgrammingBasicsWithJavaMay2023._4ForLoop._1Lab;

import java.util.Scanner;

public class _09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i <=n * 2; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (i <= n) {
                leftSum = leftSum + currentNum;
            } else {
                rightSum = rightSum + currentNum;
            }
        }
        int diff = Math.abs(leftSum - rightSum);
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", diff);
        }
    }
}
