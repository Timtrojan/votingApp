package org.example.services;

import org.example.dtos.requests.CandidateRegisterRequest;
import org.example.dtos.responses.CandidateRegisterResponse;

public interface CandidateService {
    public CandidateRegisterResponse registerCandidate(CandidateRegisterRequest register);
    public int voteCount();
    public Object getCandidate(String id);
}
