package com.ivoronline.springboot_query_native_optionalfilters_coalesce.controllers;

import com.ivoronline.springboot_query_native_optionalfilters_coalesce.entities.Person;
import com.ivoronline.springboot_query_native_optionalfilters_coalesce.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired PersonRepository personRepository;

  //================================================================
  // GET PERSONS
  //================================================================
  @RequestMapping("GetPersons")
  List<Person> getPersons() {
    List<Person> persons = personRepository.getPersons(null);
    return persons;
  }

}