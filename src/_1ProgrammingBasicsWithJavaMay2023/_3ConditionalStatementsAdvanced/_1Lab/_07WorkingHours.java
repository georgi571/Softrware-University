package _1ProgrammingBasicsWithJavaMay2023._3ConditionalStatementsAdvanced._1Lab;

import java.util.Scanner;

public class _07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hours >=10 && hours <=18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
                break;
            default:
                System.out.println("closed");
                break;
        }
    }
}
