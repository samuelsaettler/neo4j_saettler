package com.sixgroup.neo4j.domainModels.instructor;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InstructorRepository extends CrudRepository<Instructor, Long> {

    Instructor findByName(String name);

    void deleteById(int id);

    boolean existsById(int id);

    List<Object> findById(int id);
}
