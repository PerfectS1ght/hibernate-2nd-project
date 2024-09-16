package ru.javarush.feoktistov.dao;

import org.hibernate.SessionFactory;
import ru.javarush.feoktistov.domain.Staff;

public class StaffDAO extends GenericDAO<Staff>{
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
