package org.example.utils;
import org.example.data.models.Voter;
import org.example.dtos.requests.VoterRegisterRequest;
import org.example.dtos.responses.VoterRegisterResponse;

public class VoterRegisterMapper {
    public static Voter mapVoterRegisterToModel  (VoterRegisterRequest registerRequest) {
        Voter voter=new Voter();
        voter.setVoterAge(registerRequest.getVoterAge());
        voter.setVoterName(registerRequest.getVoterName());
        return voter;
    }
    public static void mapVoterRegisterResponse(VoterRegisterResponse voterRegisterResponse, Voter voter){
        voterRegisterResponse.setVoterName(voter.getVoterName());
        voterRegisterResponse.setVoterId(voter.getVoterId());
    }
}
