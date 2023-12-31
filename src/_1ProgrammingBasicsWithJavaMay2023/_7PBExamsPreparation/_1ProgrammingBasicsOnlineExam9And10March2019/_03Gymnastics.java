package _1ProgrammingBasicsWithJavaMay2023._7PBExamsPreparation._1ProgrammingBasicsOnlineExam9And10March2019;

import java.util.Scanner;

public class _03Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String appliance = scanner.nextLine();
        double difficulty = 0.0;
        double performance = 0.0;
        double maxPoints = 20.000;
        if (country.equals("Russia")) {
            if (appliance.equals("ribbon")) {
                difficulty = 9.100;
                performance = 9.400;
            } else if (appliance.equals("hoop")) {
                difficulty = 9.300;
                performance = 9.800;
            } else if (appliance.equals("rope")) {
                difficulty = 9.600;
                performance = 9.000;
            }
        } else if (country.equals("Bulgaria")) {
            if (appliance.equals("ribbon")) {
                difficulty = 9.600;
                performance = 9.400;
            } else if (appliance.equals("hoop")) {
                difficulty = 9.550;
                performance = 9.750;
            } else if (appliance.equals("rope")) {
                difficulty = 9.500;
                performance = 9.400;
            }
        } else if (country.equals("Italy")) {
            if (appliance.equals("ribbon")) {
                difficulty = 9.200;
                performance = 9.500;
            } else if (appliance.equals("hoop")) {
                difficulty = 9.450;
                performance = 9.350;
            } else if (appliance.equals("rope")) {
                difficulty = 9.700;
                performance = 9.150;
            }
        }
        double points = difficulty + performance;
        System.out.printf("The team of %s get %.3f on %s.%n", country, points, appliance);
        double neededPoints = maxPoints - points;
        double neededPercent = (neededPoints / maxPoints) * 100;
        System.out.printf("%.2f%%", neededPercent);
    }
}
