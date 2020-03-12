package com.TTN.JPAFirst;

import com.TTN.JPAFirst.Entity.Employee;
import com.TTN.JPAFirst.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
class JpaFirstApplicationTests {
	@Autowired
	EmployeeRepository repository;
	@Test
	void contextLoads() {
	}
	@Test
	public void testCreate(){
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Manish");
		employee.setAge(20);
		employee.setLocation("Meerut");
		Employee employee2=new Employee();
		employee2.setId(2);
		employee2.setName("Jack");
		employee2.setAge(30);
		employee2.setLocation("Delhi");
		repository.save(employee);
		repository.save(employee2);
	}
	@Test
	public void testUpdate(){
		Employee employee=repository.findById(1).get();
		employee.setName("xyz");
		repository.save(employee);
	}
	@Test
	public void testDelete(){
		if(repository.existsById(2)) {
			repository.deleteById(2);
		}
	}
	@Test
	public void testRead(){
		Employee employee=repository.findById(1).get();
		assertNotNull(employee);
		System.out.println("------------------->"+employee.getName());

	}
	@Test
	public void testCount(){
		System.out.println(repository.count());
	}

	@Test
	public void testFindByName(){
		System.out.println(repository.findByName("Jack"));
	}
	@Test
	public void testFindByNameLike(){
		List<Employee> employee=repository.findByNameLike("%a%");
		employee.forEach(name -> System.out.println(name.getName()));
	}
	@Test
	public void testFindByAgeBetween(){
		List<Employee> employee=repository.findByAgeBetween(20,25);
		employee.forEach(age -> System.out.println(age.getName()));
	}

	@Test
	public void testFindAllPagingAndSorting(){
		Pageable pageable=PageRequest.of(0,2, Sort.by(Sort.Direction.DESC,"age"));
		Page<Employee> page=repository.findAll(pageable);
		page.forEach(p-> System.out.println(p.getAge()));
	}

}
