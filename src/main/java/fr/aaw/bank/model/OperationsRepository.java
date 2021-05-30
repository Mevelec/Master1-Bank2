package fr.aaw.bank.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OperationsRepository extends JpaRepository<Operations, Integer> {
    Optional<Operations> findById(Integer id);
    List<Operations> findBySrcAccountId(Integer user);
    List<Operations> findByDstAccountId(Integer user);
}