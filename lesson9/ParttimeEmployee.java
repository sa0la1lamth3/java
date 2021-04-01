package lesson9;

public class ParttimeEmployee extends Employee {
    public static final long MEAL_ALLOWANCE = 0;
    protected int totalWorkingShift;
    protected long baseSalary;

    public ParttimeEmployee(String name, int age, String identificationNunber, int totalWorkingShift, long baseSalary) {
        super(name, age, identificationNunber);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    public int getTotalWorkingShift() {
        return totalWorkingShift;
    }

    public void setTotalWorkingShift(int totalWorkingShift) {
        this.totalWorkingShift = totalWorkingShift;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public long getWorkingCount() {
        return totalWorkingShift;
    }

    @Override
    public long calculateSalary() {
        return getWorkingCount() * getSalaryRate() + getMealAllowance();
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", identificationNunber='" + identificationNunber + '\'' +
                "totalWorkingShift=" + totalWorkingShift +
                ", baseSalary=" + baseSalary +
                ", salary =" + calculateSalary() +
                '}';
    }
}
