package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._2DataTypesAndVariables._3MoreExercise;

import java.util.Scanner;

public class _01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            Scanner commandType = new Scanner(command);
            if (commandType.hasNextInt()) {
                System.out.printf("%s is integer type%n", command);
            } else if (commandType.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", command);
            } else if (commandType.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", command);
            } else if (command.length() == 1) {
                System.out.printf("%s is character type%n", command);
            } else {
                System.out.printf("%s is string type%n", command);
            }
            command = scanner.nextLine();
        }
    }
}
