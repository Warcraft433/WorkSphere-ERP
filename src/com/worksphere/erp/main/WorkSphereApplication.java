package com.worksphere.erp.main;

import com.worksphere.erp.model.Employee;
import com.worksphere.erp.service.EmployeeService;

public class WorkSphereApplication {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("        WorkSphere ERP v1.0");
        System.out.println("======================================");

        EmployeeService employeeService = new EmployeeService();

        employeeService.addEmployee();
        employeeService.viewEmployee();
        employeeService.updateEmployee();
        employeeService.deleteEmployee();
        employeeService.searchEmployee();

    }
}
