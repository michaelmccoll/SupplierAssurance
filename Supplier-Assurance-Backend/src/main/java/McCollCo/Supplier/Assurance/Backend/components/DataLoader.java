package McCollCo.Supplier.Assurance.Backend.components;

import McCollCo.Supplier.Assurance.Backend.models.*;
import McCollCo.Supplier.Assurance.Backend.repositories.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    AssessorRepository assessorRepository;
    @Autowired
    ContactRepository contactRepository;
    @Autowired
    IssueRepository issueRepository;
    @Autowired
    OrganisationRepository organisationRepository;
    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    SupplierRepository supplierRepository;
    @Autowired
    TriageQuestionRepository triageQuestionRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {

        LocalDate testDate1 = LocalDate.of(2020, 5, 30);
        LocalDate testDate2 = LocalDate.of(2021, 5, 31);
        LocalDate testDate3 = LocalDate.of(2020, 3, 1);
        LocalDate testDate4 = LocalDate.of(2021, 3, 2);
        LocalDate testDate5 = LocalDate.of(2020, 10, 7);
        LocalDate testDate6 = LocalDate.of(2021, 10, 7);
        LocalDate testDate7 = LocalDate.of(2020, 6, 18);
        LocalDate testDate8 = LocalDate.of(2021, 6, 18);
        LocalDate testDate9 = LocalDate.of(2019, 6, 18);
        LocalDate testDate10 = LocalDate.of(2020, 6, 18);

        Organisation org1 = new Organisation("ScotBank","123 Princes Street","info@scotbank.com","www.scotbank.com","01316602345");
        organisationRepository.save(org1);

        Supplier supplier1 = new Supplier(org1,"Travelex","Money Exchange","Tier 1","250 London Street","www.travelex.com",testDate1,testDate2);
        supplierRepository.save(supplier1);
        Supplier supplier2 = new Supplier(org1,"AWS","IT Infrastructure","Tier 1","67 Americas Lane","www.qws.com",testDate3,testDate4);
        supplierRepository.save(supplier2);
        Supplier supplier3 = new Supplier(org1,"Gemalto","Card Printing","Tier 2","50 Threadneedle Street","www.gemalto.co.uk",testDate5,testDate6);
        supplierRepository.save(supplier3);
        Supplier supplier4 = new Supplier(org1,"HSBC","Banking","Tier 3","2 Exhange Road","www.hsbc.com",testDate7,testDate8);
        supplierRepository.save(supplier4);

        Review review1 = new Review(supplier1,"On site",testDate1,"In progress");
        reviewRepository.save(review1);
        Review review2 = new Review(supplier2,"On site",testDate1,"Write-up");
        reviewRepository.save(review2);
        Review review3 = new Review(supplier3,"Remote",testDate2,"Planning");
        reviewRepository.save(review3);
        Review review4 = new Review(supplier4,"Remote",testDate5,"Complete");
        reviewRepository.save(review4);
        Review review5 = new Review(supplier1,"Remote",testDate9,"Complete");
        reviewRepository.save(review5);

        TriageQuestion triageQuestion1 = new TriageQuestion(review1,"IAM","Do your employees have access to our data?","Guidance blah");
        triageQuestion1.setTriageAnswer("Yes");
        triageQuestionRepository.save(triageQuestion1);
        TriageQuestion triageQuestion2 = new TriageQuestion(review1,"Data Privacy","Do you process or store personal data?","Guidance blah");
        triageQuestion2.setTriageAnswer("No");
        triageQuestionRepository.save(triageQuestion2);
        TriageQuestion triageQuestion3 = new TriageQuestion(review1, "Infrastructure","Do you outsource your infrastructure?","Guidance blah");
        triageQuestionRepository.save(triageQuestion3);

        Assessor assessor1 = new Assessor(org1,"Ted Brown","Supplier Manager","tedb@scotbank.com","0791093470");
        assessor1.addReviewToAssessor(review1);
        assessor1.addReviewToAssessor(review4);
        assessor1.addReviewToAssessor(review5);
        assessorRepository.save(assessor1);
        Assessor assessor2 = new Assessor(org1,"Shelly Smith","Supplier Analyst","shellys@scotbank.com","0792236770");
        assessor2.addReviewToAssessor(review2);
        assessor2.addReviewToAssessor(review5);
        assessorRepository.save(assessor2);
        Assessor assessor3 = new Assessor(org1,"Mike White","Supplier Manager","mikew@scotbank.com","074465093470");
        assessor3.addReviewToAssessor(review3);
        assessor3.addReviewToAssessor(review5);
        assessorRepository.save(assessor3);

        Contact contact1 = new Contact(supplier1,"Lesley Piko","Client Manager","lesleypiko@travelex.com","078937483");
        contactRepository.save(contact1);
        Contact contact2 = new Contact(supplier1,"Barry Burke","Client Director","barryb@travelex.com","0784784224");
        contactRepository.save(contact2);
        Contact contact3 = new Contact(supplier2,"Tony Shark","InfoSec Manager","tonyshark@gemalto.com","0789565676");
        contactRepository.save(contact3);

        Question question1 = new Question(review1,"IAM1","Identity & Access Management","What IAM procedures and controls do you have?","Access Policy, Single Sign-On",4);
        questionRepository.save(question1);
        Question question2 = new Question(review1,"DP1","Data Privacy","What Data Privacy and GDPR procedures and controls do you have?","Data Privacy Policy, Privacy Impact Assessment",2);
        questionRepository.save(question2);
        Question question3 = new Question(review1,"INF1","Infrastructure","What Infrastructure procedures and controls do you have?","Cloud Policy, Infrastructure Procedure",3);
        questionRepository.save(question3);

        Issue issue1 = new Issue(question2,"No data privacy policy in place","Create a Data Privacy policy and get appropriate sign-off",testDate2,"Not Started");
        issueRepository.save(issue1);
        Issue issue2 = new Issue(question2,"No data privacy impact assessment","Create a Data Privacy impact assessment",testDate4,"Started");
        issueRepository.save(issue2);
        Issue issue3 = new Issue(question3,"Cloud control environment not fully mapped","Finish complete cloud control mapping",testDate6,"On Track");
        issueRepository.save(issue3);
    }
}
