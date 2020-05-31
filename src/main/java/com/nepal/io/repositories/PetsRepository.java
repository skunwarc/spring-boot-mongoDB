package com.nepal.io.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nepal.io.models.Pets;

@Repository
public interface PetsRepository extends MongoRepository<Pets, String>{
	 Pets findBy_id(ObjectId _id);
}
