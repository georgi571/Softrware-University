package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._3Arrays._1Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e))
                        .toArray();
        int[] temp = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = numbers[i];
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            int[] current = new int[temp.length - 1];
            for (int j = 0; j < current.length; j++) {
                current[j] = temp[j] + temp[j+1];
            }
            temp = current;
        }
        System.out.println(temp[0]);
    }
}
