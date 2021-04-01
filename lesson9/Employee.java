package lesson9;

public abstract class Employee {
    protected String name;
    protected int age;
    protected String identificationNunber;

    public Employee(String name, int age, String identificationNunber) {
        this.name = name;
        this.age = age;
        this.identificationNunber = identificationNunber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentificationNunber() {
        return identificationNunber;
    }

    public void setIdentificationNunber(String identificationNunber) {
        this.identificationNunber = identificationNunber;
    }

    public abstract long getMealAllowance(); //trả số tiền trợ cấp ăn trưa

    /* trả về số tiền lương theo ngày đối với nhân viên fulltime và
   số ca làm việc đối với nhân viên parttime */
    public abstract long getSalaryRate();


    //trả về số ngày làm việc NV fulltime và parttime
    public abstract long getWorkingCount();

    // tính lương nhân viên
    public abstract long calculateSalary();

}
