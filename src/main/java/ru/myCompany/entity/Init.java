package ru.myCompany.entity;

import org.hibernate.Session;
import ru.myCompany.util.SessionUtil;

public class Init {
    public static void main(String[] args) {
        SessionUtil sessionUtil = new SessionUtil();
        sessionUtil.openTransactionSession();
        sessionUtil.closeTransactionSession();
    }
}
