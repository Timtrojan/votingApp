package org.example.services;

import org.example.data.models.Voter;
import org.example.data.repositories.VoterRepository;
import org.example.dtos.requests.VoterRegisterRequest;
import org.example.dtos.responses.VoterRegisterResponse;
import org.example.utils.VoterRegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterServiceImplementation implements VoterService{
    @Autowired
    private VoterRepository voterRepository;
    @Override
    public VoterRegisterResponse registerVoter(VoterRegisterRequest voterRegisterRequest) {
        Voter voter=voterRepository.save(VoterRegisterMapper.mapVoterRegisterToModel(voterRegisterRequest));
        VoterRegisterResponse voterRegisterResponse=new VoterRegisterResponse();
        VoterRegisterMapper.mapVoterRegisterResponse(voterRegisterResponse,voter);
        return voterRegisterResponse;
    }

    @Override
    public VoterRegisterResponse findVoterById(String id) {
        return null;
    }
}
