package W02_ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        //•	Ако фигурата е квадрат (square): на следващия ред се чете едно дробно число - дължина на страната му
        //•	Ако фигурата е правоъгълник (rectangle): на следващите два реда четат две дробни числа - дължините на страните му
        //•	Ако фигурата е кръг (circle): на следващия ред чете едно дробно число - радиусът на кръга
        //•	Ако фигурата е триъгълник (triangle): на следващите два реда четат две дробни числа - дължината на страната му и дължината на височината към нея
        //Резултатът да се закръгли до 3 цифри след десетичната запетая.

        double area = 0;
        if (figure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            //формула за лице на кръг S = πr²
            area = Math.PI * radius * radius;
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double ah = Double.parseDouble(scanner.nextLine());
            //S=(sideA*hightA)/2
            area = (a * ah) / 2;
        }

        System.out.printf("%.3f", area);

    }
}

