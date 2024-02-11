package W04_ForLoop.Lab;

import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //6.Сумиране на гласните букви
        //Да се напише програма, която чете текст (стринг), въведен от потребителя, изчислява и отпечатва сумата от стойностите на гласните букви според таблицата по-долу:
        //буква:  	a	e	i	o	u
        //стойност:	1	2	3	4	5
        //вход	изход	коментар
        //hello	  6	    e + o = 2 + 4 = 6

        String text = scanner.nextLine();

        //създаваме променлива, която ще запази сумата от всички гласни в подадения текст
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            switch (symbol) {
                case 'a':
                    sum = sum + 1;
                    break;
                case 'e':
                    sum = sum + 2;
                    break;
                case 'i':
                    sum = sum + 3;
                    break;
                case 'o':
                    sum = sum + 4;
                    break;
                case 'u':
                    sum = sum + 5;
                    break;
            }
        }
        //принтваме след края на фор цикъла
        System.out.println(sum);
    }
}
