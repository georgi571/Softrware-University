package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._1BasicSyntaxConditionalStatementsAndLoops._3MoreExercise;

import java.util.Scanner;

public class _04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String backWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char currentSymbol = word.charAt(i);
            backWord += currentSymbol;
        }
        System.out.printf("%s",backWord);
    }
}
