package W04_ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която чете n-на брой цели числа, подадени от потребителя и проверява
        //дали сумата от числата на четни позиции е равна на сумата на числата на нечетни позиции.
        //•	Ако сумите са равни да се отпечатат два реда: "Yes" и на нов ред "Sum = " + сумата;
        //•	Ако сумите не са равни да се отпечат два реда: "No" и на нов ред "Diff = " + разликата.
        //Разликата се изчислява по абсолютна стойност. (Math.abs());

        int n = Integer.parseInt(scanner.nextLine());

        //създаваме променливи, които пазят сбора на числата на четни или нечетни позиции
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            //определяме кое число е на четна позиция и кое е на нечетна позициа
            //итерацията i ни показва дали е на четна или на нечетна позиция, n=1, n=2 и т.н.
            if (i % 2 == 0) {
                evenSum = evenSum + currentNum;
            }
            else {
                oddSum = oddSum + currentNum;
            }
        }

        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        }
        else {
            int diff = Math.abs(evenSum - oddSum);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
