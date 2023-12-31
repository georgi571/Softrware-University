package _1ProgrammingBasicsWithJavaMay2023._5WhileLoop._2Exercise;

import java.util.Scanner;

public class _04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();
        int goalSteps = 10000;
        while (!commands.equals("Going home")) {
            int steps = Integer.parseInt(commands);
            goalSteps -= steps;
            if (goalSteps <= 0) {
                break;
            }
            commands = scanner.nextLine();
        }
        if (commands.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            goalSteps -= stepsToHome;
        }
        if (goalSteps >0) {
            System.out.printf("%d more steps to reach goal.", goalSteps);
        } else {
            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%d steps over the goal!", Math.abs(goalSteps));
        }
    }
}
