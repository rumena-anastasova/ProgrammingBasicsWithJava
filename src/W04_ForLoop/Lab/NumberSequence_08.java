package W04_ForLoop.Lab;

import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //8.Редица цели числа
        //Напишете програма, която чете n на брой цели числа.(n ще определя броя на завъртанията)
        //Принтирайте най-голямото и най-малкото число сред въведените.

        int n = Integer.parseInt(scanner.nextLine());

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        //for (int i = 0; i < n; i++)
        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            //на колкото е равно n, толкова пъти ще се завърти цикъла и ще прочете число от конзолата,
            // ако n=4, четири пъти ще се прочете число от конзолата

            if (number > maxValue) {
                maxValue = number;
            }
            if (number < minValue) {
                minValue = number;
            }
        }
        System.out.printf("Max number: %d%n", maxValue);
        System.out.printf("Min number: %d%n", minValue);
    }
}
