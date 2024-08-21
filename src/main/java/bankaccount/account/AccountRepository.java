package bankaccount.account;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
  List<Account> findAccountByCustomerId(long customerId);
  Optional<Account> findAccountByNumber(String number);

}
