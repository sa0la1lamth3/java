package lesson9;

public class FulltimeEmployee extends Employee {
    public static final long MEAL_ALLOWANCE = 2000000;
    protected int totalWorkingDays;
    protected long dailySalary;


    public FulltimeEmployee(String name, int age, String identificationNunber, int totalWorkingDays, long dailySalary) {
        super(name, age, identificationNunber);
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
                ", identificationNunber='" + identificationNunber + '\'' +
                "totalWorkingDays=" + totalWorkingDays +
                ", dailySalary=" + dailySalary +
                ", salary =" + calculateSalary() +
                '}';
    }
}
