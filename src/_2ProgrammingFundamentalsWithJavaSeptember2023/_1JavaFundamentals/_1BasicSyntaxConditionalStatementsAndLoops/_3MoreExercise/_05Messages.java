package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._1BasicSyntaxConditionalStatementsAndLoops._3MoreExercise;

import java.util.Scanner;

public class _05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String text = "";
        for (int i = 1; i <= number ; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            if (n == 2) {
                text += "a";
            } else if (n == 22) {
                text += "b";
            } else if (n == 222) {
                text += "c";
            } else if (n == 3) {
                text += "d";
            } else if (n == 33) {
                text += "e";
            } else if (n == 333) {
                text += "f";
            } else if (n == 4) {
                text += "g";
            } else if (n == 44) {
                text += "h";
            } else if (n == 444) {
                text += "i";
            } else if (n == 5) {
                text += "j";
            } else if (n == 55) {
                text += "k";
            } else if (n == 555) {
                text += "l";
            } else if (n == 6) {
                text += "m";
            } else if (n == 66) {
                text += "n";
            } else if (n == 666) {
                text += "o";
            } else if (n == 7) {
                text += "p";
            } else if (n == 77) {
                text += "q";
            } else if (n == 777) {
                text += "r";
            } else if (n == 7777) {
                text += "s";
            } else if (n == 8) {
                text += "t";
            } else if (n == 88) {
                text += "u";
            } else if (n == 888) {
                text += "v";
            } else if (n == 9) {
                text += "w";
            } else if (n == 99) {
                text += "x";
            } else if (n == 999) {
                text += "y";
            } else if (n == 9999) {
                text += "z";
            } else if (n == 0) {
                text += " ";
            }
        }
        System.out.printf("%s", text);
    }
}
