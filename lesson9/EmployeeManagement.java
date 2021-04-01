package lesson9;

import lesson8.FullTimeEmployee;

import java.util.Arrays;
import java.util.Random;

public class EmployeeManagement {
    private int n;
    private Employee[] employees;


    public EmployeeManagement(int n){
        this.n= n;
        employees = new Employee[n];
        Random random = new Random();

        for (int i = 0 ; i< n ; i++){
            String name = "Employee_" + i;
            int age = 18 + random.nextInt(50);
            String identificationNunber = "0312" + i;
            boolean a = random.nextBoolean();
            if (a){
                int totalWorkingDays = random.nextInt(30);
                long dailySalary = random.nextInt(4000000);
                FulltimeEmployee fulltimeEmployee = new FulltimeEmployee(name,age,identificationNunber,totalWorkingDays,dailySalary);
                employees[i] = fulltimeEmployee;
            } else {
                int totalWorkingShift = random.nextInt(30);
                long baseSalary = random.nextInt(2000000);
                ParttimeEmployee parttimeEmployee = new ParttimeEmployee(name,age,identificationNunber,totalWorkingShift,baseSalary);
                employees[i] = parttimeEmployee;

            }
        }

    }

    public Employee getMaxSalaryEmployee(){
        Employee result = employees[0];
        for (int i=0 ; i < employees.length; i++ ){
           if (employees[i].calculateSalary() >= result.calculateSalary()){
               result = employees[i];
           }
        }
        return result;
    }

    public Employee getMinSalaryEmployee(){
        Employee result = employees[0];
        for (int i=0 ; i < employees.length; i++ ){
            if (employees[i].calculateSalary() <= result.calculateSalary()){
                result = employees[i];
            }
        }
        return result;
    }

    public void printAll(){
        for (Employee employee: employees){
            System.out.println(employee.toString());
        }
    }

}
