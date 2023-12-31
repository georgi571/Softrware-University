package _2ProgrammingFundamentalsWithJavaSeptember2023._2FundamentalsExamsPreparation._3ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class _01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEnergy  = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int winCounter = 0;
        boolean isEnemyReachable = false;
        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);
            if (initialEnergy >= distance) {
                initialEnergy -= distance;
                winCounter += 1;
                if (winCounter % 3 == 0) {
                    initialEnergy += winCounter;
                }
            } else {
                isEnemyReachable = true;
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", winCounter, initialEnergy);
                break;
            }
            command = scanner.nextLine();
        }
        if (!isEnemyReachable) {
            System.out.printf("Won battles: %d. Energy left: %d%n", winCounter, initialEnergy);
        }
    }
}
