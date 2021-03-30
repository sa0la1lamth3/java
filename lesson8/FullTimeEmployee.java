package lesson8;

public class FullTimeEmployee extends Employee {
    protected long basicSalary;
    protected boolean level;
    protected int overTimeDay;

    public FullTimeEmployee(String name, int age, boolean isFullTime, long basicSalary, boolean level, int overTimeDay) {
        super(name, age, isFullTime);
        this.basicSalary = basicSalary;
        this.level = level;
        this.overTimeDay = overTimeDay;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public boolean isLevel() {
        return level;
    }

    public void setLevel(boolean level) {
        this.level = level;
    }

    public int getOverTimeDay() {
        return overTimeDay;
    }

    public void setOverTimeDay(int overTimeDay) {
        this.overTimeDay = overTimeDay;
    }

    @java.lang.Override
    public long salary() {
        long salary = 0;
        if (level){
            salary = 20000000;
        } else {
            salary = 10000000;
        }
        salary = salary + overTimeDay * 800000;
        return salary;
    }

    @java.lang.Override
    public String toString() {
        return "FullTimeEmployee{" +
                "basicSalary=" + basicSalary +
                ", level=" + level +
                ", overTimeDay=" + overTimeDay +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
