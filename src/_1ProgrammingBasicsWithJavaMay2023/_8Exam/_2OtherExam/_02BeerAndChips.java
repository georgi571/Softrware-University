package _1ProgrammingBasicsWithJavaMay2023._8Exam._2OtherExam;

import java.util.Scanner;

public class _02BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfTheFootballFan = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfBottleOfBeer = Integer.parseInt(scanner.nextLine());
        int numberOfPacketOfChips = Integer.parseInt(scanner.nextLine());
        double priceForBeer = numberOfBottleOfBeer * 1.20;
        double priceFor1Chips = priceForBeer * 0.45;
        double priceForChips = Math.ceil(priceFor1Chips * numberOfPacketOfChips);
        double totalPrice = priceForChips + priceForBeer;
        if (budget >= totalPrice) {
            double moneyLeft = budget - totalPrice;
            System.out.printf("%s bought a snack and has %.2f leva left.", nameOfTheFootballFan, moneyLeft);
        } else {
            double moneyNeed = totalPrice - budget;
            System.out.printf("%s needs %.2f more leva!", nameOfTheFootballFan, moneyNeed);
        }
    }
}
