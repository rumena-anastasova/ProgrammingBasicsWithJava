package W02_ConditionalStatements.Exercise;

import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Дадено е цяло число – начален брой точки. Върху него се начисляват бонус точки по правилата, описани по-долу.
        //Да се напише програма, която пресмята бонус точките, които получава числото и общия брой точки (числото + бонуса).
        //•	Ако числото е до 100 включително, бонус точките са 5.
        //•	Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        //•	Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
        //
        //•	Допълнителни бонус точки (начисляват се отделно от предходните):
        //За четно число  + 1 т.
        //За число, което завършва на 5  + 2 т.

        //Inbox
        int startPoints = Integer.parseInt(scanner.nextLine());

        //Calculations

        double bonus = 0;
        if (startPoints <= 100) {
            bonus = 5;
        } else if (startPoints <= 1000) {
            bonus = startPoints * 0.2;
        } else {
            bonus = startPoints * 0.1;
        }

        if (startPoints % 2 == 0) {
            bonus = bonus + 1;
        } else if (startPoints % 10 == 5) {
            bonus = bonus + 2;
        }

        //Output
        System.out.println(bonus);
        System.out.println(startPoints + bonus);

    }
}
