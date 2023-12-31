package _1ProgrammingBasicsWithJavaMay2023._8Exam._2OtherExam;

import java.util.Scanner;

public class _04Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        double kmRunFirstDay = Double.parseDouble(scanner.nextLine());
        double kmRunNextDay = kmRunFirstDay;
        double counter = kmRunFirstDay;
        for (int i = 0; i < numberOfDays; i++) {
            double percentNewKM = Double.parseDouble(scanner.nextLine());
            double kmForThisDay = kmRunNextDay + (kmRunNextDay * (percentNewKM / 100));
            counter += kmForThisDay;
            kmRunNextDay = kmForThisDay;
        }
        double diff = Math.ceil(Math.abs(counter - 1000));
        if (counter >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", diff);
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", diff);
        }
    }
}
