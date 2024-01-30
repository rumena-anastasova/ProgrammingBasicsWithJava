package W01_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input Data
        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositTermInMonths = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        //Calculations
        //Пресмятаме печалбата за месец
        double profitPerMonth = (depositSum * (interestRate /100 ))/ 12;
        double totalSum = depositSum + profitPerMonth * depositTermInMonths;

        //Output
        System.out.println(totalSum);

    }
}
