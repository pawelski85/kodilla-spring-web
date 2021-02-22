package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Facade {

    public List <Company> companiesFinder(CompanyDao companyDao){
        return companyDao.retrieveCompanyBegingingWithLetters2();
    }

    public List<Employee> employeesFinder(EmployeeDao employeeDao, String letters){
        return employeeDao.retrieveLastName2(letters);
    }
}
