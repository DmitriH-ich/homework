package homework25.task01;

public class Main {

  public static void main(String[] args) {
    Human person1 = new Human();
    person1.name = "Настя";
    person1.age = 18;
    Human person2 = new Human();
    person2.name = "Михаил";
    person2.age = 36;
    Human person3 = new Human();
    person3.name = "Сергей";
    person3.age = 25;

    person1.introduce();
    person2.introduce();
    person3.introduce();
  }
}
