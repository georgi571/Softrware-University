package _2ProgrammingFundamentalsWithJavaSeptember2023._2FundamentalsExamsPreparation._3ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                        .map(e -> Integer.parseInt(e))
                        .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] turnCommand = command.split(" ");
            if (turnCommand[0].equals("Shoot")) {
                int index = Integer.parseInt(turnCommand[1]);
                int power = Integer.parseInt(turnCommand[2]);
                if (index >= 0 && index <= targets.size() - 1) {
                    targets.set(index, targets.get(index) - power);
                    if (targets.get(index) <= 0) {
                        targets.remove(index);
                    }
                }
            } else if (turnCommand[0].equals("Add")) {
                int index = Integer.parseInt(turnCommand[1]);
                int value = Integer.parseInt(turnCommand[2]);
                if (index >= 0 && index <= targets.size() - 1) {
                    targets.add(index, value);
                } else {
                    System.out.printf("Invalid placement!%n");
                }
            } else if (turnCommand[0].equals("Strike")) {
                int index = Integer.parseInt(turnCommand[1]);
                int radius = Integer.parseInt(turnCommand[2]);
                if (index >= 0 && index <= targets.size() - 1) {
                    if (index - radius >= 0 && index + radius <= targets.size() - 1) {
                        for (int i = index + radius; i >= index - radius; i--) {
                            targets.remove(i);
                        }
                    } else {
                        System.out.printf("Strike missed!%n");
                    }
                } else {
                    System.out.printf("Strike missed!%n");
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < targets.size() - 1 ; i++) {
            System.out.printf("%d|", targets.get(i));
        }
        System.out.printf("%d", targets.get(targets.size() - 1));
    }
}
