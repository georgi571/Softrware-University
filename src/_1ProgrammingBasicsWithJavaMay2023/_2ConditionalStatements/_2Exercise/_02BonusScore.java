package _1ProgrammingBasicsWithJavaMay2023._2ConditionalStatements._2Exercise;

import java.util.Scanner;

public class _02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = Integer.parseInt(scanner.nextLine());
        double  bonusPoints = 0;
        if (points <= 100){
           bonusPoints = 5;
        }else if (points <= 1000){
            bonusPoints = points * 0.20;
        }else if (points >1000){
            bonusPoints = points * 0.10;
        }
        if (points % 2 == 0){
            bonusPoints = bonusPoints + 1;
        } else if (points % 10 == 5){
            bonusPoints = bonusPoints + 2;
        }
        System.out.println(bonusPoints);
        System.out.println(bonusPoints + points);
    }
}
