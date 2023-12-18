package homework33;

import java.util.Random;

public class Main01 {

    /*Разработать метод, изменяющий знаки всех элементов целочисленного массива на противоположные
    Продемострировать работу метода в свободной форме
    Пример:
    Вводные данные: 1 5 7 -4 8 -3 -6
    Результат: -1 -5 -7 4 -8 3 6
  */

    public static void turnover(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {

        Random random = new Random();
        int min = -10;
        int max = 10;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + random.nextInt(max - min);
        }
        print(arr);
        System.out.println();
        turnover(arr);
        print(arr);
    }
}


