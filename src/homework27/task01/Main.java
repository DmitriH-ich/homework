package homework27.task01;

public class Main {

  public static void main(String[] args) {
    Human human = new Human("Михаил", 28, 178, 75.3);
    System.out.println("Имя: " + human.getName());
    System.out.println("Возвраст: " + human.getAge() + " лет.");
    System.out.println("Рост: " + human.getGrowth() + " см.");
    System.out.println("Вес: " + human.getWeigth() + " кг.");
  }
}






