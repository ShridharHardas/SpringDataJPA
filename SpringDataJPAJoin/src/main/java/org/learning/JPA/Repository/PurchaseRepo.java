package org.learning.JPA.Repository;

import org.learning.JPA.Entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepo extends JpaRepository<Purchase, Long>{

}
