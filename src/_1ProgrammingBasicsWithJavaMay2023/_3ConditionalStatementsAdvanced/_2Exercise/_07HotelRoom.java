package _1ProgrammingBasicsWithJavaMay2023._3ConditionalStatementsAdvanced._2Exercise;

import java.util.Scanner;

public class _07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0.0;
        double apartmentPrice = 0.0;
        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50.00 * nights;
            apartmentPrice = 65.00 * nights;
            if (nights > 7 && nights <= 14) {
                studioPrice = studioPrice * 0.95;
            } else if (nights > 14) {
                studioPrice = studioPrice * 0.70;
                apartmentPrice = apartmentPrice * 0.90;
            }
        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20 * nights;
            apartmentPrice = 68.70 * nights;
            if (nights > 14) {
                studioPrice = studioPrice * 0.80;
                apartmentPrice = apartmentPrice * 0.90;
            }
        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = 76.00 * nights;
            apartmentPrice = 77.00 * nights;
            if (nights > 14) {
                apartmentPrice = apartmentPrice * 0.90;
            }
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartmentPrice ,studioPrice);
    }
}
