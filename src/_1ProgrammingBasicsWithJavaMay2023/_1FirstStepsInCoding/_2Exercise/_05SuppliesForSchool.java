package _1ProgrammingBasicsWithJavaMay2023._1FirstStepsInCoding._2Exercise;

import java.util.Scanner;

public class _05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pensCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int detergentLiters = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());
        double pensSum = pensCount * 5.80;
        double markersSum = markersCount * 7.20;
        double detergentsSum = detergentLiters * 1.20;
        double totalSum = pensSum + markersSum + detergentsSum;
        totalSum = totalSum - (totalSum * discountPercent/100);
        System.out.println(totalSum);
    }
}
