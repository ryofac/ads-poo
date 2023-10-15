package Ex05;

import java.util.ArrayList;
import java.util.List;

public interface Bank {
    ArrayList<Account> accounts = new ArrayList();

    Account findAccount(String accountNum);

    boolean insert(Account account);

    boolean remove(String accountNumber);

    boolean withdraw(String accountNum, double amount);

    boolean deposit(String accountNum, double amount);

    boolean transfer(String debitAccountNumber, String creditAccountNumber, double amount);

    double getTotalMoney();

    double getValueAvr();

}