import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(int productId, int quantity) {
        Product product = inventory.get(productId);

        if (product != null) {
            product.setQuantity(quantity);
        }
    }

    public void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    public void displayProducts() {

        for (Product product : inventory.values()) {
            System.out.println(product);
        }

    }

}