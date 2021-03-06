/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.querydslweb;

import com.mycompany.querydslweb.entities.Customer;
import com.mycompany.querydslweb.entities.QCustomer;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dick
 */
@Stateless
public class DaoQueryDql {
    
      @PersistenceContext
    EntityManager em;
    
    
    public List<Customer> getCustomers() {
        QCustomer customr = QCustomer.customer;
        
        JPAQueryFactory  factory =  new JPAQueryFactory(em);
        return factory.selectFrom(customr).fetch();
     
    }
}
