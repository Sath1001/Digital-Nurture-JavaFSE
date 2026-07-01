public class SortingTest {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Rahul", 2500),
                new Order(102, "Priya", 1500),
                new Order(103, "Anil", 4500),
                new Order(104, "Neha", 3000)

        };

        System.out.println("Before Sorting");

        for (Order order : orders)
            System.out.println(order);

        SortingAlgorithms.bubbleSort(orders);

        System.out.println("\nAfter Sorting");

        for (Order order : orders)
            System.out.println(order);

    }

}