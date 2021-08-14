package McCollCo.Supplier.Assurance.Backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="organisations")

public class Organisation {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "website")
    private String website;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @OneToMany(mappedBy="organisation")
    @JsonIgnoreProperties({"suppliers", "organisation"})
    private List<Supplier> suppliers;

    @OneToMany(mappedBy="organisation")
    @JsonIgnoreProperties({"organisation","reviews"})
    private List<Assessor> assessors;

    public Organisation(String name, String address, String email, String website, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.website = website;
        this.phoneNumber = phoneNumber;
        this.suppliers = new ArrayList<>();
        this.assessors = new ArrayList<>();
    }

    public Organisation(){

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }


    public List<Assessor> getAssessors() {
        return assessors;
    }

    public void setAssessors(List<Assessor> assessors) {
        this.assessors = assessors;
    }
}