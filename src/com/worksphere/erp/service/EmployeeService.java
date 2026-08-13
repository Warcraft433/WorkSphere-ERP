package com.worksphere.erp.service;
import com.worksphere.erp.model.Employee;
public class EmployeeService {

    private Employee[] employees = new Employee[5];
    private int employeeCount = 0;

    public void addEmployee(Employee employee) {

        employees[employeeCount] = employee;
        employeeCount++;

        System.out.println("Employee added successfully.");
    }

    public void viewEmployees() {

        for (int i = 0; i < employeeCount; i++) {

            employees[i].displayEmployee();

            System.out.println("-------------------------");
        }
    }
    public void searchEmployee(int id) {

        for (int i = 0; i < employeeCount; i++) {

            if (employees[i].getId() == id) {

                System.out.println("Employee found!");
                employees[i].displayEmployee();

                return;
            }
        }

        System.out.println("Employee not found.");
    }


    public void updateEmployee(int id, String name, String email,
                               String department, double salary) {

        for (int i = 0; i < employeeCount; i++) {

            if (employees[i].getId() == id) {

                employees[i].setName(name);
                employees[i].setEmail(email);
                employees[i].setDepartment(department);
                employees[i].setSalary(salary);

                System.out.println("Employee updated successfully.");
                employees[i].displayEmployee();

                return;
            }
        }

        System.out.println("Employee not found.");
    }

    public void deleteEmployee(int id) {

        for (int i = 0; i < employeeCount; i++) {

            if (employees[i].getId() == id) {

                for (int j = i; j < employeeCount - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[employeeCount - 1] = null;
                employeeCount--;

                System.out.println("Employee deleted successfully.");

                return;
            }
        }

        System.out.println("Employee not found.");
    }


}