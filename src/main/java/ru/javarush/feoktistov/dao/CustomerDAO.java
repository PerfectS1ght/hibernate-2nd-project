package ru.javarush.feoktistov.dao;

import org.hibernate.SessionFactory;
import ru.javarush.feoktistov.domain.Customer;

public class CustomerDAO extends GenericDAO<Customer>{

    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
