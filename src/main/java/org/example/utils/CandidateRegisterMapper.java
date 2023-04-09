package org.example.utils;

import org.example.data.models.Candidate;
import org.example.dtos.requests.CandidateRegisterRequest;
import org.example.dtos.responses.CandidateRegisterResponse;

public class CandidateRegisterMapper {
    public static Candidate mapRegisterCandidate(CandidateRegisterRequest registerRequest) {
        Candidate candidate = new Candidate();
        candidate.setCandidateAge(registerRequest.getCandidateAge());
        candidate.setCandidateName(registerRequest.getCandidateName());
        candidate.setParty(registerRequest.getParty());
        return candidate;
    }

    public static void mapCandidateResponse(CandidateRegisterResponse candidateRegisterResponse, Candidate candidate) {
        candidateRegisterResponse.setCandidateName(candidate.getCandidateName());
        candidateRegisterResponse.setCandidateId(candidate.getCandidateId());
        candidateRegisterResponse.setParty(candidate.getParty());
    }
}
