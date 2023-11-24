package homework32;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int a = 1; a <= 10; a++) {
            System.out.println(number + " * " + a + " = " + number * a);
        }
    }
}
