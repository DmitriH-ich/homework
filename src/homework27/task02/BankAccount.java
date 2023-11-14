package homework27.task02;

public class BankAccount {

  private String invoiceNum;
  private double moneyAmount;

  public BankAccount(String invoiceNum) {
    this.invoiceNum = invoiceNum;
    this.moneyAmount = 0.0;
  }

  public String getInvoiceNum() {
    return invoiceNum;
  }

  public double getMoneyAmount() {
    return moneyAmount;
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= moneyAmount) {
      moneyAmount -= amount;
      System.out.println("Сумма " + amount + " снята со счета. \nНовый баланс: " + moneyAmount + "€");
    } else {
      System.out.println("Недостаточно средств на счете.");
    }
  }

  public void deposit(double amount) {
    if (amount > 0) {
      moneyAmount += amount;
      System.out.println("Сумма " + amount + " внесена на счет. \nНовый баланс: " + moneyAmount);
    } else {
      System.out.println("Неверная сумма для внесения.");
    }
  }
}










/*Разработать класс "Банковский счет".
Добавить поля для суммы денег на счету и номера счета.
Добавить конструктор с одним параметром "номер счета".
Применить инкапсуляцию: сделать поля приватными и написать аксесоры.
Написать аксесоры таким образом, чтобы нельзя было изменить номер счета.
Вместо сеттера, для поля "сумма" сделать два метода, один из которых позволит
снять переданную сумму со счета, а второй позволит положить сумму на счет.
Очевидно, что если пользователь попытается снять больше денег чем есть на счету,
эта операция не должна произойти и должно быть выведено сообщение "недостаточно средств".

 */