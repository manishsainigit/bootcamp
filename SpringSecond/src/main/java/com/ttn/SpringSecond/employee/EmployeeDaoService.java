package com.ttn.SpringSecond.employee;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeDaoService {
    private int employeeId=3;
    private static List<Employee> employees=new ArrayList<>();
    static{
        employees.add(new Employee(1,"Jay",22));
        employees.add(new Employee(2,"Sam",23));
        employees.add(new Employee(3,"Rock",24));
    }

    public List<Employee> findAll(){
        return employees;
    }

    public Employee save(Employee employee){
        if(employee.getId()==null){
            employee.setId(++employeeId);
        }
        employees.add(employee);
        return employee;
    }

    public Employee findOne(int id){
        for(Employee employee:employees){
            if(employee.getId()==id){
                return employee;
            }
        }
        return null;
    }

    public Employee deleteById(int id){
        Iterator iterator=employees.iterator();
        while(iterator.hasNext()){
            Employee employee=(Employee) iterator.next();
            if(employee.getId()==id){
                iterator.remove();
                return employee;
            }
        }
        return null;
    }
    public void updateEmployee(int id,Employee employee){
        Employee temp=findOne(id);
        temp.setAge(employee.getAge());
        temp.setName(employee.getName());
    }

}
