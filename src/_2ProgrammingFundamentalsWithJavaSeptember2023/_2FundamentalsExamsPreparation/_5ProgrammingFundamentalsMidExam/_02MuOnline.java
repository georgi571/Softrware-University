package _2ProgrammingFundamentalsWithJavaSeptember2023._2FundamentalsExamsPreparation._5ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class _02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int bitcoins = 0;
        int roomCounter = 0;
        String[] rooms = scanner.nextLine().split("\\|");
        for (int i = 0; i <rooms.length; i++) {
            roomCounter ++;
            String[] commandFromRoom = rooms[i].split(" ");
            String command = commandFromRoom[0];
            int number = Integer.parseInt(commandFromRoom[1]);
            if (command.equals("potion")) {
                int healing = 0;
                if (number > 100 - health) {
                    healing = 100 - health;
                }else {
                    healing = number;
                }
                health += healing;
                System.out.printf("You healed for %d hp.%n", healing);
                System.out.printf("Current health: %d hp.%n", health);
            } else if (command.equals("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);
            } else {
                health -= number;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    System.out.printf("You died! Killed by %s.%n",command);
                    System.out.printf("Best room: %d%n", roomCounter);
                    break;
                }
            }
        }
        if (health > 0) {
            System.out.printf("You've made it!%n");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}
