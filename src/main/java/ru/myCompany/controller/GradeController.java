package ru.myCompany.controller;

//import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.myCompany.entity.Grade;
import ru.myCompany.service.GradeService;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import java.sql.SQLException;

//@Controller
@RestController
@RequestMapping("/grade")
public class GradeController {

    private GradeService gradeService;

    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Grade getGradeById(@PathVariable Integer id) throws SQLException, NoResultException /*PersistenceException*/ {
        return gradeService.getGradeById(id, "getGradeById");
    }

}
