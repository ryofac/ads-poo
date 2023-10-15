package Ex07.Questao3;

public class Account {
    public String accountNumber;
    private Client client;
    private double total;

    Account(String _accountNumber, Client _client, double _total) {
        accountNumber = _accountNumber;
        client = _client;
        total = _total;
    }

    public Client getClient() {
        return this.client;
    }

    public Double getTotal() {
        return this.total;
    }

    public boolean deposit(double amount) {
        this.total += amount;
        return true;
    }

    public boolean transfer(double amount, Account account) {
        if (account.accountNumber != this.accountNumber && this.total - amount >= 0) {
            this.total -= amount;
            account.total += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (this.total - amount >= 0) {
            this.total -= amount;
            return true;

        }
        return false;
    }

    @Override
    public String toString() {
        String accountType = "CC";
        if (this instanceof TaxAccount) {
            accountType = "CI";
        } else if (this instanceof SavingsAccount) {
            accountType = "CP";
        }
        return this.accountNumber + ";" + accountType + ";" + this.client.getCpf() + ";" + this.total;
    }

}
