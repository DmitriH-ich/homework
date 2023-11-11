package homework26.task02;

public class Suitcase {

  String color;
  boolean wheeledSuitcase;
  int hight;
  int widht;
  int depth;
  double capacity;

  public Suitcase(String color, boolean wheeledSuitcase, int hight, int widht, int depth,
      double capacity) {
    this.color = color;
    this.wheeledSuitcase = wheeledSuitcase;
    this.hight = hight;
    this.widht = widht;
    this.depth = depth;
    this.capacity = capacity;
  }

  public Suitcase() {
    this("blue", false, 55, 40, 20, 44.1);
  }
}
