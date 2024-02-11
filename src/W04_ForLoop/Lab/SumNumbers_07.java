package W04_ForLoop.Lab;

import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //7.Сумиране на числа
        //Да се напише програма, която чете n-на брой цели числа, въведени от потребителя и ги сумира.
        //•	От първия ред на входа се въвежда броят числа n.
        //•	От следващите n реда се въвежда по едно цяло число.
        //Програмата трябва да прочете числата, да ги сумира и да отпечата сумата им.

        int n = Integer.parseInt(scanner.nextLine());

        //създаваме променлива, която сумира стойността на числата
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
