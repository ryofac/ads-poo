package Ex07.Questao3;

public class TaxAccount extends Account {
    private Double tax;

    TaxAccount(String _accountNumber, Client _client, double _total, Double tax) {
        super(_accountNumber, _client, _total);
        this.tax = tax;

    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    @Override
    public boolean transfer(double amount, Account account) {
        super.transfer(amount, account);
        withdraw(amount * tax);
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + tax;
    }

}
