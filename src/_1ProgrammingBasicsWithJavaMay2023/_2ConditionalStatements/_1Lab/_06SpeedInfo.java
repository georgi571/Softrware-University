package _1ProgrammingBasicsWithJavaMay2023._2ConditionalStatements._1Lab;

import java.util.Scanner;

public class _06SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        String resultText = "";
        if (speed <= 10){
            resultText = "slow";
        } else if (speed <=50){
            resultText = "average";
        } else if (speed <=150){
            resultText = "fast";
        } else if (speed <=1000){
            resultText = "ultra fast";
        } else if (speed >1000){
            resultText = "extremely fast";
        }
        System.out.println(resultText);
    }
}
