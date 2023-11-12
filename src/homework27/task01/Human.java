package homework27.task01;

public class Human {

  private String name;
  private int age;
  private int growth;
  private double weigth;

  public Human(String name, int age, int growth, double weigth) {
    this.name = name;
    this.age = age;
    this.growth = growth;
    this.weigth = weigth;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getGrowth() {
    return growth;
  }

  public double getWeigth() {
    return weigth;
  }

  public void setName(String name) {
    if (name.isEmpty()) {
      return;
    }
    this.name = name;
  }

  public void setAge(int age) {
    if (age < 0) {
      return;
    } else {
      this.age = age;
    }
  }

  public void setGrowth(int growth) {
    this.growth = growth;
  }

  public void setWeigth(double weigth) {
    this.weigth = weigth;
  }
}

