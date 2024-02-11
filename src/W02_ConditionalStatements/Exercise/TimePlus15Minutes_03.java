package W02_ConditionalStatements.Exercise;

import java.util.Scanner;

public class TimePlus15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която чете час и минути от 24-часово денонощие, въведени от потребителя
        // и изчислява колко ще е часът след 15 минути. Резултатът да се отпечата във формат часове:минути.
        // Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59.
        // Часовете се изписват с една или две цифри.
        // Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо.

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        //Пресмятаме врeмето след 15 мин -> превръщаме всичко в минути и добавяме 15 мин.
        int totalMinutes = (hours * 60) + minutes + 15;

        //Пресмятаме часовете и минутите ->
        // общият брой минути / 60
        // общият брой минути % 60
        int finalHours = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;

        if (finalHours < 24) {
            System.out.printf("%d:%02d", finalHours, finalMinutes);
        } else {
            finalHours = 0;
            System.out.printf("%d:%02d", finalHours, finalMinutes);

        }

    }
}
