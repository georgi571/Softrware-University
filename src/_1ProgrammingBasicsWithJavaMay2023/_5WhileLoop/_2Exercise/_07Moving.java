package _1ProgrammingBasicsWithJavaMay2023._5WhileLoop._2Exercise;

import java.util.Scanner;

public class _07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int volumeRoom = width * length * height;
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int numbersOfBox = Integer.parseInt(command);
            volumeRoom -= numbersOfBox;
            if (volumeRoom <= 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if (volumeRoom <= 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(volumeRoom));
        } else {
            System.out.printf("%d Cubic meters left.", volumeRoom);
        }
    }
}
