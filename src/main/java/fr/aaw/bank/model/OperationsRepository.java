package fr.aaw.bank.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperationsRepository extends JpaRepository<Operations, Integer> {
}