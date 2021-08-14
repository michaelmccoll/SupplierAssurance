package McCollCo.Supplier.Assurance.Backend.repositories;

import McCollCo.Supplier.Assurance.Backend.models.TriageQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TriageQuestionRepository extends JpaRepository<TriageQuestion, Long> {
}
