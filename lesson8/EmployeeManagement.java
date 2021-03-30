package lesson8;

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
            boolean isFullTime = random.nextBoolean();
            String name = "Employee_" + i;
            int age = 18 + random.nextInt(50);

            if (isFullTime) {
                long baseSalyry = random.nextLong();
                boolean level = random.nextBoolean();
                int overTimeDay = random.nextInt(30);
                Employee fulltimeEmployee = new FullTimeEmployee("Nhân viên_" + i, 23, true,
                        20000000, true, 4);
                employees[i] = fulltimeEmployee;
            } else {
                int workHourNumber = random.nextInt();
                Employee overtimeEmployee = new OverTimeEmployee("Nhân viên_" + i, 34, false, 8);
                employees[i] = overtimeEmployee;
            }

        }

    }

    public void allEmployee(){
        for (Employee employee:employees){
            System.out.println(employee.toString());
        }
    }


}
