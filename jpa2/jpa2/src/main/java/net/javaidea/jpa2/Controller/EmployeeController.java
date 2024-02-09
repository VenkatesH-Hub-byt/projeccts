package net.javaidea.jpa2.Controller;

import net.javaidea.jpa2.model.Employee;
import net.javaidea.jpa2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
@GetMapping("/api/v1/employees")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();

    }

}
