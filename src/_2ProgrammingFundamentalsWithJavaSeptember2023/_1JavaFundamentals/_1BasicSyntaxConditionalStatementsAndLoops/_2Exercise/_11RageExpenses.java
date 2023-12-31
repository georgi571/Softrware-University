package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._1BasicSyntaxConditionalStatementsAndLoops._2Exercise;

import java.util.Scanner;

public class _11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGameCounter = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int headsetCounter = 0;
        int mousetCounter = 0;
        int keyboardCounter = 0;
        int displayCounter = 0;
        for (int i = 1; i <= lostGameCounter ; i++) {
            if (i % 2 == 0) {
                headsetCounter++;
            }
            if (i % 3 == 0) {
                mousetCounter++;
            }
            if (i % 6 == 0) {
                keyboardCounter++;
            }
            if (i % 12 == 0) {
                displayCounter++;
            }
        }
        double priceForHeadset = headsetPrice * headsetCounter;
        double priceForMouse = mousePrice * mousetCounter;
        double priceForKeyboard = keyboardPrice * keyboardCounter;
        double priceForDisplay = displayPrice * displayCounter;
        double totalPrice = priceForHeadset + priceForMouse + priceForKeyboard + priceForDisplay;
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
