package McCollCo.Supplier.Assurance.Backend.controllers;

import McCollCo.Supplier.Assurance.Backend.models.Review;
import McCollCo.Supplier.Assurance.Backend.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    ReviewRepository reviewRepository;

    @GetMapping(value = "/reviews")
    public ResponseEntity<List<Review>> getAllReviews(){
        return new ResponseEntity<>(reviewRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/review/{id}")
    public ResponseEntity getReview(@PathVariable Long id){
        return new ResponseEntity<>(reviewRepository.findById(id),HttpStatus.OK);
    }

    @PostMapping(value = "/reviews")
    public ResponseEntity<Review> postReview(@RequestBody Review review){
        reviewRepository.save(review);
        return new ResponseEntity<>(review,HttpStatus.CREATED);
    }
}
