package homework40;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Михаил", 28, 178, 75.3);
        Human human2 = new Human("Михаил", 28, 178, 75.3);
        System.out.println(human1.equals(human2));
        human1.setAge(20);
        System.out.println(human1.equals(human2));
    }
}

/*
Взять свой класс из задания 39.
Описать для него метод equals и hashCode.
В main создать два объекта с одинаковыми значениями полей. Сравнить их методом equals.
Удостовериться в том что результат - true.
Изменить какое-то значение в одном из объектов. Сравнить объекты еще раз.
Удостовериться в том что результат - false.

Вывод должен быть:
    true
    false
        */