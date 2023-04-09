package org.example.services;

import org.example.data.models.Candidate;
import org.example.data.models.Election;
import org.example.data.repositories.CandidateRepository;
import org.example.data.repositories.ElectionRepository;
import org.example.dtos.requests.ElectionRegisterRequest;
import org.example.dtos.responses.ElectionCreationResponse;
import org.example.utils.ElectionRegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ElectionServiceImplementation implements ElectionService{
    @Autowired
    private ElectionRepository electionRepository;

    @Autowired
    private CandidateRepository candidateRepository;

    Map<String, Candidate> candidateList= (Map<String, Candidate>) candidateRepository.findAll();


    @Override
    public ElectionCreationResponse electionCreation(ElectionRegisterRequest electionRegisterRequest) {
        Election election=electionRepository.save(ElectionRegisterMapper.mapElectionCreationData(electionRegisterRequest));
        ElectionCreationResponse electionCreationResponse=new ElectionCreationResponse();
        ElectionRegisterMapper.mapElectionResponse(electionCreationResponse,election);
        candidateRepository.deleteAll();
        return electionCreationResponse;
    }

    @Override
    public String vote(String party) {
     candidateList.forEach((key,value)->{
         System.out.println(value.getParty().toString()+" "+value.getCandidateName().toString());
     });

        candidateList.forEach((key,value)->{
            if (party.equals(key)) value.setVoteCount();
        });

        return "Voted Successfully";
    }

    @Override
    public String electionSummary(String id) {
        return null;
    }
}
