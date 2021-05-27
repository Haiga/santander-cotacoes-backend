package com.project.santandercotacoes.repository;

import com.project.santandercotacoes.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRespository extends JpaRepository<Stock, Long> {
}
