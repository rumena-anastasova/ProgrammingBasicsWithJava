package W01_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        int countBookPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToReadTheBook = Integer.parseInt(scanner.nextLine());

        //Calculations
        //Изчисляваме общото време за четене на книгата
        int totalTimeToReadTheBook = countBookPages / pagesPerHour;
        //Изчисляваме необходимите часове на ден
        int hoursPerDayToReadTheBook = totalTimeToReadTheBook / daysToReadTheBook;

        //Output
        System.out.println(hoursPerDayToReadTheBook);
    }
}
