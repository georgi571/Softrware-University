package _2ProgrammingFundamentalsWithJavaSeptember2023._2FundamentalsExamsPreparation._2ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.Scanner;

public class _02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] split = command.split(" ");
            if (split[0].equals("swap")) {
                int firstArray = Integer.parseInt(split[1]);
                int secondArray = Integer.parseInt(split[2]);
                int chagedNumber1 = numbers[firstArray];
                int chagedNumber2 = numbers[secondArray];
                numbers[firstArray] = chagedNumber2;
                numbers[secondArray] = chagedNumber1;
            } else if (split[0].equals("multiply")) {
                int firstArray = Integer.parseInt(split[1]);
                int secondArray = Integer.parseInt(split[2]);
                numbers[firstArray] = numbers[firstArray] * numbers[secondArray];
            }  else if (split[0].equals("decrease")) {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = numbers[i] - 1;
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length - 1 ; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[numbers.length - 1]);
    }
}
