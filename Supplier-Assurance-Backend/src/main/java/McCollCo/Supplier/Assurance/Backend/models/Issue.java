package McCollCo.Supplier.Assurance.Backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="issues")

public class Issue {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="question_id", nullable=false)
    @JsonIgnoreProperties({"issues","contacts"})
    private Question question;

    @Column(name = "issue")
    private String issue;

    @Column(name = "remediationPlan")
    private String remediationPlan;

    @Column(name = "targetDate")
    private LocalDate targetDate;

    @Column(name = "status")
    private String status;

    public Issue(Question question, String issue, String remediationPlan, LocalDate targetDate, String status) {
        this.question = question;
        this.issue = issue;
        this.remediationPlan = remediationPlan;
        this.targetDate = targetDate;
        this.status = status;
    }

    public Issue(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getRemediationPlan() {
        return remediationPlan;
    }

    public void setRemediationPlan(String remediationPlan) {
        this.remediationPlan = remediationPlan;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
