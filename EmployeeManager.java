package Employee_App;
import java.util.ArrayList;

public class EmployeeManager {

    private ArrayList<Employee> employees = new ArrayList<>();

    // Add Employee
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee Added Successfully!");
    }

    // View All Employees
    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No Employees Found!");
            return;
        }

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    // Search Employee
    public Employee searchEmployee(int id) {

        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }

        return null;
    }

    // Delete Employee
    public boolean deleteEmployee(int id) {

        Employee emp = searchEmployee(id);

        if (emp != null) {
            employees.remove(emp);
            return true;
        }

        return false;
    }

    // Update Employee
    public boolean updateEmployee(int id,
                                  String name,
                                  double salary) {

        Employee emp = searchEmployee(id);

        if (emp != null) {
            emp.setName(name);
            emp.setSalary(salary);
            return true;
        }

        return false;
    }
}