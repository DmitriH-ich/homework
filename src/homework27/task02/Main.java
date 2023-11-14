package homework27.task02;

public class Main {

  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount("IBAN: 4562 3358 5245 36");
    System.out.println("На Вашем счету " + bankAccount.getInvoiceNum() + "\nнаходится: " +
        bankAccount.getMoneyAmount() + " €");

    bankAccount.deposit(1200.25);

    bankAccount.withdraw(751.29);

  }
}
