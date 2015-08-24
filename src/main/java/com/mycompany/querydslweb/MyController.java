/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.querydslweb;

import com.mycompany.querydslweb.entities.Customer;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author dick
 */
@Named(value = "myController")
@Dependent
public class MyController {

    @Inject
    Dao dao;

    @Inject
    DaoQueryDql daoQueryDsl;

    String naam = "Dick";

    List<Customer> customers;
    List<Customer> customersQueryDsl;

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public MyController() {
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public List<Customer> getCustomers() {
        return dao.getCustomers();
    }

    public List<Customer> getCustomersQueryDsl() {
        return daoQueryDsl.getCustomers();
    }

}
