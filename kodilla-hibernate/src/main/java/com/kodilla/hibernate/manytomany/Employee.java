package com.kodilla.hibernate.manytomany;


import com.sun.istack.NotNull;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NamedQueries({
        @NamedQuery(
                name = "Employee.retrieveLastName",
                query = "FROM Employee WHERE lastname= :LASTNAME"
        ),
        @NamedQuery(
                name = "Employee.retrieveLastName2",
                query = "FROM Employee WHERE lastname LIKE :LASTNAME"
        )

})

@Entity
@Table(name = "EMPLOYEES")
@Component
public class Employee {

    private int id;
    private String firstname;
    private String lastname;
    private List<Company> companies = new ArrayList<>();

    public Employee() {
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "EMPLOYEE_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    @NotNull
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "COMPANY_EMPLOYEE",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")}
    )
    public List<Company> getCompanies() {
        return companies;
    }

    private void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}