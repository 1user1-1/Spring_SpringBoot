package com.magidovtimofey.spring.springboot.spring_springboot.controller;



import com.magidovtimofey.spring.springboot.spring_springboot.entity.Employee;
import com.magidovtimofey.spring.springboot.spring_springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

//    @GetMapping("/employees/{id}")
//    public Employee getEmployee(@PathVariable int id){
//        Employee employee = employeeService.getEmployee(id);
//
//
//
//        return employee;
//
//    }
//
//    @PostMapping("/employees")
//    public Employee addNewEmployee(@RequestBody Employee employee){
//
//        employeeService.saveEmployee(employee);
//
//        return employee;
//    }
//
//    @PutMapping("/employees")
//    public Employee updateEmployees(@RequestBody Employee employee){
//
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmployee(@PathVariable int id){
//        Employee employee = employeeService.getEmployee(id);
//        employeeService.deleteEmployee(id);
//
//        return "Employee with id = "+ id + " was deleted";
//    }

}
