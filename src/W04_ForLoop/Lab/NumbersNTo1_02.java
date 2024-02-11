package W04_ForLoop.Lab;

import java.util.Scanner;

public class NumbersNTo1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //2.Числата от N до 1 в обратен ред
        //1.Създайте for цикъл с начална стойност на контролната променлива i = 1.
        // Направете крайната стойност  по-малка или равна на 100.
        // В блока от код на цикъла принтирайте i:

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
