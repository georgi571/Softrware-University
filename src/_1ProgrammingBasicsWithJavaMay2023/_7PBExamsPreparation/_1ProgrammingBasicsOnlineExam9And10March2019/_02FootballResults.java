package _1ProgrammingBasicsWithJavaMay2023._7PBExamsPreparation._1ProgrammingBasicsOnlineExam9And10March2019;

import java.util.Scanner;

public class _02FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int winCounter = 0;
        int loseCounter = 0;
        int drawCounter = 0;
        for (int i = 0; i < 3; i++) {
            String gameResult = scanner.nextLine();
            char firstPoints = gameResult.charAt(0);
            char secondPoints = gameResult.charAt(2);
            if (firstPoints > secondPoints) {
                winCounter++;
            }
            if (firstPoints < secondPoints) {
                loseCounter++;
            }
            if (firstPoints == secondPoints) {
                drawCounter++;
            }
        }

        System.out.printf("Team won %d games.%n", winCounter);
        System.out.printf("Team lost %d games.%n", loseCounter);
        System.out.printf("Drawn games: %d%n", drawCounter);
    }
}
