package homework32;


import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeArr = scanner.nextInt();
        int[] arr = new int[sizeArr];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Ввод: " + sizeArr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        boolean flag = true;
        for (int i = 1; i <= arr.length; i++) {
            if(arr[i] < arr[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Вывод:\n Массив отсортирован");
        } else {
            System.out.println("Вывод:\n Массив не отсортирован");
        }
    }
}


