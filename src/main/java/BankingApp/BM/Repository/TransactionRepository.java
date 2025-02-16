package BankingApp.BM.Repository;

import BankingApp.BM.Entity.Transaction;
import BankingApp.BM.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    @Transactional(readOnly = true)
    List<Transaction> findByAccountId(Long accountId);

    @Transactional(readOnly = true)
    List<Transaction> findByAccountOrderByTimestampDesc(Account account);
}
