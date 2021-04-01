package lesson8;

public class OverTimeEmployee extends Employee {
    protected int workHourNumber;

    public OverTimeEmployee(String name, int age, boolean isFullTime, int workHourNumber) {
        super(name, age, isFullTime);
        this.workHourNumber = workHourNumber;
    }

    public OverTimeEmployee() {
    }

    public int getWorkHourNumber() {
        return workHourNumber;
    }

    public void setWorkHourNumber(int workHourNumber) {
        this.workHourNumber = workHourNumber;
    }

    public float basicSalary() {
        float basicSalary =0;
        basicSalary = workHourNumber * 0.1f;
        return basicSalary;
    }

    @Override
    public String toString() {
        return "OverTimeEmployee{" +
                "workHourNumber=" + workHourNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
