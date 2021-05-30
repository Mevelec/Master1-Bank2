package fr.aaw.bank.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface BankAccountRepository extends JpaRepository<BankAccounts, Integer> {
    Optional<BankAccounts> findById(Integer id);
    List<BankAccounts> findByUser(Users user);
    List<BankAccounts> findByUserId(Integer user);
}