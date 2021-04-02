package lesson10;

public class FulltimeEmployee extends Employee {
    public static final long MEAL_ALLOWANCE = 2000000;
    protected int totalWorkingDays;
    protected long dailySalary;


    public FulltimeEmployee(String name, int age, String id, int totalWorkingDays, long dailySalary) {
        super(name, age, id);
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public long getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(long dailySalary) {
        this.dailySalary = dailySalary;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return dailySalary;
    }

    @Override
    public long getWorkingCount() {
        return totalWorkingDays;
    }

    @Override
    public long calculateSalary() {
        return getWorkingCount() * getSalaryRate() + getMealAllowance() ;
    }


    @Override
    public String toString() {
        return "FulltimeEmployee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                "totalWorkingDays=" + totalWorkingDays +
                ", dailySalary=" + dailySalary +
                ", salary =" + calculateSalary() +
                '}';
    }
}
