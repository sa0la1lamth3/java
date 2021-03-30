package lesson8;

public class OverTimeEmployee extends Employee {
    protected int workHourNumber;

    public OverTimeEmployee(String name, int age, boolean isFullTime, int workHourNumber) {
        super(name, age, isFullTime);
        this.workHourNumber = workHourNumber;
    }

    public int getWorkHourNumber() {
        return workHourNumber;
    }

    public void setWorkHourNumber(int workHourNumber) {
        this.workHourNumber = workHourNumber;
    }

    @java.lang.Override
    public long salary() {
        long salary = workHourNumber * 100000;
        return salary;
    }

    @java.lang.Override
    public String toString() {
        return "OverTimeEmployee{" +
                "workHourNumber=" + workHourNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
