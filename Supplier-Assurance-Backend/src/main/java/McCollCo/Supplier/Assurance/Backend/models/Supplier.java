package McCollCo.Supplier.Assurance.Backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

@Entity
@Table(name="suppliers")

public class Supplier {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="organisation_id", nullable=false)
    @JsonIgnoreProperties({"organisation","suppliers","assessors"})
    private Organisation organisation;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "tier")
    private String tier;

    @Column(name = "address")
    private String address;

    @Column(name = "website")
    private String website;

    @OneToMany(mappedBy="supplier")
    @JsonIgnoreProperties({"contacts", "supplier", "organisation"})
    private List<Contact> contacts;

    @Column(name = "lastReviewDate")
    private LocalDate lastReviewDate;

    @Column(name = "nextReviewDate")
    private LocalDate nextReviewDate;

    @JsonIgnoreProperties({"supplier"})
    @OneToMany(mappedBy="supplier")
    private List<Review> review;

    public Supplier(Organisation organisation, String name, String type, String tier, String address, String website, LocalDate lastReviewDate, LocalDate nextReviewDate) {
        this.organisation = organisation;
        this.name = name;
        this.type = type;
        this.tier = tier;
        this.address = address;
        this.website = website;
        this.contacts = new ArrayList<>();
        this.lastReviewDate = lastReviewDate;
        this.nextReviewDate = nextReviewDate;
        this.review = new ArrayList<>();
    }

    public Supplier(){

    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public LocalDate getLastReviewDate() {
        return lastReviewDate;
    }

    public void setLastReviewDate(LocalDate lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }

    public LocalDate getNextReviewDate() {
        return nextReviewDate;
    }

    public void setNextReviewDate(LocalDate nextReviewDate) {
        this.nextReviewDate = nextReviewDate;
    }

    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }

}
