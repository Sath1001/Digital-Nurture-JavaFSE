import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Keyboard", "Electronics"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Mouse", "Electronics"),
                new Product(104, "Monitor", "Electronics")

        };

        Product linear = SearchAlgorithms.linearSearch(products, "Mouse");

        System.out.println("Linear Search");
        System.out.println(linear);

        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        Product binary = SearchAlgorithms.binarySearch(products, "Mouse");

        System.out.println("\nBinary Search");
        System.out.println(binary);

    }

}