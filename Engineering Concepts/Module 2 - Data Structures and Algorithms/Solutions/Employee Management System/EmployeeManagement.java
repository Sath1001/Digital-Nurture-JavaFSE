import java.util.HashMap;

public class EmployeeManagement {

    private HashMap<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee) {
        employees.put(employee.getEmployeeId(), employee);
    }

    public Employee searchEmployee(int id) {
        return employees.get(id);
    }

    public void deleteEmployee(int id) {
        employees.remove(id);
    }

    public void displayEmployees() {
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }
}