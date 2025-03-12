package util;

import java.util.Scanner;

public class InputUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readText(String pMessage) {
        System.out.println(pMessage);
        return scanner.nextLine();
    }

    public static double readDouble(String pMessage) {
        while (true) {
            System.out.print(pMessage);
            try {
                return Double.parseDouble(scanner.nextLine().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Invalid value. Please enter a number.");
            }
        }
    }
}
