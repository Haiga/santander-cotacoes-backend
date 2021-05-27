package com.project.santandercotacoes.repository;

import com.project.santandercotacoes.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface StockRespository extends JpaRepository<Stock, Long> {
    Optional<Stock> findByNameAndDate(String name, LocalDate date);
}
