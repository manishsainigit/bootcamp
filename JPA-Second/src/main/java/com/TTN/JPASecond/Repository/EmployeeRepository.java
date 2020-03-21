package com.TTN.JPASecond.Repository;

import com.TTN.JPASecond.Entity.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    @Query("select firstName,lastName from Employee as emp where salary < (select avg(salary) from Employee ORDER BY age ASC, salary DESC)")
    List<Object[]> getFirstNameAndLastName();


    @Query("select firstName from Employee where salary<(select avg(salary) from Employee )")
    List<Object[]> toGetFirstNameSalLessAvg();

    @Transactional
    @Modifying
    @Query("update Employee emp set emp.salary=:sal where emp.firstName=:name")
    void updateSal(@Param("name") String name,@Param("sal") int sal);

    @Query("select min(salary) from Employee")
    int minSal();
    @Modifying
    @Transactional
    @Query("delete from Employee where  salary=:minSal")
    void deleteMinSal(@Param("minSal") int minSal);

    @Query(value = "select emp_id,emp_first_name,emp_age from employee_table where emp_last_name like '%Singh%'",nativeQuery = true)
    List<Object[]> lastNameSingh();

    @Modifying
    @Transactional
    @Query(value = "delete from employee_table where emp_age>:age",nativeQuery = true)
    void deleteEmpByAge(@Param("age")int age);


}
