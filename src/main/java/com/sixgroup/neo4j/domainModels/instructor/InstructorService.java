package com.sixgroup.neo4j.domainModels.instructor;

import java.util.List;

public interface InstructorService {

    Instructor create(Instructor instructor);

    List<Instructor> findAll();

    Instructor findById(int id);

    Instructor updateById(int id, Instructor instructor);

    void deleteById(int id);
}
