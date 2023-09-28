package lastpencil;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pencils would you like to use:");

        boolean flag = false;
        String numberStr = "";

        while (!flag) {

            numberStr = scanner.nextLine();
            if (!numberStr.matches("[0-9][0-9]?")) {

                System.out.println("The number of pencils should be numeric");
            } else if (numberStr.equals("0")) {

                System.out.println("The number of pencils should be positive");
            } else {

                flag = true;
            }
        }

        int number = Integer.parseInt(numberStr);

        System.out.println("Who will be the first (John, Jack):");
        String name = "";

        flag = false;
        while (!flag) {

            name = scanner.next();
            if (!name.matches("John|Jack")) {

                System.out.println("Choose between 'John' and 'Jack'");
            } else {

                flag = true;
            }
        }

        System.out.println("|".repeat(number));
        String takenPencils = "";

        while (number > 0) {

            System.out.printf("%s turn%n", name);

            flag = false;
            while(!flag) {
                takenPencils = scanner.next();
                if (!takenPencils.matches("[123]")) {

                    System.out.println("Possible values: '1', '2' or '3'");
                } else if (Integer.parseInt(takenPencils) > number) {

                    System.out.println("Too many pencils were taken");
                } else {

                    flag = true;
                }
            }

            number -= Integer.parseInt(takenPencils);
            System.out.println("|".repeat(number));

            if (name.equals("John")) {

                name = "Jack";

            } else {

                name = "John";
            }
            String winner = name;
        }
        System.out.println(name + " won!");

    }
}
