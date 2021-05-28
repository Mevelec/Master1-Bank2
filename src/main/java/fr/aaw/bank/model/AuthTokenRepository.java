package fr.aaw.bank.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthTokenRepository extends JpaRepository<AuthTokens, String> {

    List<AuthTokens> findByUserid(Integer user);
}