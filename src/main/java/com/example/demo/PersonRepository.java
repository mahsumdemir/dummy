package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<NameProjection>  findByNameContains(@Param("name") String name);
}
