package com.ivoronline.springboot_query_native_optionalfilters_coalesce.runners;

import com.ivoronline.springboot_query_native_optionalfilters_coalesce.entities.Person;
import com.ivoronline.springboot_query_native_optionalfilters_coalesce.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LoadPersons implements CommandLineRunner {

  //PROPERTIES
  @Autowired PersonRepository personRepository;

  //================================================================
  // RUN
  //================================================================
  @Override
  @Transactional
  public void run(String... args) throws Exception {
    personRepository.save(new Person("John" , 20));
    personRepository.save(new Person("Bill" , 30));
  }

}
