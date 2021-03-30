package lesson7.lesson72;

import lesson7.lesson72.StudentManagement;

public class TestStudent {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        System.out.println("Số học sinh đỗ: " + studentManagement.checkPassedStudents());
        System.out.println("Số học sinh trượt: " + studentManagement.checkFailedStudents());
        System.out.print("Học sinh đạt điểm cao nhất: " + studentManagement.checkGpaMaxMin(true).getName());
        System.out.println(" Điểm trung bình: "+ studentManagement.checkGpaMaxMin(true).getGpa());
        System.out.print("Học sinh có điểm thấp nhất: " + studentManagement.checkGpaMaxMin(false).getName());
        System.out.println(" Điểm trung bình: "+ studentManagement.checkGpaMaxMin(false).getGpa());
    }

}
