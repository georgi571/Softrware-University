package _2ProgrammingFundamentalsWithJavaSeptember2023._1JavaFundamentals._5Lists._1Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        List<Integer> newNumbers = new ArrayList<>();
        List<Integer> usedNumbers = new ArrayList<Integer>(numbers);
        int n = 0;
        if (numbers.size() % 2 == 0) {
            n = numbers.size() / 2;
        } else {
            n = (numbers.size() / 2) + 1;
        }
        for (int i = 0; i < n; i++) {
            if (usedNumbers.size() > 1) {
                int firsNumber = usedNumbers.get(0);
                int lastNumber = usedNumbers.get(usedNumbers.size() - 1);
                int sum = firsNumber + lastNumber;
                newNumbers.add(sum);
                usedNumbers.remove(0);
                usedNumbers.remove(usedNumbers.size() - 1);
            } else {
                newNumbers.add(usedNumbers.get(0));
            }
        }
        for (int i = 0; i < newNumbers.size(); i++) {
            System.out.print(newNumbers.get(i) + " ");
        }

    }
}
