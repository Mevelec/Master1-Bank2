package fr.aaw.bank.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BankAccountRepository extends JpaRepository<BankAccounts, Integer> {
    List<BankAccounts> findByUser(Users user);
    List<BankAccounts> findByUserId(Integer user);
}