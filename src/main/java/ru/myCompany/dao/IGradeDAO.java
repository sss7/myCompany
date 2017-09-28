package ru.myCompany.dao;

import ru.myCompany.entity.Person;

public interface IGradeDAO {
    Person getGradeById(int id);
}
