package services;

import data.models.Candidate;
import data.repositories.CandidateRepository;
import dtos.requests.CandidateRegisterRequest;
import dtos.responses.CandidateRegisterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.CandidateRegisterMapper;

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
