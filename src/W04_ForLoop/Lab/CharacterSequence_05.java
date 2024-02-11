package W04_ForLoop.Lab;

import java.util.Scanner;

public class CharacterSequence_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //5.Поток от символи
        //Напишете програма, която чете текст (стринг), въведен от потребителя
        // и печата всеки символ от текста на отделен ред.
        
        String text = scanner.nextLine();

        //for (int i = 0; i <= text.length() - 1 ; i++)
        for (int i = 0; i < text.length(); i++) {
            //Взимаме всеки символ по индеск i
            char symbol = text.charAt(i);
            System.out.println(symbol);
        }
    }
}
