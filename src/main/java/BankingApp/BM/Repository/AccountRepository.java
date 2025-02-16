package BankingApp.BM.Repository;

import BankingApp.BM.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    @Transactional(readOnly = true)
    Optional<Account> findByUsername(String username);
}
