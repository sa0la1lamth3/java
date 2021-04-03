package lesson10;

import java.util.*;

public class EmployeeManagement {
    private int n;
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private HashMap<String, Employee> myMap = new HashMap<String, Employee>();


    public EmployeeManagement(int n) {
        this.n = n;
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            String name = "Employee_" + i;
            int age = 18 + random.nextInt(50);
            String id = "ID" +i;
            boolean a = random.nextBoolean();
            if (a) {
                int totalWorkingDays = random.nextInt(30);
                long dailySalary = random.nextInt(4000000);
                FulltimeEmployee fulltimeEmployee = new FulltimeEmployee(name, age,id, totalWorkingDays, dailySalary);
                employees.add(fulltimeEmployee);
                myMap.put(id, fulltimeEmployee);
            } else {
                int totalWorkingShift = random.nextInt(30);
                long baseSalary = random.nextInt(2000000);
                ParttimeEmployee parttimeEmployee = new ParttimeEmployee(name, age, id, totalWorkingShift, baseSalary);
                employees.add(parttimeEmployee);
                myMap.put(id, parttimeEmployee);

            }
        }

    }

    public Employee getMaxAge() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getAge()> o2.getAge()){
                    return 1;
                } else if(o1.getAge()< o2.getAge()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        return employees.get(employees.size()-1);
    }

    public Employee getMinAge() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getAge()< o2.getAge()){
                    return 1;
                } else if(o1.getAge()> o2.getAge()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        return employees.get(employees.size()-1);
    }

    public Employee getById(String id){

        return myMap.get(id);
    }


    public void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

}
