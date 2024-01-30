package W01_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        int plasticInSqM = Integer.parseInt(scanner.nextLine());
        int paintInLiters = Integer.parseInt(scanner.nextLine());
        int thinnerInLiters = Integer.parseInt(scanner.nextLine());
        int hoursOfWork = Integer.parseInt(scanner.nextLine());

        //Calculations
        double plasticPrice = (plasticInSqM + 2) * 1.5;
        double paintPrice = (paintInLiters * 1.1) * 14.5;
        //double paintPrice = (paintInLiters + (paintInLiters * 0.1)) * 14.5;
        double thinnerPrice = thinnerInLiters * 5.0;
        double allMaterialsPrice = plasticPrice + paintPrice + thinnerPrice + 0.4;
        double workersPay = (allMaterialsPrice * 0.3) * hoursOfWork;
        double totalSumForRepainting = allMaterialsPrice + workersPay;

        //Output
        System.out.println(totalSumForRepainting);

    }
}
