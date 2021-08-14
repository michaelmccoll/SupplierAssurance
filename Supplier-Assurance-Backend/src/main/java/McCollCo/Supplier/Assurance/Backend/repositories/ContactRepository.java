package McCollCo.Supplier.Assurance.Backend.repositories;

import McCollCo.Supplier.Assurance.Backend.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
