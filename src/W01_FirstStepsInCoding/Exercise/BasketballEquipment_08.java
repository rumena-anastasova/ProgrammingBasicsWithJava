package W01_FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        //Годишната такса за тренировки по баскетбол – цяло число
        int yearlyFee = Integer.parseInt(scanner.nextLine());

        //Calculations
        double shoesPrice = yearlyFee * 0.6;
        double kitPrice = shoesPrice * 0.8;
        double ballPrice = kitPrice * 0.25;
        double accessoriesPrice = ballPrice * 0.2;
        double allEquipmentPrice = yearlyFee + shoesPrice + kitPrice + ballPrice + accessoriesPrice;

        //Output
        System.out.println(allEquipmentPrice);
    }
}
