package _1ProgrammingBasicsWithJavaMay2023._3ConditionalStatementsAdvanced._2Exercise;

import java.util.Scanner;

public class _04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCount = Integer.parseInt(scanner.nextLine());
        double priceOfShip = 0.0;
        if (season.equals("Spring")) {
            priceOfShip = 3000.0;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            priceOfShip = 4200.0;
        } else if (season.equals("Winter")) {
            priceOfShip = 2600.0;
        }
        if (fishersCount <= 6) {
            priceOfShip = priceOfShip * 0.90;
        } else if (fishersCount >= 7 && fishersCount <= 11) {
            priceOfShip = priceOfShip * 0.85;
        } else if (fishersCount >= 12) {
            priceOfShip = priceOfShip * 0.75;
        }
        if (fishersCount % 2 == 0 && !(season.equals("Autumn")) ) {
            priceOfShip = priceOfShip *0.95;
        }
        double diff = Math.abs(budget - priceOfShip);
        if (budget >= priceOfShip) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
