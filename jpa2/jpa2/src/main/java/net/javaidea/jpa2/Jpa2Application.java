package net.javaidea.jpa2;

import net.javaidea.jpa2.model.Employee;
import net.javaidea.jpa2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jpa2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Jpa2Application.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public  void  run(String...args)throws  Exception{
		Employee employee=new Employee();
		employee.setFirstName("naramala");
		employee.setLastName("venkatesh");
		employee.setEmailId("venkatesh@gmail.com");
		employeeRepository.save(employee);


		Employee employee1=new Employee();
		employee1.setFirstName("naramala");
		employee1.setLastName("jagadesh");
		employee1.setEmailId("jagsesh@gmail.com");
		employeeRepository.save(employee1);
	}

}
