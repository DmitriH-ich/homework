package homework31;

import java.util.Random;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int boneNumber1 = random.nextInt(1 + 6);
        int boneNumber2 = random.nextInt(1 + 6);

        System.out.println("Игра Кости: \nВыберите кол-во выбрасываемых костей.\nВведите 1 или 2: ");
        int amount = scanner.nextInt();
        if (amount < 1 || amount > 2) {
            System.out.println("Введено неправельное кол-во костей");
        } else if (amount == 1) {
            System.out.println("Выпало: " + boneNumber1);
        } else {
            System.out.println("Выпало: " + boneNumber1 + " и " + boneNumber2);
        }
    }
}
