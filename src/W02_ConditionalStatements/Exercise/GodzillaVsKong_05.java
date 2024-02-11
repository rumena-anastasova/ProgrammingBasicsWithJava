package W02_ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        double budget = Double.parseDouble(scanner.nextLine());
        int countExtras = Integer.parseInt(scanner.nextLine());
        double priceForClothesForOnePerson = Double.parseDouble(scanner.nextLine());

        //Calculations
        //•	Декорът за филма е на стойност 10% от бюджета.
        //•	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.
        double decor = budget * 0.1;
        double priceFotClothesAll = priceForClothesForOnePerson * countExtras;
        if (countExtras > 150) {
            priceFotClothesAll = priceFotClothesAll * 0.9;
        }

        double movieCost = decor + priceFotClothesAll;

        //Output
        if (movieCost > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", movieCost - budget);
        } else if (budget >= movieCost) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - movieCost);
        }
    }
}
