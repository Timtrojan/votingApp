package services;

import data.models.Voter;
import data.repositories.VoterRepository;
import dtos.requests.VoterRegisterRequest;
import dtos.responses.VoterRegisterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.VoterRegisterMapper;
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
