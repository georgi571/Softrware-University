package _1ProgrammingBasicsWithJavaMay2023._6NestedLoops._1Lab;

import java.util.Scanner;

public class _03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;
        for (int x1 = 0; x1 <= n ; x1++) {
            for (int x2 = 0; x2 <= n; x2++) {
                for (int x3 = 0; x3 <= n ; x3++) {
                    int result = x1 + x2 + x3;
                    if (result == n) {
                        number += 1;
                    }
                }
            }
        }
        System.out.printf("%d", number);
    }
}
