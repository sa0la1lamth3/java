package lesson8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EmployeeManagement {
    protected Employee[] employees;

    public EmployeeManagement(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public EmployeeManagement() {
        Employee[] employees = new Employee[10];
        Random random = new Random();
        for (int i = 0; i < employees.length; i++) {
            String name = "Employee_" + i;
            int age = 18 + random.nextInt(50);
            boolean isFullTime = random.nextBoolean();


            if (isFullTime) {
                float baseSalary = random.nextFloat();
                boolean level = random.nextBoolean();//Sep or linh
                int overTimeDay = random.nextInt(30);
                Employee fulltimeEmployee = new FullTimeEmployee(name,age,isFullTime,baseSalary,level,overTimeDay);
                employees[i] = fulltimeEmployee;
            } else {
                int workHourNumber = random.nextInt();
                Employee overtimeEmployee = new OverTimeEmployee(name,age,isFullTime,workHourNumber);
                employees[i] = overtimeEmployee;
            }

        }
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

}
