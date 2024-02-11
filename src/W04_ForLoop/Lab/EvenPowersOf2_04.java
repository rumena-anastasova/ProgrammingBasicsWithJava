package W04_ForLoop.Lab;

import java.util.Scanner;

public class EvenPowersOf2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //4.Четни степени на числото 2;
        //Да се напише програма, която чете число n, въведено от потребителя
        // и печата четните степени на 2 ≤ 2n: 20, 22, 24, 26, …, 2n.

        //Трябва да отпечатаме числото 2 на всички четни степени от 0 до n
        //Начало: 0;
        //Край: n;
        //Промяна(стъпка): +2;

        int n = Integer.parseInt(scanner.nextLine());

        //стъпката step ще я инкрементираме с 2;
        for (int step = 0; step <= n ; step += 2) {
            //Math.Pow  - качва числото (2) на степен -> 2 на n-та степен
            System.out.println(Math.pow(2, step));
        }

        //int result = 1;
        //for (int i = 0; i <= n; i += 2) {
        //System.out.println(result);
        //result = result * 2 * 2;
        //}
    }
}
