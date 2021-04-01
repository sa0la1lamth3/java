package lesson8;

public class FullTimeEmployee extends Employee {
    protected float basicSalary;
    protected boolean level;
    protected int overTimeDay;

    public FullTimeEmployee(String name, int age, boolean isFullTime, float basicSalary, boolean level, int overTimeDay) {
        super(name, age, isFullTime);
        this.basicSalary = basicSalary;
        this.level = level;
        this.overTimeDay = overTimeDay;
    }

    public FullTimeEmployee() {
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
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

    public float basicSalary() {
        float salary = 0;
        if (level){
            salary = 20f;
        } else {
            salary = 10f;
        }
        salary = salary + overTimeDay * 0.8f;
        return salary;
    }

    @Override
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
