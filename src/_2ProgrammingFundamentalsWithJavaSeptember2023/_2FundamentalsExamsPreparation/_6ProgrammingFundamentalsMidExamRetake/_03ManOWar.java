package _2ProgrammingFundamentalsWithJavaSeptember2023._2FundamentalsExamsPreparation._6ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShips = Arrays.stream(scanner.nextLine().split(">"))
                        .map(e -> Integer.parseInt(e))
                        .collect(Collectors.toList());
        List<Integer> warShips = Arrays.stream(scanner.nextLine().split(">"))
                        .map(e -> Integer.parseInt(e))
                        .collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());
        boolean isWarContinue = true;
        String command = scanner.nextLine();
        while (!command.equals("Retire")) {
            String[] warCommand = command.split(" ");
            if (warCommand[0].equals("Fire")) {
                int index = Integer.parseInt(warCommand[1]);
                int damage = Integer.parseInt(warCommand[2]);
                if (index >= 0 && index <= warShips.size() - 1) {
                    warShips.set(index, warShips.get(index) - damage);
                    if (warShips.get(index) <= 0) {
                        System.out.printf("You won! The enemy ship has sunken.%n");
                        isWarContinue = false;
                        break;
                    }
                }
            } else if (warCommand[0].equals("Defend")) {
                int startIndex = Integer.parseInt(warCommand[1]);
                int endIndex = Integer.parseInt(warCommand[2]);
                int damage = Integer.parseInt(warCommand[3]);
                if (startIndex >= 0 && startIndex <= pirateShips.size() - 1 && endIndex >= 0 && endIndex <= pirateShips.size() - 1) {
                    for (int i = startIndex; i <= endIndex ; i++) {
                        pirateShips.set(i, pirateShips.get(i) - damage);
                        if (pirateShips.get(i) <= 0) {
                            System.out.printf("You lost! The pirate ship has sunken.");
                            isWarContinue = false;
                            break;
                        }
                    }
                }
            } else if (warCommand[0].equals("Repair")) {
                int index = Integer.parseInt(warCommand[1]);
                int health = Integer.parseInt(warCommand[2]);
                if (index >= 0 && index <= pirateShips.size() - 1) {
                    pirateShips.set(index, pirateShips.get(index) + health);
                    if (pirateShips.get(index) > maxHealth) {
                        pirateShips.set(index, maxHealth);
                    }
                }
            } else if (warCommand[0].equals("Status")) {
                int counter = 0;
                for (int pirateShip : pirateShips) {
                    if (pirateShip < maxHealth * 0.20) {
                        counter++;
                    }
                }
                System.out.printf("%d sections need repair.%n",counter);
            }
            command = scanner.nextLine();
        }
        int pirateShipsSum = 0;
        int warShipsSum = 0;
        if (isWarContinue) {
            for (int pirateShip : pirateShips) {
                pirateShipsSum += pirateShip;
            }
            for (int warShip : warShips) {
                warShipsSum += warShip;
            }
            System.out.printf("Pirate ship status: %d%n", pirateShipsSum);
            System.out.printf("Warship status: %d%n", warShipsSum);
        }
    }
}
