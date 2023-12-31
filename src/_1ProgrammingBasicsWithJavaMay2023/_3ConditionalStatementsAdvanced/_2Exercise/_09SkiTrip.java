package _1ProgrammingBasicsWithJavaMay2023._3ConditionalStatementsAdvanced._2Exercise;

import java.util.Scanner;

public class _09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomsType = scanner.nextLine();
        String grade = scanner.nextLine();
        int nights = days - 1;
        double finalPrice = 0.0;
        if (roomsType.equals("room for one person")) {
            finalPrice = nights * 18.00;
        } else if (roomsType.equals("apartment")) {
            finalPrice = nights * 25.00;
            if (days < 10) {
                finalPrice = finalPrice * 0.70;
            } else if (days >= 10 && days <= 15) {
                finalPrice = finalPrice * 0.65;
            }else if (days > 15) {
                finalPrice = finalPrice * 0.50;
            }
        } else if (roomsType.equals("president apartment")) {
            finalPrice = nights * 35.00;
                if (days < 10) {
                    finalPrice = finalPrice * 0.90;
                } else if (days >= 10 && days <= 15) {
                    finalPrice = finalPrice * 0.85;
                }else if (days > 15) {
                    finalPrice = finalPrice * 0.80;
                }
        }
        if (grade.equals("positive")) {
            finalPrice = finalPrice * 1.25;
        } else if (grade.equals("negative")) {
            finalPrice = finalPrice * 0.90;
        }
        System.out.printf("%.2f", finalPrice);
    }
}
