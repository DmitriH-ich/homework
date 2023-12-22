package homework44;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите форму Вашего участка:");
        System.out.println("1. Прямоугольник");
        System.out.println("2. Круг");
        System.out.println("3. Многоугольник");

        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.println("Введите длину Вашего участка:");
                double length = scanner.nextDouble();
                System.out.println("Введите ширину Вашего участка:");
                double heigth = scanner.nextDouble();
                shape = new Rectangle(length, heigth);
                break;
            case 2:
                System.out.println("Введите радиус Вашего участка:");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 3:
                System.out.println("Введите количество сторон Вашего участка:");
                int amountSide = scanner.nextInt();
                System.out.println("Введите длину одной стороны Вашего участка:");
                length = scanner.nextDouble();
                shape = new RegularPolygon(length, amountSide);
                break;
            default:
                System.out.println("Нет подходящей для Вас опции? Позвоните нам.");
                return;
        }
        System.out.println("Введите цену забора за 1м.: ");
        double price = scanner.nextDouble();
        System.out.println(shape);
        System.out.println(shape.getPerimetr() + "m.");
        System.out.println("Цена вашего забора: " + shape.getPerimetr() * price + "€");

    }
}



