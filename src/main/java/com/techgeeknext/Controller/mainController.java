package com.techgeeknext.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techgeeknext.entities.company.Company;
import com.techgeeknext.entities.employee.Employee;
import com.techgeeknext.repository.company.CompanyRepository;
import com.techgeeknext.repository.employee.EmployeeRepository;

@RestController
public class mainController {


    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    CompanyRepository companyRepository;

    @GetMapping("/getemployees")
    public Iterable<Employee> getallemployee()
    {
        return employeeRepository.findAll();
    }

    @GetMapping("/getcompanies")
    public Iterable<Company> getallcompany()
    {
        return companyRepository.findAll();
    }

    @PostMapping("/saveemployees")
    public Employee saveemployees(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @PostMapping("/savecompany")
    public Company savecompanies(@RequestBody Company company){
        return companyRepository.save(company);
    }
    
}
