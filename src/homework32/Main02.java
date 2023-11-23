package homework32;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arr = new int[11];
        for (int i = 1; i < arr.length; i ++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
