package homework39.task01;

public class Human {

  private String name;
  private int age;
  private int height;
  private double weigth;




  public Human(String name, int age, int height, double weigth) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weigth = weigth;
  }

  public Human() {
    this("Гоша", 20, 168,82.6);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public double getWeigth() {
    return weigth;
  }

  public void setWeigth(double weigth) {
    this.weigth = weigth;
  }

  @Override
  public String toString() {
    return "Human: " + this.name + ", "
            + "Age: " + this.age + ", "
            + "Height: " + this.height + ", "
            + "Weight: " + this.weigth +".";
  }

  public void printHumanQuestionnaire() {
    System.out.println("Имя: " + getName());
    System.out.println("Возвраст: " + getAge() + " лет.");
    System.out.println("Рост: " + getHeight() + " см.");
    System.out.println("Вес: " + getWeigth() + " кг.");
  }
}

