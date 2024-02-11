package W04_ForLoop.Lab;

import java.util.Scanner;

public class Numbers1ToNWithStep3_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3.Числата от 1 до N през 3
        //Напишете програма, която чете число n, въведено от потребителя
        // и отпечатва числата от 1 до n през 3.

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i += 3) {
            System.out.println(i);
        }
    }
}
