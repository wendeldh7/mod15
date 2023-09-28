package com.gomes.meme.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gomes.meme.model.Usuario;

@Repository
public interface IUsuarioRepository extends MongoRepository<Usuario, String> {
	
	Boolean existsByEmail(String email);
    
}
