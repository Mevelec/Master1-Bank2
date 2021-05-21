package fr.aaw.bank.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {
    Optional<BankAccount> findByUser(User user);
}