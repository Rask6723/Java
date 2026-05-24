package Employee_App;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeManager manager = new EmployeeManager();

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    manager.addEmployee(
                            new Employee(id, name, salary));

                    break;

                case 2:

                    manager.viewEmployees();

                    break;

                case 3:

                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();

                    Employee emp =
                            manager.searchEmployee(searchId);

                    if (emp != null)
                        System.out.println(emp);
                    else
                        System.out.println("Employee Not Found");

                    break;

                case 4:

                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Salary: ");
                    double newSalary = sc.nextDouble();

                    if (manager.updateEmployee(updateId,
                            newName,
                            newSalary))
                        System.out.println("Updated Successfully");
                    else
                        System.out.println("Employee Not Found");

                    break;

                case 5:

                    System.out.print("Enter Employee ID: ");
                    int deleteId = sc.nextInt();

                    if (manager.deleteEmployee(deleteId))
                        System.out.println("Deleted Successfully");
                    else
                        System.out.println("Employee Not Found");

                    break;

                case 6:

                    System.out.println("Thank You!");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}