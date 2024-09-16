package ru.javarush.feoktistov.dao;

import org.hibernate.SessionFactory;
import ru.javarush.feoktistov.domain.Language;

public class LanguageDAO extends GenericDAO<Language>{

    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}
