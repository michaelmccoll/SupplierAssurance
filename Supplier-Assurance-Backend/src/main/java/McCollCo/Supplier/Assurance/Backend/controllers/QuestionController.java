package McCollCo.Supplier.Assurance.Backend.controllers;

import McCollCo.Supplier.Assurance.Backend.models.Question;
import McCollCo.Supplier.Assurance.Backend.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    QuestionRepository questionRepository;

    @GetMapping(value = "/questions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/question/{id}")
    public ResponseEntity getQuestion(@PathVariable Long id){
        return new ResponseEntity<>(questionRepository.findById(id),HttpStatus.OK);
    }

    @PostMapping(value = "/questions")
    public ResponseEntity<Question> postQuestion(@RequestBody Question question){
        questionRepository.save(question);
        return new ResponseEntity<>(question,HttpStatus.CREATED);
    }
}
