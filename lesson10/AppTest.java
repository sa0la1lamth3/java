package lesson10;


import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên : ");
        int n = scanner.nextInt();

        EmployeeManagement employeeManagement = new EmployeeManagement(n);
        // in ra toàn bộ nhân viên;
        employeeManagement.printAll();


       // in ra nhân viên có tuổi cao nhất;
        System.out.println("Nhân viên có tuổi cao nhất" + employeeManagement.getMaxAge());

        // in ra nhân viên có tuổi thấp nhất;
        System.out.println("Nhân viên có tuổi thấp nhất" + employeeManagement.getMinAge());


        // tìm nhân viên theo ID ;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập ID của nhân viên cần tìm");
        String id = scanner1.nextLine();
        Employee employee = employeeManagement.getById(id);
        System.out.println(employee.toString());

    }
}
