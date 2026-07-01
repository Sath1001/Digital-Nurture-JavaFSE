public class TaskTest {

    public static void main(String[] args) {

        TaskLinkedList list = new TaskLinkedList();

        list.addTask(new Task(1, "Design UI", "Pending"));
        list.addTask(new Task(2, "Develop Backend", "In Progress"));
        list.addTask(new Task(3, "Testing", "Pending"));

        System.out.println("Tasks");

        list.displayTasks();

        System.out.println("\nSearch");

        list.searchTask(2);

        list.deleteTask(1);

        System.out.println("\nAfter Deletion");

        list.displayTasks();

    }

}