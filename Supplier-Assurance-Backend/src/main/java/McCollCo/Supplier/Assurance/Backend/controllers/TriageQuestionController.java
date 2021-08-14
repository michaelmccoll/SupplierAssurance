package McCollCo.Supplier.Assurance.Backend.controllers;

import McCollCo.Supplier.Assurance.Backend.models.TriageQuestion;
import McCollCo.Supplier.Assurance.Backend.repositories.TriageQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TriageQuestionController {

    @Autowired
    TriageQuestionRepository triageQuestionRepository;

    @GetMapping(value = "/triageQuestions")
    public ResponseEntity<List<TriageQuestion>> getAllTriageQuestions(){
        return new ResponseEntity<>(triageQuestionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/triageQuestion/{id}")
    public ResponseEntity getTriageQuestion(@PathVariable Long id){
        return new ResponseEntity<>(triageQuestionRepository.findById(id),HttpStatus.OK);
    }

    @PostMapping(value = "/triageQuestions")
    public ResponseEntity<TriageQuestion> postTriageQuestion(@RequestBody TriageQuestion triageQuestion){
        triageQuestionRepository.save(triageQuestion);
        return new ResponseEntity<>(triageQuestion,HttpStatus.CREATED);
    }
}
