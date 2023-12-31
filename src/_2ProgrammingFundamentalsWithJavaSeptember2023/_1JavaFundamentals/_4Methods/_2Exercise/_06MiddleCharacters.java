package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._4Methods._2Exercise;

import java.util.Scanner;

public class _06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleChar(text);
    }
    public static void printMiddleChar(String text){
        int length = text.length();
        if (length % 2 != 0) {
            char symbol = text.charAt(length / 2);
            System.out.println(symbol);
        } else {
            char symbol1 = text.charAt((length / 2) - 1);
            char symbol2 = text.charAt(length / 2);
            System.out.printf("%c%c", symbol1, symbol2);
        }
    }
}
