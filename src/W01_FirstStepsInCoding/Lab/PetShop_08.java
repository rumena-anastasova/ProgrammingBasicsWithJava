package W01_FirstStepsInCoding_Lab;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFoodCount = Integer.parseInt(scanner.nextLine());
        int catFoodCount = Integer.parseInt(scanner.nextLine());

        double dogFoodPrice = dogFoodCount * 2.5;
        double catFoodPrice = catFoodCount * 4.0;
        double totalPrice = dogFoodPrice + catFoodPrice;

        System.out.printf("%f lv.", totalPrice);

    }
}
