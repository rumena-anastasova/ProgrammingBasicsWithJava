package W01_FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int heigth = Integer.parseInt(scanner.nextLine());
        double spaceTakenPercentage = Double.parseDouble(scanner.nextLine()) / 100;

        //Calculations
        //Пресмятаме обема на аквариума в литри
        double fishTankVolumeInLiters = (length * width * heigth) / 1000.00; //(length * width * heigth) * 0.001;
        //Пресмятаме необходимите литри вода
        double neededLiters = fishTankVolumeInLiters * (1-spaceTakenPercentage);
        //double neededLiters = fishTankVolumeInLiters - (fishTankVolumeInLiters * spaceTakenPercentage);

        //Output
        System.out.println(neededLiters);
    }
}
