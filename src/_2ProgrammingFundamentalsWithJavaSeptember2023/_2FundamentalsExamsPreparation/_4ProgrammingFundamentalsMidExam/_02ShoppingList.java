package _2ProgrammingFundamentalsWithJavaSeptember2023._2FundamentalsExamsPreparation._4ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> groceries = Arrays.stream(scanner.nextLine()
                        .split("!"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {
            String[] commandForGrocery = command.split(" ");
            String currentCommand = commandForGrocery[0];
            String currentGrocery = commandForGrocery[1];
            if (command.contains("Urgent")) {
                if (!groceries.contains(currentGrocery)) {
                    groceries.add(0, currentGrocery);
                }
            } else if (command.contains("Unnecessary")) {
                if (groceries.contains(currentGrocery)) {
                    groceries.remove(currentGrocery);
                }
            } else if (command.contains("Correct")) {
                String newGrocery = commandForGrocery[2];
                if (groceries.contains(currentGrocery)) {
                    int index = groceries.indexOf(currentGrocery);
                    groceries.set(index, newGrocery);
                }
            } else if (command.contains("Rearrange")) {
                if (groceries.contains(currentGrocery)) {
                    int index = groceries.indexOf(currentGrocery);
                    groceries.remove(currentGrocery);
                    groceries.add(currentGrocery);
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < groceries.size() - 1; i++) {
            System.out.print(groceries.get(i) + ", ");
        }
        System.out.print(groceries.get(groceries.size() - 1));
    }
}
