package Ex07.Questao5;

import java.time.LocalDate;

public class PerishableProduct extends Product {

    private LocalDate expirationDate;

    public PerishableProduct(LocalDate expirationDate, String description, Integer quantity, Double value) {
        super(description, quantity, value);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public boolean isValid() {
        return expirationDate.isAfter(LocalDate.now());
    }

    @Override
    public boolean repose(Integer amount) {
        if (this.isValid()) {
            return false;
        }
        return super.repose(amount);
    }

    @Override
    public boolean retire(Integer amount) {
        if (this.isValid()) {
            return false;
        }
        return super.retire(amount);
    }

    @Override
    public String toString() {
        return super.toString() + ":" + getExpirationDate();
    }

}
