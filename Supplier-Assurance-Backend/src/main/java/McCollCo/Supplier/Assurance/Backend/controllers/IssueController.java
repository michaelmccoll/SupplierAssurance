package McCollCo.Supplier.Assurance.Backend.controllers;

import McCollCo.Supplier.Assurance.Backend.models.Issue;
import McCollCo.Supplier.Assurance.Backend.repositories.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IssueController {

    @Autowired
    IssueRepository issueRepository;

    @GetMapping(value = "/issues")
    public ResponseEntity<List<Issue>> getAllIssues(){
        return new ResponseEntity<>(issueRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/issue/{id}")
    public ResponseEntity getIssue(@PathVariable Long id){
        return new ResponseEntity<>(issueRepository.findById(id),HttpStatus.OK);
    }

    @PostMapping(value = "/issues")
    public ResponseEntity<Issue> postIssue(@RequestBody Issue issue){
        issueRepository.save(issue);
        return new ResponseEntity<>(issue,HttpStatus.CREATED);
    }
}
