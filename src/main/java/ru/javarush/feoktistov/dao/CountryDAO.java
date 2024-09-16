package ru.javarush.feoktistov.dao;

import org.hibernate.SessionFactory;
import ru.javarush.feoktistov.domain.Country;

public class CountryDAO extends GenericDAO<Country>{

    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}
