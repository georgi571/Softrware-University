package _2ProgrammingFundamentalsWithJavaSeptember2023._2FundamentalsExamsPreparation._5ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine()
                                .split(", "))
                        .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            String[] currentCommand = command.split(" - ");
            if (currentCommand[0].equals("Collect")) {
                if (!items.contains(currentCommand[1])) {
                    items.add(currentCommand[1]);
                }
            } else if (currentCommand[0].equals("Drop")) {
                if (items.contains(currentCommand[1])) {
                    items.remove(currentCommand[1]);
                }
            } else if (currentCommand[0].equals("Combine Items")) {
                String[] combineItems = currentCommand[1].split(":");
                String oldItem = combineItems[0];
                String newItem = combineItems[1];
                if (items.contains(oldItem)) {
                    int index = items.indexOf(oldItem);
                    items.add(index + 1, newItem);
                }
            } else if (currentCommand[0].equals("Renew")) {
                if (items.contains(currentCommand[1])) {
                    String renewItem = currentCommand[1];
                    items.remove(renewItem);
                    items.add(renewItem);
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < items.size() - 1; i++) {
            System.out.printf("%s, ", items.get(i));
        }
        System.out.printf("%s", items.get(items.size() - 1));
    }
}
