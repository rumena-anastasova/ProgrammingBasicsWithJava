package W01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int countProjects = Integer.parseInt(scanner.nextLine());

        int totalTime = countProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, totalTime, countProjects);
    }
}
