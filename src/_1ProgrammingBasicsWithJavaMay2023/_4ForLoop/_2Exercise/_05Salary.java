package _1ProgrammingBasicsWithJavaMay2023._4ForLoop._2Exercise;

import java.util.Scanner;

public class _05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOpenTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberOpenTabs; i++) {
            String tabName = scanner.nextLine();
            switch (tabName) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.printf("%d", salary);
        }
    }
}