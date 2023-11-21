package homework30;

public class Main02 {

  public static void main(String[] args) {
    double a = 2;
    double b = 64;
    double c = 73;
    double d = 26;
    double sum = a*(b - d) + (c * a) / d;
    System.out.println("Посчитать результат выражения: \na(b-d)+ca/d");
    System.out.println("Результат:\n2*(64-26)+73*2/26 = " + sum);
  }
}
