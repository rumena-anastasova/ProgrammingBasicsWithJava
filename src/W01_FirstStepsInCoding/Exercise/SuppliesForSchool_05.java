package W01_FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        int countPensPackage = Integer.parseInt(scanner.nextLine());
        int countHighlightersPackage = Integer.parseInt(scanner.nextLine());
        int cleaningAgentInLiters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        //Calculations
        double pensSum = countPensPackage * 5.80;
        double highlightersSum = countHighlightersPackage * 7.20;
        double cleaningAgentSum = cleaningAgentInLiters * 1.20;

        double sumWithoutDiscount = pensSum + highlightersSum + cleaningAgentSum;
        double sumWithDiscount = sumWithoutDiscount * 0.75;
        //double sumWithDiscount = sumWithoutDiscount - (sumWithoutDiscount * 0.25);

        //Output
        System.out.println(sumWithDiscount);


    }
}
