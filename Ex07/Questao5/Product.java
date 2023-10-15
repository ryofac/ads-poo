package Ex07.Questao5;

import java.util.UUID;

import Ex07.Questao3.Utils;

public class Product {
    private String productId;
    private String description;
    private Integer quantity;
    private Double value;

    public Product(String description, Integer quantity, Double value) {
        this.description = description;
        this.quantity = quantity;
        this.value = value;
    }

    public boolean repose(Integer amount) {
        setQuantity(getQuantity() + amount);
        return true;
    }

    public boolean retire(Integer amount) {
        Integer operation = getQuantity() - amount;
        if (operation < 0) {
            return false;
        }
        setQuantity(operation);
        return true;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s:%s:%s", getProductId(), getDescription(), getValue());
    }

}
