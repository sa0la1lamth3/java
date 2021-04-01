package lesson9;

import java.util.Scanner;

public class Apptest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên : ");
        int n = scanner.nextInt();
        EmployeeManagement employeeManagement = new EmployeeManagement(n);
        // in ra toàn bộ nhân viên;
        employeeManagement.printAll();


        //in ra nhân viên có mước lương cao nhất;
        System.out.println("Nhân viên có mức lương cao nhất : " +employeeManagement.getMaxSalaryEmployee().toString());

        // in ra nhân viên có mức lương thấp nhất;
        System.out.println("Nhân viên có mức lương thấp nhất: " + employeeManagement.getMinSalaryEmployee().toString());

    }
}

