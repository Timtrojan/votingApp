package org.example.data.repositories;

import org.example.data.models.Voter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VoterRepository extends MongoRepository<Voter, String> {

}
