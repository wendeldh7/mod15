package com.gomes.memems.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gomes.memems.model.Meme;

public interface IMemeRepository extends MongoRepository<Meme, String> {

}
