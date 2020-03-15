package com.ttn.SpringSecond.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EmployeeResource {
    @Autowired
    private EmployeeDaoService service;

    @GetMapping("/employee")
    public List<Employee> retrieveAllEmployee(){
        return service.findAll();
    }
    @GetMapping("/employee/{id}")
    public EntityModel<Employee> retrieveEmployee(@PathVariable int id){
        Employee employee= service.findOne(id);
        if(employee==null){
            throw new EmployeeNotFoundException("id: "+id);
        }
        EntityModel<Employee> model=new EntityModel<>(employee);
        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllEmployee());
        model.add(linkTo.withRel("all-users"));


        return model;

    }
    @PostMapping("/employee")
    public ResponseEntity<Object> createEmployee(@Valid @RequestBody Employee employee){
        Employee savedEmployee=service.save(employee);
        URI location= ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(savedEmployee.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable int id){
        Employee employee= service.deleteById(id);
        if(employee==null){
            throw new EmployeeNotFoundException("id: "+id);
        }
    }
    @PutMapping("/employee/{id}")
    public void updateEmployee(@PathVariable int id,@RequestBody Employee employee)
    {

        service.updateEmployee(id,employee);
    }

}
