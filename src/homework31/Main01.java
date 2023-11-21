package homework31;

import java.util.Scanner;

public class Main01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double d = scanner.nextDouble();
    double sum = a * (b - d) + (c * a) / d;
    System.out.println("Посчитать результат выражения: \na(b-d)+ca/d");
    System.out.println("Результат:\n2*(64-26)+73*2/26 = " + sum);
  }
}



