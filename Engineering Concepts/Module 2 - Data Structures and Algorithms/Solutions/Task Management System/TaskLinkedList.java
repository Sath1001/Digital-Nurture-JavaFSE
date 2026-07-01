public class TaskLinkedList {

    private Task head;

    public void addTask(Task task) {

        if (head == null) {
            head = task;
            return;
        }

        Task temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = task;

    }

    public void searchTask(int taskId) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == taskId) {
                System.out.println(temp);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found");

    }

    public void displayTasks() {

        Task temp = head;

        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }

    }

    public void deleteTask(int taskId) {

        if (head == null)
            return;

        if (head.taskId == taskId) {
            head = head.next;
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != taskId) {
            temp = temp.next;
        }

        if (temp.next != null)
            temp.next = temp.next.next;

    }

}