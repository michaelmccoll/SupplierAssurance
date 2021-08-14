package McCollCo.Supplier.Assurance.Backend.controllers;

import McCollCo.Supplier.Assurance.Backend.models.Contact;
import McCollCo.Supplier.Assurance.Backend.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    ContactRepository contactRepository;

    @GetMapping(value = "/contacts")
    public ResponseEntity<List<Contact>> getAllContacts(){
        return new ResponseEntity<>(contactRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/contact/{id}")
    public ResponseEntity getContact(@PathVariable Long id){
        return new ResponseEntity<>(contactRepository.findById(id),HttpStatus.OK);
    }

    @PostMapping(value = "/contacts")
    public ResponseEntity<Contact> postContact(@RequestBody Contact contact){
        contactRepository.save(contact);
        return new ResponseEntity<>(contact,HttpStatus.CREATED);
    }
}
