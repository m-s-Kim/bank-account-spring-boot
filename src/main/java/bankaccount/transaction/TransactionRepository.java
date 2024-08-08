package bankaccount.transaction;

import org.springframework.data.jpa.repository.JpaRepository;



import java.time.LocalDateTime;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountNumberAndCreatedAtBetween(String accountNumber, LocalDateTime start, LocalDateTime end);



}
