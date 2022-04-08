package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Hero;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.repository.query.Param;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RepositoryRestResource
public interface HeroRepository extends CrudRepository<Hero, Long> {
    List<Hero> findAll();
    List<Hero> findByName(@Param("name") String name);
}
