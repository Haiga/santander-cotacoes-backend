package com.project.santandercotacoes.service;

import com.project.santandercotacoes.exceptions.BusinessException;
import com.project.santandercotacoes.mapper.StockMapper;
import com.project.santandercotacoes.model.Stock;
import com.project.santandercotacoes.model.dto.StockDTO;
import com.project.santandercotacoes.repository.StockRespository;
import com.project.santandercotacoes.util.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRespository repository;

    @Autowired
    private StockMapper mapper;

    @Transactional
    public StockDTO save(StockDTO dto) {
        Optional<Stock> optionalStock = repository.findByNameAndDate(dto.getName(), dto.getDate());
        if (optionalStock.isPresent()) {
            throw new BusinessException(MessageUtils.STOCK_ALREADY_EXISTS);
        }
        Stock stock = mapper.toEntity(dto);
        repository.save(stock);
        return mapper.toDTO(stock);
    }
}
