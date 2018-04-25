package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

@RepositoryRestResource(excerptProjection = NameProjection.class)
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<NameProjection>  findByNameContains(String name);
}
