package homework26.task02;

public class Main {

  public static void printSuitcaseparametrs(Suitcase suitcase) {
    System.out.println("Параметры чемоданов: ");
    System.out.println("Цвет " + suitcase.color);
    System.out.println("На колёсиках " + suitcase.wheeledSuitcase);
    System.out.println("Высота " + suitcase.hight + "см.");
    System.out.println("Ширина " + suitcase.widht + "см.");
    System.out.println("Глубина" + suitcase.depth);
    System.out.println("" + suitcase.capacity);
  }

  public static void main(String[] args) {
    Suitcase suitcase = new Suitcase("black", true, 82,
        54, 36, 120.5);
    printSuitcaseparametrs(suitcase);

    Suitcase suitcase1 = new Suitcase();
    printSuitcaseparametrs(suitcase1);
  }

}











