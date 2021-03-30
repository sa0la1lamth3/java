package lesson7.lesson72;

public class Student {
    private String name;
    private float gpa;

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public boolean checkgpa() {
        if (gpa >= 1.5) {
            return true;
        } else {
            return false;
        }
    }

    public void inNameGPA() {
        System.out.println("Họ và tên: " + name);
        System.out.println("Điểm trung bình: " + gpa);
    }
}
