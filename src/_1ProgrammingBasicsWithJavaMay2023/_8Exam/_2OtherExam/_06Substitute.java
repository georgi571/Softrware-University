package _1ProgrammingBasicsWithJavaMay2023._8Exam._2OtherExam;

import java.util.Scanner;

public class _06Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = K; i <= 8; i++) {
            for (int j = 9; j >= L; j--) {
                for (int k = M; k <= 8; k++) {
                    for (int l = 9; l >= N; l--) {
                        if (i % 2 == 0) {
                            if (j % 2 == 1) {
                                if (k % 2 == 0) {
                                    if (l % 2 == 1) {
                                        if (i == k && j == l) {
                                            System.out.println("Cannot change the same player.");
                                        } else {
                                            System.out.printf("%d%d - %d%d%n", i, j, k, l);
                                            counter += 1;
                                        }
                                        if (counter == 6) {
                                            break;
                                        }
                                    }
                                    if (counter == 6) {
                                        break;
                                    }
                                }
                                if (counter == 6) {
                                    break;
                                }
                            }
                            if (counter == 6) {
                                break;
                            }
                        }
                        if (counter == 6) {
                            break;
                        }
                    }
                    if (counter == 6) {
                        break;
                    }
                }
                if (counter == 6) {
                    break;
                }
            }
            if (counter == 6) {
                break;
            }
        }
    }
}