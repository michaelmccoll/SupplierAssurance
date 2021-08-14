package McCollCo.Supplier.Assurance.Backend.repositories;

import McCollCo.Supplier.Assurance.Backend.models.Assessor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessorRepository extends JpaRepository<Assessor, Long> {
}
