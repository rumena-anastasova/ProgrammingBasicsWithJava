package W01_FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        int chickenMenuCount = Integer.parseInt(scanner.nextLine());
        int fishMenuCount = Integer.parseInt(scanner.nextLine());
        int vegeterianMenuCount = Integer.parseInt(scanner.nextLine());

        //Calculations
        double chickenMenuPrice = chickenMenuCount * 10.35;
        double fishMenuPrice = fishMenuCount * 12.40;
        double vegeterianMenuPrice = vegeterianMenuCount * 8.15;
        double allMenusPrice = chickenMenuPrice + fishMenuPrice + vegeterianMenuPrice;
        double dessertPrice = allMenusPrice * 0.2;
        double totalSum = allMenusPrice + dessertPrice + 2.50;

        //Output
        System.out.println(totalSum);
    }
}
