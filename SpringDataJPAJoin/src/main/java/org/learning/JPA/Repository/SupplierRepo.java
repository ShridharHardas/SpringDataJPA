package org.learning.JPA.Repository;

import org.learning.JPA.Entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<Supplier, Long>{

}
