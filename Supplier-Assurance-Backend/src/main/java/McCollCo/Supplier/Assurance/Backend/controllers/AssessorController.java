package McCollCo.Supplier.Assurance.Backend.controllers;

import McCollCo.Supplier.Assurance.Backend.models.Assessor;
import McCollCo.Supplier.Assurance.Backend.repositories.AssessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssessorController {

    @Autowired
    AssessorRepository assessorRepository;

    @GetMapping(value = "/assessors")
    public ResponseEntity<List<Assessor>> getAllAssessors(){
        return new ResponseEntity<>(assessorRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/assessor/{id}")
    public ResponseEntity getAssessor(@PathVariable Long id){
        return new ResponseEntity<>(assessorRepository.findById(id),HttpStatus.OK);
    }

    @PostMapping(value = "/assessors")
    public ResponseEntity<Assessor> postAssessor(@RequestBody Assessor assessor){
        assessorRepository.save(assessor);
        return new ResponseEntity<>(assessor,HttpStatus.CREATED);
    }
}
