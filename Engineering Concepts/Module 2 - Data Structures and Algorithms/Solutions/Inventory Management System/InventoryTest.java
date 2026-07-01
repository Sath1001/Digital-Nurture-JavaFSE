public class InventoryTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 65000));
        inventory.addProduct(new Product(102, "Keyboard", 20, 1200));

        System.out.println("Initial Inventory");
        inventory.displayProducts();

        inventory.updateProduct(102, 25);

        System.out.println("\nAfter Updating Quantity");
        inventory.displayProducts();

        inventory.deleteProduct(101);

        System.out.println("\nAfter Deleting Product");
        inventory.displayProducts();

    }

}