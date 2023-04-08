package services;

import dtos.requests.CandidateRegisterRequest;
import dtos.responses.CandidateRegisterResponse;

public interface CandidateService {
    public CandidateRegisterResponse registerCandidate(CandidateRegisterRequest register);
    public int voteCount();
    public Object getCandidate(String id);
}
