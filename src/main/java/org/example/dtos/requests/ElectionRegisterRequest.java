package org.example.dtos.requests;

import com.mongodb.client.model.Collation;
import org.example.data.models.Candidate;
import org.example.data.models.ElectionType;
import lombok.Data;
import org.example.data.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class ElectionRegisterRequest {

    @Autowired
    private CandidateRepository candidateRepository;
    private String electionId;
    private ElectionType electionType;
    private Map<String,Candidate> candidateList;

    public String getElectionId() {
        return electionId;
    }

    public void setElectionId(String electionId) {
        this.electionId = electionId;
    }

    public ElectionType getElectionType() {
        return electionType;
    }

    public void setElectionType(ElectionType electionType) {
        this.electionType = electionType;
    }

    public Collection<Candidate> getCandidateList() {
        return candidateRepository.findAll();
    }

    public void setCandidateList(Map<String,Candidate> candidateList) {
        this.candidateList = candidateList;
    }
}
