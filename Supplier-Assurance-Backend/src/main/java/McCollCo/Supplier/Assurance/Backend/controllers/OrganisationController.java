package McCollCo.Supplier.Assurance.Backend.controllers;

import McCollCo.Supplier.Assurance.Backend.models.Organisation;
import McCollCo.Supplier.Assurance.Backend.repositories.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrganisationController {

    @Autowired
    OrganisationRepository organisationRepository;

    @GetMapping(value = "/organisations")
    public ResponseEntity<List<Organisation>> getAllOrganisations(){
        return new ResponseEntity<>(organisationRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/organisation/{id}")
    public ResponseEntity getOrganisation(@PathVariable Long id){
        return new ResponseEntity<>(organisationRepository.findById(id),HttpStatus.OK);
    }

    @PostMapping(value = "/organisations")
    public ResponseEntity<Organisation> postOrganisation(@RequestBody Organisation organisation){
        organisationRepository.save(organisation);
        return new ResponseEntity<>(organisation,HttpStatus.CREATED);
    }
}
