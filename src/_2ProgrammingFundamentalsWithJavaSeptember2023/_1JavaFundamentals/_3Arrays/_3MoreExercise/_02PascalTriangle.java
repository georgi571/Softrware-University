package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._3Arrays._3MoreExercise;

import java.util.Scanner;

public class _02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int newNumber = 1;
        int[] oldArray = new int[n];
        for (int i = 1; i <= n; i++) {
            int[] array = new int[i];
            array[0] = 1;
            if (i > 1) {
                array[i - 1] = 1;
                if  (i > 2) {
                    int change = 1;
                    int change2 = 2;
                    for (int j = 1; j < i - 1; j++) {
                        if (i % 2 == 0) {
                            if (j < i / 2) {
                                array[j] = oldArray[j] + oldArray[j - 1];
                            } else {
                                array[j] = array[j - change];
                                change += 2;
                            }
                        } else {
                            if (j < i / 2) {
                                array[j] = oldArray[j] + oldArray[j - 1];
                            } else if (j == i / 2) {
                                array[j] = oldArray[j] + oldArray[j - 1];
                            } else {
                                array[j] = array[j - change2];
                                change2 += 2;
                            }
                        }
                    }
                }
            }
            for (int arrays: array) {
                System.out.print(arrays + " ");
            }
            System.out.println();
            newNumber += 1;
            for (int j = 0; j < newNumber - 1; j++) {
                oldArray[j] = array[j];
            }
        }
    }
}
