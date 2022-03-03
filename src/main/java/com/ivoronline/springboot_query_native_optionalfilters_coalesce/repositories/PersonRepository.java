package com.ivoronline.springboot_query_native_optionalfilters_coalesce.repositories;

import com.ivoronline.springboot_query_native_optionalfilters_coalesce.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {

  //=======================================================================================
  // GET PERSONS
  //=======================================================================================
  @Query(value = "SELECT * FROM PERSON WHERE NAME = coalesce(:name, NAME)", nativeQuery = true)
  List<Person> getPersons(String name);

}
