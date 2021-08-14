package McCollCo.Supplier.Assurance.Backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="questions")
public class Question {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="review_id", nullable=false)
    @JsonIgnoreProperties({"questions","contacts"})
    private Review review;

    @Column(name = "ref")
    private String ref;

    @Column(name = "domain")
    private String domain;

    @Column(name = "question")
    private String question;

    @Column(name = "guidance")
    private String guidance;

    @Column(name = "rating")
    private Integer rating;

    @OneToMany(mappedBy="question")
    @JsonIgnoreProperties({"question"})
    private List<Issue> issues;

    public Question(Review review, String ref, String domain, String question, String guidance, Integer rating) {
        this.review = review;
        this.ref = ref;
        this.domain = domain;
        this.question = question;
        this.guidance = guidance;
        this.rating = rating;
        this.issues = new ArrayList<>();
    }

    public Question(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getGuidance() {
        return guidance;
    }

    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }
}
