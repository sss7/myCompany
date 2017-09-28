package ru.myCompany.service;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import ru.myCompany.entity.Person;
import ru.myCompany.util.SessionUtil;

import java.sql.SQLException;

@Service
public class PersonService {

    public Person getPersonById(Integer id, String namedQuerry) throws SQLException {
        SessionUtil sessionUtil = new SessionUtil();
        sessionUtil.openTransactionSession();
        Session session = sessionUtil.getSession();

        Query query = session.createNamedQuery(namedQuerry);
        query.setParameter("id",(int) id);
        Person obj = (Person) query.getSingleResult();

        sessionUtil.closeTransactionSession();
        return obj;
    }


}
