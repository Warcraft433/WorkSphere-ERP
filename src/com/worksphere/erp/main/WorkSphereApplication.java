package com.worksphere.erp.main;

import com.worksphere.erp.model.Employee;
import com.worksphere.erp.service.EmployeeService;

import java.util.Scanner;

public class WorkSphereApplication {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("        WorkSphere ERP v1.0");
        System.out.println("======================================");

        EmployeeService employeeService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.println("===============================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();

                    Employee employee = new Employee(
                            id,
                            name,
                            email,
                            department,
                            salary
                    );

                    employeeService.addEmployee(employee);
                    break;

                case 2:
                    employeeService.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int searchId = scanner.nextInt();

                    employeeService.searchEmployee(searchId);
                    break;

                case 4:
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter New Email: ");
                    String newEmail = scanner.nextLine();

                    System.out.print("Enter New Department: ");
                    String newDepartment = scanner.nextLine();

                    System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();

                    employeeService.updateEmployee(
                            updateId,
                            newName,
                            newEmail,
                            newDepartment,
                            newSalary
                    );
                    break;

                case 5:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();

                    employeeService.deleteEmployee(deleteId);
                    break;

                case 6:
                    System.out.println("Exiting WorkSphere ERP...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}