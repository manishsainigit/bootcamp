package com.TTN.JPAFirst.Repository;

import com.TTN.JPAFirst.Entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;
import java.util.List;

//public interface EmployeeRepository extends CrudRepository<Employee,Integer>
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer>
{

    List<Employee> findByName(String name);
    List<Employee> findByNameLike(String name);
    List<Employee> findByAgeBetween(int minAge,int maxAge);
}
