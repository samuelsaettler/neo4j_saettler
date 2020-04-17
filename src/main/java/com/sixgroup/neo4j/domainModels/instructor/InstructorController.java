package com.sixgroup.neo4j.domainModels.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class InstructorController {

    private InstructorService instructorService;

    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @PostMapping({"/", ""})
    public ResponseEntity<Instructor> create(@RequestBody Instructor instructor) {
        return new ResponseEntity<>(instructorService.create(instructor), HttpStatus.CREATED);
    }

    @GetMapping({"/", ""})
    public ResponseEntity<List<Instructor>> getAll() {
        return new ResponseEntity<>(instructorService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Instructor> getById(@PathVariable int id) {
        return new ResponseEntity<>(instructorService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Instructor> updateById(@PathVariable int id, @RequestBody Instructor instructor) {
        return new ResponseEntity<>(instructorService.updateById(id, instructor), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id) {
        instructorService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
