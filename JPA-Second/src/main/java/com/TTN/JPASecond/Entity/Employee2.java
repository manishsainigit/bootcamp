package com.TTN.JPASecond.Entity;



import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee2 {
    //Implement and demonstrate Embedded mapping using employee table having following fields:
    // id, firstName, lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.
    @Embedded
    Employee2Salary employee2Salary;
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Employee2Salary getEmployee2Salary() {
        return employee2Salary;
    }

    public void setEmployee2Salary(Employee2Salary employee2Salary) {
        this.employee2Salary = employee2Salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
