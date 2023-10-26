package _1ProgrammingBasicsWithJavaMay2023._6NestedLoops._2Exercise;

import java.util.Scanner;

public class _01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(counter + " ");
                counter += 1;
                if (counter > n) {
                    break;
                }
            }
            if (counter > n) {
                break;
            }
            System.out.println("");
        }
    }
}
