package _1ProgrammingBasicsWithJavaMay2023._4ForLoop._2Exercise;

import java.util.Scanner;

public class _06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameofActor = scanner.nextLine();
        double pointsOfAcademy = Double.parseDouble(scanner.nextLine());
        int numberOfEvaluative = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=numberOfEvaluative; i++) {
            String nameOfEvaluative = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            pointsOfAcademy += nameOfEvaluative.length() * points / 2;
            if (pointsOfAcademy > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameofActor, pointsOfAcademy);
                break;
            }
        }
        if (pointsOfAcademy <= 1250.5) {
            double diff = 1250.5 - pointsOfAcademy;
            System.out.printf("Sorry, %s you need %.1f more!", nameofActor, diff);
        }
    }
}
