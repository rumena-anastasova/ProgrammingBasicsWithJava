package W02_ConditionalStatements_Lab;

import java.util.Scanner;

public class EvenOrOdd_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която чете цяло число, въведено от потребителя и печата дали е четно или нечетно.
        //Ако е четно отпечатайте "even", ако е нечетно "odd".
        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
