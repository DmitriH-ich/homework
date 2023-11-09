package homework25.task02;

public class Main {

  public static void main(String[] args) {
    Pen myPen = new Pen();

    myPen.inkLevel();
    myPen.write("Привет всем! \n Как у всех сегодня дела?");
    myPen.checkInk();
    myPen.refill();
  }
}
