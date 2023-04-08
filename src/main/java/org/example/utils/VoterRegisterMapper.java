package utils;
import data.models.Voter;
import dtos.requests.VoterRegisterRequest;
import dtos.responses.VoterRegisterResponse;

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
