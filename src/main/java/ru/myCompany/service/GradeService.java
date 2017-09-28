package ru.myCompany.service;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import ru.myCompany.entity.Grade;
import ru.myCompany.entity.Person;
import ru.myCompany.util.SessionUtil;

import java.sql.SQLException;

@Service
public class GradeService extends SessionUtil {

    public Grade getGradeById(Integer id, String namedQuerry) throws SQLException {
//        SessionUtil sessionUtil = new SessionUtil();
        /*sessionUtil.*/openTransactionSession();
        Session session = /*sessionUtil.*/getSession();

        Query query = session.createNamedQuery(namedQuerry);
        query.setParameter("id",(int) id);
        Grade obj = (Grade) query.getSingleResult();

        /*sessionUtil.*/closeTransactionSession();
        return obj;
    }


}
