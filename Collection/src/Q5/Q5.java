package Q5;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Manish",40000D,20);
        Employee employee2 = new Employee("Kim",50000D,22);
        Employee employee3 = new Employee("Jay",60000D,21);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.salary.compareTo(o1.salary);
            }
        });
        Iterator iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
class Employee {
    String name;
    Double salary;
    Integer age;

    public Employee(String name, Double salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age=age;
    }
    @Override
    public String toString() {
        return "name=" + name +", age=" + age +", salary=" + salary;
    }


}
