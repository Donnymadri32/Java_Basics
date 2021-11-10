public class BankAccount {
    private double balance = 0;
    private String name = "";


    public BankAccount(double balance, String name){
        this.balance = balance;
        this.name = name;
    }


    public void deposit(double deposit) {
        balance += deposit;
        System.out.println(balance);
    }

    public void withdraw(double withdraw) {
        balance -= withdraw;
        System.out.println(balance);
    }


}
