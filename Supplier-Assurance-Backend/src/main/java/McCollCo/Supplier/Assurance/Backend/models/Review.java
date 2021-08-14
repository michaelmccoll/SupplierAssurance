package McCollCo.Supplier.Assurance.Backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;
import org.hibernate.mapping.ToOne;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="reviews")
public class Review {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="supplier_id", nullable=false)
    @JsonIgnoreProperties({"supplier", "organisation", "review"})
    private Supplier supplier;

    @OneToMany(mappedBy = "review")
    @JsonIgnoreProperties({"review"})
    private List<TriageQuestion> triageQuestions;

    @Column(name = "type")
    private String type;

    @Column(name = "date")
    private LocalDate date;

    @OneToMany(mappedBy="review")
    @JsonIgnoreProperties({"review"})
    private List<Question> questions;

    @Column(name = "progress")
    private String progress;

    @ManyToMany
    @JsonIgnoreProperties({"organisation","suppliers","reviews"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "assessors_reviews",
            joinColumns = { @JoinColumn(
                    name = "review_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "assessor_id",
                    nullable = false,
                    updatable = false)
            })
    private List<Assessor> assessors;

    public Review(Supplier supplier, String type, LocalDate date, String progress) {
        this.supplier = supplier;
        this.type = type;
        this.date = date;
        this.progress = progress;
        this.triageQuestions = new ArrayList<>();
        this.questions = new ArrayList<>();
        this.assessors = new ArrayList<>();
    }

    public Review(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public List<TriageQuestion> getTriageQuestions() {
        return triageQuestions;
    }

    public void setTriageQuestions(List<TriageQuestion> triageQuestions) {
        this.triageQuestions = triageQuestions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public List<Assessor> getAssessors() {
        return assessors;
    }

    public void setAssessors(List<Assessor> assessors) {
        this.assessors = assessors;
    }

}
