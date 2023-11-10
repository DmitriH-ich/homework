package homework26.task01;

public class Main {

  public static void printHumanQuestionnaire(Human human) {
    System.out.println("Имя: " + human.name);
    System.out.println("Возвраст: " + human.age + " лет.");
    System.out.println("Рост: " + human.growth + " см.");
    System.out.println("Вес: " + human.weigth + " кг.");
  }

  public static void main(String[] args) {
    Human human = new Human("Михаил", 28, 178, 75.3);
    printHumanQuestionnaire(human);
  }
}
