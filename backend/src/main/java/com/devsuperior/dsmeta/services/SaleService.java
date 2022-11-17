package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.models.SaleModel;
import com.devsuperior.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<SaleModel> findSales(){
       return repository.findAll();
    }
}
