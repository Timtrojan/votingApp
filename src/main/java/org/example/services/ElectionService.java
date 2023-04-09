package org.example.services;

import org.example.dtos.requests.ElectionRegisterRequest;
import org.example.dtos.responses.ElectionCreationResponse;

public interface ElectionService {
    public ElectionCreationResponse electionCreation(ElectionRegisterRequest electionRegisterRequest);
    public String vote(String party);
    public String electionSummary(String id);

}
