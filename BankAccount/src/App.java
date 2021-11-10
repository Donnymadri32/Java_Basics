import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Enter name");
        String name = kbReader.nextLine();
        BankAccount myAccount = new BankAccount(1000.0, name);
        myAccount.deposit(505.22);
        myAccount.withdraw(100);
    }
}
