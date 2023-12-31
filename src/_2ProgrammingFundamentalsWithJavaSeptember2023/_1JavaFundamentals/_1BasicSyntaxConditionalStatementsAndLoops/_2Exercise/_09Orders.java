package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._1BasicSyntaxConditionalStatementsAndLoops._2Exercise;

import java.util.Scanner;

public class _09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOrders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;
        for (int i = 1; i <= numberOfOrders ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            double orderPrice = (capsuleCount * days) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n",orderPrice);
            totalPrice += orderPrice;
        }
        System.out.printf("Total: $%.2f%n",totalPrice);
    }
}
