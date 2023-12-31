package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._1BasicSyntaxConditionalStatementsAndLoops._2Exercise;

import java.util.Scanner;

public class _05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = "";
        for (int i = userName.length() - 1; i >= 0 ; i--) {
            char currentSymbol = userName.charAt(i);
            password += currentSymbol;
        }
        String inputPassword = scanner.nextLine();
        int counter = 0;
        while (!inputPassword.equals(password)) {
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
                inputPassword = scanner.nextLine();
            }
        }
        if (inputPassword.equals(password)) {
            System.out.printf("User %s logged in.", userName);
        }
    }
}
