package McCollCo.Supplier.Assurance.Backend.repositories;

import McCollCo.Supplier.Assurance.Backend.models.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisationRepository extends JpaRepository<Organisation, Long> {
}
