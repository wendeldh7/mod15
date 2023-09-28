package com.gomes.categoriaMemeService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gomes.categoriaMemeService.model.CategoriaMeme;

public interface ICategoriaRepository extends MongoRepository<CategoriaMeme, String> {
    
}
