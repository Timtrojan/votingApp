package org.example.data.repositories;

import org.example.data.models.Election;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ElectionRepository extends MongoRepository<Election, String> {
}
