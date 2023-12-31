package _1ProgrammingBasicsWithJavaMay2023._5WhileLoop._2Exercise;

import java.util.Scanner;

public class _05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        double changeInCoins = change * 100;
        int countOf2BGN = 0;
        int countOf1BGN = 0;
        int countOf050BGN = 0;
        int countOf020BGN = 0;
        int countOf010BGN = 0;
        int countOf005BGN = 0;
        int countOf002BGN = 0;
        int countOf001BGN = 0;
        while (changeInCoins > 0) {
            if (changeInCoins >= 200) {
                countOf2BGN += 1;
                changeInCoins -= 200;
            } else if (changeInCoins >= 100) {
                countOf2BGN += 1;
                changeInCoins -= 100;
            } else if (changeInCoins >= 50) {
                countOf050BGN += 1;
                changeInCoins -= 50;
            } else if (changeInCoins >= 20) {
                countOf020BGN += 1;
                changeInCoins -= 20;
            } else if (changeInCoins >= 10) {
                countOf010BGN += 1;
                changeInCoins -= 10;
            } else if (changeInCoins >= 5) {
                countOf005BGN += 1;
                changeInCoins -= 5;
            } else if (changeInCoins >= 2) {
                countOf002BGN += 1;
                changeInCoins -= 2;
            } else if (changeInCoins >= 1) {
                countOf001BGN += 1;
                changeInCoins -= 1;
            } else {
                break;
            }
        }
        int count = countOf2BGN + countOf1BGN + countOf050BGN + countOf020BGN + countOf010BGN + countOf005BGN +countOf002BGN + countOf001BGN;
        System.out.printf("%d", count);
    }
}
