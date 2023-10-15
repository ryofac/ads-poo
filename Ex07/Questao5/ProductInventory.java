package Ex07.Questao5;

import java.util.ArrayList;
import java.util.List;

public class ProductInventory {
    private List<Product> productsList = new ArrayList<Product>();

    public boolean store(Product product) {
        Integer equalIndex = findById(product.getProductId());

        if (equalIndex != -1) {
            return false;
        }

        if ((product instanceof PerishableProduct) && (!((PerishableProduct) product).isValid())) {
            return false;
        }

        productsList.add(product);
        return true;
    }

    public boolean addExistingProduct(String productId, Integer amount) {
        Integer productIndex = findById(productId);
        if (productIndex == -1)
            return false;
        Product product = productsList.get(productIndex);
        product.repose(amount);
        return true;

    }

    public boolean removeExistingProduct(String productId, Integer amount) {
        Integer productIndex = findById(productId);
        if (productIndex == -1)
            return false;
        Product product = productsList.get(productIndex);
        product.retire(amount);
        return true;

    }

    public boolean remove(Product product) {
        Integer toBeRemovedIndex = findById(product.getProductId());
        if (toBeRemovedIndex == -1) {
            return false;
        }
        for (Integer i = toBeRemovedIndex; i < productsList.size(); i++) {
            productsList.set(i, productsList.get(i + 1));
        }
        productsList.remove(productsList.size());
        return true;

    }

    public Integer findById(String id) {
        int index = 0;
        for (Product product : productsList) {
            index++;
            if (product.getProductId() == id) {
                return index;
            }
        }
        return -1;

    }

    public void listAllExpired() {
        for (Product product : productsList) {
            if (product instanceof PerishableProduct && !((PerishableProduct) product).isValid()) {
                System.out.println(((PerishableProduct) product).toString());
            }
        }

    }

}
