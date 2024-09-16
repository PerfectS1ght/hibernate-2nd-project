package ru.javarush.feoktistov.dao;

import org.hibernate.SessionFactory;
import ru.javarush.feoktistov.domain.Payment;

public class PaymentDAO extends GenericDAO<Payment>{

    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
