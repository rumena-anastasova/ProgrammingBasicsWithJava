package W02_ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        //2.	Брой пъзели - цяло число в интервала [0… 1000]
        //3.	Брой говорещи кукли - цяло число в интервала [0 … 1000]
        //4.	Брой плюшени мечета - цяло число в интервала [0 … 1000]
        //5.	Брой миньони - цяло число в интервала [0 … 1000]
        //6.	Брой камиончета - цяло число в интервала [0 … 1000]

        //Input
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int tracks = Integer.parseInt(scanner.nextLine());

        //Calculations
        //Цени на играчките:
        //•	Пъзел - 2.60 лв.
        //•Говореща кукла - 3 лв.
        //•	Плюшено мече - 4.10 лв.
        // Миньон - 8.20 лв.
        //•	Камионче - 2 лв.

       double totalPrice = puzzles * 2.60 + dolls * 3.00 + teddyBears * 4.10 + minions * 8.20 + tracks * 2.00;

        //Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
        int toysCount = puzzles + dolls + teddyBears + minions + tracks;
        if (toysCount >= 50) {
            totalPrice = totalPrice * 0.75;
        }

        //Изчисляваме наема на магазина(10%) и го вадим от спечеленит пари.
        double rentPrice = totalPrice * 0.1;
        double totalSum = totalPrice - rentPrice;

        if (totalSum >= tripPrice) {
            double moneyLeft = totalSum - tripPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - totalSum);
        }

    }
}
