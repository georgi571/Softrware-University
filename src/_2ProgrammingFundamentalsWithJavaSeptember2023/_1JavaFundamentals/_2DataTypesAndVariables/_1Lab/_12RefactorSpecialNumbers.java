package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._2DataTypesAndVariables._1Lab;

import java.util.Scanner;

public class _12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isSpecialNum = false;
        for (int ch = 1; ch <= n; ch++) {
            int number = ch;
            int sum = 0;
            while (ch > 0) {
                sum += ch % 10;
                ch = ch / 10; }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecialNum){
                System.out.printf("%d -> True%n", number);
            } else {
                System.out.printf("%d -> False%n", number);
            }
            sum = 0;
            ch = number; }

    }
}
