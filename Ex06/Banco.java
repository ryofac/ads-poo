package Ex06;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Account> accounts = new ArrayList<Account>();

    private Account getByIndex(int index) {
        return accounts.get(index);

    }

    public Integer quantidadeContas() {
        return accounts.size();
    }

    public Account findAccount(String accountNum) {
        for (Account acc : accounts) {
            if (acc.accountNumber.compareTo(accountNum) == 0) {
                return acc;
            }
        }
        return null;
    }

    public boolean insert(Account account) {
        Account equalAccount = findAccount(account.accountNumber);
        if (equalAccount != null) {
            return false;
        }
        accounts.add(account);
        return true;
    }

    public boolean remove(String accountNumber) {
        Account finded = findAccount(accountNumber);
        if (finded == null)
            return false;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).accountNumber == accountNumber) {
                accounts.remove(i);
                break;
            }

        }
        return true;

    }

    public boolean withdraw(String accountNum, double amount) {
        Account accountWithdraw = findAccount(accountNum);
        if (accountWithdraw != null) {
            return accountWithdraw.withdraw(amount);
        }
        return false;

    }

    public boolean deposit(String accountNum, double amount) {
        Account accountWithdraw = findAccount(accountNum);
        if (accountWithdraw != null) {
            return accountWithdraw.deposit(amount);
        }
        return false;

    }

    public boolean transfer(String debitAccountNumber, String creditAccountNumber, double amount) {
        Account accountDebit = findAccount(debitAccountNumber);
        Account accountCredit = findAccount(creditAccountNumber);
        if (accountCredit != null && accountCredit != null) {
            return accountDebit.transfer(amount, accountCredit);
        }
        return false;

    }

    int getTotalAccounts() {
        return accounts.size();
    }

    public double getTotalMoney() {
        double total = 0;
        for (Account acc : accounts) {
            total += acc.total;
        }
        return total;
    }

    public double getValueAvr() {
        if (getTotalAccounts() > 0)
            return getTotalMoney() / getTotalAccounts();
        return 0;
    }

}

class Account {
    String accountNumber;
    Client client;
    double total;

    Account(String _accountNumber, Client _client, double _total) {
        accountNumber = _accountNumber;
        client = _client;
        total = _total;
    }

    boolean deposit(double amount) {
        this.total += amount;
        return true;
    }

    boolean transfer(double amount, Account account) {
        if (account.accountNumber != this.accountNumber && this.total - amount >= 0) {
            this.total -= amount;
            account.total += amount;
            return true;
        }
        return false;
    }

    boolean withdraw(double amount) {
        if (this.total - amount >= 0) {
            this.total -= amount;
            return true;

        }
        return false;
    }

    double consultTotal() {
        return this.total;
    }

}

class Client {
    String cpf;
    String name;

    Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }
}

class Date {
    public int day;
    public int month;
    public int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.year = year;
        this.month = month;

    }
}