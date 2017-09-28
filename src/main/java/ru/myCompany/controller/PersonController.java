package ru.myCompany.controller;

//import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.myCompany.entity.Person;
import ru.myCompany.service.PersonService;

import java.sql.SQLException;

//@Controller
@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Person getPersonById(@PathVariable Integer id) throws SQLException {
        return personService.getPersonById(id, "getPersonById");
    }

}
