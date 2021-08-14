package McCollCo.Supplier.Assurance.Backend.controllers;

import McCollCo.Supplier.Assurance.Backend.models.Supplier;
import McCollCo.Supplier.Assurance.Backend.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    SupplierRepository supplierRepository;

    @GetMapping(value = "/suppliers")
    public ResponseEntity<List<Supplier>> getAllSuppliers(){
        return new ResponseEntity<>(supplierRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/supplier/{id}")
    public ResponseEntity getSupplier(@PathVariable Long id){
        return new ResponseEntity<>(supplierRepository.findById(id),HttpStatus.OK);
    }

    @PostMapping(value = "/suppliers")
    public ResponseEntity<Supplier> postSupplier(@RequestBody Supplier supplier){
        supplierRepository.save(supplier);
        return new ResponseEntity<>(supplier,HttpStatus.CREATED);
    }
}
