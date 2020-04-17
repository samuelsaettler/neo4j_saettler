package com.sixgroup.neo4j.domainModels.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.NoSuchElementException;

public class InstructorServiceImpl implements InstructorService {

        private InstructorRepository instructorRepository;

        @Autowired
        public InstructorServiceImpl(InstructorRepository instructorRepository) {
            this.instructorRepository = instructorRepository;
        }

        @Override
        public Instructor create(Instructor instructor) {
            return instructorRepository.save(instructor);
        }

        @Override
        public List<Instructor> findAll() {
            return (List<Instructor>) instructorRepository.findAll();
        }

        @Override
        public Instructor findById(int id) {
            return instructorRepository.findById(id).get();
        }

        @Override
        public Instructor updateById(int id, Instructor instructor) {
            if(instructorRepository.existsById(id)) {
                instructor.setId((long) id);
                instructorRepository.save(instructor);

                return instructor;
            } else {
                throw new NoSuchElementException("No value");
            }
        }

        @Override
        public void deleteById(int id) {
            instructorRepository.deleteById(id);
        }
}
