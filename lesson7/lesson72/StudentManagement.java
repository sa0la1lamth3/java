package lesson7.lesson72;

import java.util.Scanner;

public class StudentManagement {
    private int totalStudent;
    private Student[] students;

    public StudentManagement(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tổng số sinh viên: ");
        this.totalStudent= scanner.nextInt();
        students = new Student[totalStudent];
        for (int i = 0; i < students.length; i++) {
            System.out.print("Họ và Tên: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Điểm trung bình: ");
            float gpa = scanner.nextFloat();
            students[i] = new Student(name, gpa);
        }
    }

    public int checkPassedStudents(){
        int count = 0;
        for (Student student:students) {
            if (student.checkgpa()){
                count++;
            }
        }
        return count;
    }

    public int checkFailedStudents(){
        int count = 0;
        for (Student student:students) {
            if (!student.checkgpa()){
                count++;
            }
        }
        return count;
    }

    public Student checkGpaMaxMin(boolean isMax) {
        Student result = students[0];
        if(isMax) {
            for (int i = 0; i < students.length ; i++) {
                if(students[i].getGpa() >= result.getGpa()){
                    result = students[i];
                }
            }
        }else {
            for (int i = 0; i < students.length ; i++) {
                if(students[i].getGpa() <= result.getGpa()){
                    result = students[i];
                }
            }
        }
        return  result;
    }
}
