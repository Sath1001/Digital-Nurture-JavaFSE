public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement();

        management.addEmployee(new Employee(101, "Rahul", "Developer", 65000));
        management.addEmployee(new Employee(102, "Priya", "Tester", 50000));
        management.addEmployee(new Employee(103, "Anil", "Manager", 85000));

        System.out.println("Employees");
        management.displayEmployees();

        System.out.println("\nSearch Employee");
        System.out.println(management.searchEmployee(102));

        management.deleteEmployee(101);

        System.out.println("\nAfter Deletion");
        management.displayEmployees();

    }

}