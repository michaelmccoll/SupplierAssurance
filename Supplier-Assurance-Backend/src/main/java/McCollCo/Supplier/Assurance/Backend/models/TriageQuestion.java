package McCollCo.Supplier.Assurance.Backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="triage_questions")
public class TriageQuestion {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="review_id", nullable=false)
    @JsonIgnoreProperties({"review"})
    private Review review;

    @Column(name = "triage_domain")
    private String triageDomain;

    @Column(name = "triage_question")
    private String triageQuestion;

    @Column(name = "triage_guidance")
    private String triageGuidance;

    @Column(name = "triage_answer")
    private String triageAnswer;

    public TriageQuestion(Review review, String triageDomain, String triageQuestion, String triageGuidance){
        this.review = review;
        this.triageDomain = triageDomain;
        this.triageQuestion = triageQuestion;
        this.triageGuidance = triageGuidance;
        this.triageAnswer = null;
    }

    public TriageQuestion(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public String getTriageDomain() {
        return triageDomain;
    }

    public void setTriageDomain(String triageDomain) {
        this.triageDomain = triageDomain;
    }

    public String getTriageQuestion() {
        return triageQuestion;
    }

    public void setTriageQuestion(String triageQuestion) {
        this.triageQuestion = triageQuestion;
    }

    public String getTriageGuidance() {
        return triageGuidance;
    }

    public void setTriageGuidance(String triageGuidance) {
        this.triageGuidance = triageGuidance;
    }

    public String getTriageAnswer() {
        return triageAnswer;
    }

    public void setTriageAnswer(String triageAnswer) {
        this.triageAnswer = triageAnswer;
    }

}
