package McCollCo.Supplier.Assurance.Backend.repositories;

import McCollCo.Supplier.Assurance.Backend.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
