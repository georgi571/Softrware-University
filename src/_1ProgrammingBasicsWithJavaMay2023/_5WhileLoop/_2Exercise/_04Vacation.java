package _1ProgrammingBasicsWithJavaMay2023._5WhileLoop._2Exercise;

import java.util.Scanner;

public class _04Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int spendingCounter = 0;
        int dayCounters = 0;
        while (currentMoney < tripPrice && spendingCounter < 5) {
            String action = scanner.nextLine();
            double sumSpendOrSave = Double.parseDouble(scanner.nextLine());
            dayCounters += 1;
            if (action.equals("save")) {
                currentMoney += sumSpendOrSave;
                spendingCounter = 0;
                if (currentMoney >= tripPrice) {
                    System.out.printf("You saved the money for %d days.", dayCounters);
                    break;
                }
            } else if (action.equals("spend")) {
                currentMoney -= sumSpendOrSave;
                spendingCounter += 1;
                if (currentMoney < sumSpendOrSave) {
                    currentMoney = 0;
                }
                if (spendingCounter == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(dayCounters);
                    break;
                }
            }
         }
    }
}
