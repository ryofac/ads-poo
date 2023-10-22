package Ex07.Questao4;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<Account>();
    private Double savingsAccountTax;
    private Double taxAccountTax;

    public Bank(Double savingsTax, Double taxAccountTax) {
        this.savingsAccountTax = savingsTax;
        this.taxAccountTax = taxAccountTax;
    }

    public Double getSavingsAccountTax() {
        return savingsAccountTax;
    }

    public Double getTaxAccountTax() {
        return taxAccountTax;
    }

    private Account getByIndex(int index) {
        return accounts.get(index);

    }

    public Integer totalAccounts() {
        return accounts.size();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public boolean applyTax(String accountNum) {
        Account acc = findAccount(accountNum);
        if (acc == null) {
            System.out.println("Não foi possível render: Conta não encontrada!");
            return false;
        } else if (!(acc instanceof SavingsAccount)) {
            System.out.println("Não foi possível render: Conta não é poupança! ");
            return false;
        }
        SavingsAccount accConverted = (SavingsAccount) acc;

        accConverted.applyTax();
        return true;

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
            total += acc.getTotal();
        }
        return total;
    }

    public double getValueAvr() {
        if (getTotalAccounts() > 0)
            return getTotalMoney() / getTotalAccounts();
        return 0;
    }

}
