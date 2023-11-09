package homework25.task02;

public class Pen {

  int inkFull = 1000;

  public void inkLevel() {
    System.out.println("Полная ручка содержит 1000 чернил. ");
  }

  public void write(String text) {
    int charactersWritten = text.length();
    if (inkFull >= charactersWritten) {
      System.out.println(text);
      inkFull -= charactersWritten;
    } else {
      System.out.println("не достаточно чернил в ручке.");
    }
  }

  public void checkInk() {
    System.out.println("В ручке осталось " + inkFull + " чернил.");
  }

  public void refill() {
    inkFull = 1000;
    System.out.println("Чернила были дополнены до " + inkFull + ".");
  }
}

