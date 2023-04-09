package org.example.services;

import org.example.data.models.Candidate;
import org.example.data.repositories.CandidateRepository;
import org.example.dtos.requests.CandidateRegisterRequest;
import org.example.dtos.responses.CandidateRegisterResponse;
import org.example.utils.CandidateRegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImplementation implements CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public CandidateRegisterResponse registerCandidate(CandidateRegisterRequest register) {
        Candidate candidate = candidateRepository.save(CandidateRegisterMapper.mapRegisterCandidate(register));
        CandidateRegisterResponse candidateRegisterResponse = new CandidateRegisterResponse();
        CandidateRegisterMapper.mapCandidateResponse(candidateRegisterResponse, candidate);
        return candidateRegisterResponse;

    }

    @Override
    public int voteCount() {
        return 0;
    }

    @Override
    public Object getCandidate(String id) {
        return null;
    }
}
