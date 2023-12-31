package _2ProgrammingFundamentalsWithJavaSeptember2023._2FundamentalsExamsPreparation._6ProgrammingFundamentalsMidExamRetake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> loots = Arrays.stream(scanner.nextLine()
                                .split("\\|"))
                        .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")){
            String[] currentCommand = command.split( " ");
            String commandForThisLoop = currentCommand[0];
            if (commandForThisLoop.equals("Loot")) {
                for (int i = 1; i < currentCommand.length; i++) {
                    if (!loots.contains(currentCommand[i])) {
                        loots.add(0, currentCommand[i]);
                    }
                }
            } else if (commandForThisLoop.equals("Drop")) {
                int index = Integer.parseInt(currentCommand[1]);
                if (index >= 0 && index <= loots.size() - 1) {
                    String currentLoot = loots.get(index);
                    loots.remove(index);
                    loots.add(currentLoot);
                }
            } else if (commandForThisLoop.equals("Steal")) {
                int index = Integer.parseInt(currentCommand[1]);
                List<String> stealedItems = new ArrayList<>();
                if (index <= loots.size()) {
                } else {
                    index = loots.size();
                }
                for (int i = 1; i <= index; i++) {
                    String stealedElement = loots.get(loots.size() - 1);
                    loots.remove(loots.size() - 1);
                    stealedItems.add(0, stealedElement);
                }
                for (int i = 0; i < stealedItems.size() - 1; i++) {
                    System.out.printf("%s, ", stealedItems.get(i));
                }
                System.out.printf("%s%n", stealedItems.get(stealedItems.size() - 1));
            }
            command = scanner.nextLine();
        }
        int sum = 0;
        int totalItems = loots.size();
        if (loots.size() > 0) {
            for (int i = 0; i < loots.size(); i++) {
              sum += loots.get(i).length();
            }
            double average = 1.0 * sum / totalItems;
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        } else {
            System.out.printf("Failed treasure hunt.%n");
        }
    }
}
