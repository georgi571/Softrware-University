package _1ProgrammingBasicsWithJavaMay2023._1FirstStepsInCoding._2Exercise;

import java.util.Scanner;

public class _08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basketballFee = Integer.parseInt(scanner.nextLine());
        double sneakersPrice = basketballFee - (basketballFee * 0.40);
        double setPrice = sneakersPrice - (sneakersPrice * 0.20);
        double ballPrice = setPrice * 1/4;
        double accessPrice = ballPrice * 1/5;
        double finalPrice = basketballFee + sneakersPrice + setPrice + ballPrice + accessPrice;
        System.out.println(finalPrice);
    }
}
