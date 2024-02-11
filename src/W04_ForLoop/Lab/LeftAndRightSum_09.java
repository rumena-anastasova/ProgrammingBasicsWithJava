package W04_ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //9.Лява и дясна сума
        //Да се напише програма, която чете 2 * n-на брой цели числа, подадени от потребителя,
        //и проверява дали сумата на първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума).
        //При равенство печата " Yes, sum = " + сумата; иначе печата " No, diff = " + разликата.
        // Разликата се изчислява като положително число (по абсолютна стойност). (Math.abs());

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i <= 2 * n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            //определяме кое число влиза в лява сума и кое в дясна
            if (i <= n) {
                leftSum = leftSum + currentNum;
            }
            else {
                rightSum = rightSum + currentNum;
            }
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        }
        else {
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }
    }
}
