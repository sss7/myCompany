package ru.myCompany.dao;

import ru.myCompany.entity.Person;

public interface IPersonDAO {
    Person getPersonById(int id);
}
