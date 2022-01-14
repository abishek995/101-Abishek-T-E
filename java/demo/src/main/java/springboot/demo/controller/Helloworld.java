package springboot.demo.controller;





import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.demo.model.Employee;

@RestController
@RequestMapping(path="/hello")
public class Helloworld {
@GetMapping("/first")
public String sayHello()
{
	return"hello world this is abishek";
}
@PostMapping(path="/firststatic")
public ResponseEntity<String> save(String input)
{
	
	 HttpHeaders header = new HttpHeaders();
    header.add("header1", "This is my header 1");
    header.add("header2", "This is my header 2");
    return ResponseEntity.status(HttpStatus.CREATED).headers(header).body("Hello");
	
	
}

@PostMapping(path="/object")
public ResponseEntity<String> save1(String input)
{
	 ResponseEntity<String> res1= new ResponseEntity<>("Hello",HttpStatus.OK);
	 	 
    return res1;
	
	
}

@PostMapping(path="/inline")
public ResponseEntity<String> save11(String input)
{
	 return ResponseEntity.status(HttpStatus.CREATED)
			 .header("H1", "Value 1")
			 .header("H2", "Value 2")
			 .body("Test");
	   	
	
}

@PostMapping(path="/nobody")
public ResponseEntity<Void> save111(String input)
{
	 return ResponseEntity.status(HttpStatus.CREATED)
			 .header("H1", "Value 1")
			 .header("H2", "Value 2")
			 .build();
	  	
	
}
@PostMapping(path="/reqhdr")
public ResponseEntity<String> reqhdr(        
		 @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
        @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
        @RequestBody String str)
{
	 
	 
	 String returnVal="X-COM-PERSIST="+headerPersist+"X-COM-LOCATION="+headerLocation+"body"+str;
	 
	 return ResponseEntity.ok(returnVal);
	  	
	
}
@PostMapping(path="/withResponseHeader")
public ResponseEntity<String> responseHeader(        
		 @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
        @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
        @RequestBody String str)
{
	 
	 
	return ResponseEntity.status(HttpStatus.CREATED)
	 .header("H1", headerPersist)
	 .header("H2", headerLocation)
	.body("return response");
	  	
	
}

@GetMapping("/second/{id}")
public int sayHello1(@PathVariable int id)
{
	
	return id;
	
}
@PostMapping(path="/getEmployee")
public ResponseEntity<Employee> getEmployee(String input)
{
	 
		
	 Employee emp= new Employee("emp1","abishek");
	 
	 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", input)
		 .body(emp);
	   	
	
}
@PostMapping(path="/getEmployeelist")
public ResponseEntity<List<Employee>> getEmployeelist( String input)
{
	 
	 List<Employee> lstemp= new ArrayList<Employee>();
	 Employee emp= new Employee("emp1","yogi");
	 Employee emp1= new Employee("emp2","yash");
	 Employee emp11= new Employee("emp3","Amit");
	 lstemp.add(emp);
	 lstemp.add(emp1);
	 lstemp.add(emp11);
	 
	 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", input)
		 .body(lstemp);
	   	
	
}
@PostMapping(path="/processEmployee")
public ResponseEntity<Void> processEmployee(@RequestBody List<Employee> employeeList)
{
	System.out.println("Came inside processEmpl");
	 for(Employee emp:employeeList)
	 {
		 System.out.println("ID="+emp.getEmpid());
		 System.out.println("Name="+emp.getEmpname());
		
	 }
	
	
	 
	 return ResponseEntity.status(HttpStatus.CREATED).header("X-INPUT", "Test").build();
		 
	   	
	
}
	
}


