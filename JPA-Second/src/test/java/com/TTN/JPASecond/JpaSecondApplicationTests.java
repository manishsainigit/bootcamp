package com.TTN.JPASecond;

import com.TTN.JPASecond.Entity.*;
import com.TTN.JPASecond.Repository.Employee2Repository;
import com.TTN.JPASecond.Repository.EmployeeRepository;
import com.TTN.JPASecond.Repository.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class JpaSecondApplicationTests {
    @Autowired
    EmployeeRepository employeeRepository;
    @Test
    public void demo(){

    }

    @Test
    public void testCreate(){
        Employee employee1=new Employee();
        employee1.setFirstName("Amit");
        employee1.setLastName("Singh");
        employee1.setAge(33);
        employee1.setSalary(15000);

        Employee employee2=new Employee();
        employee2.setId(4);
        employee2.setFirstName("Jay");
        employee2.setLastName("Sharma");
        employee2.setAge(60);
        employee2.setSalary(30000);

        Employee employee3=new Employee();
        employee3.setFirstName("Mayank");
        employee3.setLastName("Singh");
        employee3.setAge(45);
        employee3.setSalary(45000);

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
    }
    //Q1
    @Test
    public void testSomeData(){
        List<Object[]> someData=employeeRepository.getFirstNameAndLastName();
        for (Object[] e:someData) {
            System.out.println(e[0]+" "+e[1]);
        }
    }
    //Q2
    @Test
    public void testUpdateSalaryLessAvg(){
        List<Object[]> objects =employeeRepository.toGetFirstNameSalLessAvg();
        for (Object[] e: objects) {
            employeeRepository.updateSal(String.valueOf(e[0]),5000);
        }
    }

    @Test
    public void testFindMinSal(){
        System.out.println(employeeRepository.minSal());
    }
    //Q3
    @Test
    public void testDeleteMinSal(){
        employeeRepository.deleteMinSal(employeeRepository.minSal());

    }

    //Q4
    @Test
    public void testLastNameSingh(){
        List<Object[]> lastName=employeeRepository.lastNameSingh();
        for (Object[] e: lastName){
            System.out.println(e[0]+" "+e[1]+" "+e[2]);
        }
    }

    //Q5
    @Test
    void testDeleteEmployee(){
        employeeRepository.deleteEmpByAge(30);
    }


    //Single_Table inheritance
    //TABLE_PER_CLASS
    //JOINED_TABLE
    @Autowired
    PaymentRepository paymentRepository;
    @Test
    void testCardPayment(){
        CardPayment cardPayment=new CardPayment();
        cardPayment.setCardnumber("123456");
        cardPayment.setId(123);
        cardPayment.setAmount(100000d);
        paymentRepository.save(cardPayment);

    }
    @Test
    public void testCheckPayment(){
        CheckPayment checkPayment=new CheckPayment();
        checkPayment.setChecknumber("654321");
        checkPayment.setId(321);
        checkPayment.setAmount(12000d);
        paymentRepository.save(checkPayment);
    }

    //Embedded mapping
    @Autowired
    Employee2Repository employee2Repository;
    @Test
    public void testAddressMapping(){
        Employee2 employee2=new Employee2();
        employee2.setId(100);
        employee2.setFirstName("Mukul");
        employee2.setLastName("Singh");
        employee2.setAge(32);
        Employee2Salary employee2Salary=new Employee2Salary();
        employee2Salary.setBasicSalary(45000d);
        employee2Salary.setBonusSalary(5000d);
        employee2Salary.setSpecialAllowanceSalary(10000d);
        employee2Salary.setTaxAmount(8000d);
        employee2.setEmployee2Salary(employee2Salary);
        employee2Repository.save(employee2);

    }

}
