package com.sixgroup.neo4j.domainModels.apprentice;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApprenticeRepository extends CrudRepository<Apprentice, Long> {

    Apprentice findByName(String name);

    void deleteById(int id);

    boolean existsById(int id);

    List<Object> findById(int id);
}
