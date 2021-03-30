package lesson8;

public abstract class Employee {
    protected String name;
    protected int age;
    protected boolean isFullTime;

    public Employee(String name, int age, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.isFullTime = isFullTime;
    }

    public long salary (){
        return 0;
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

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }


    @java.lang.Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
