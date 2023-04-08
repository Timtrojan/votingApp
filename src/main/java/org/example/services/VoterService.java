package services;

import dtos.requests.VoterRegisterRequest;
import dtos.responses.VoterRegisterResponse;

public interface VoterService {
    public VoterRegisterResponse registerVoter(VoterRegisterRequest voterRegisterRequest);
    public VoterRegisterResponse findVoterById(String id);
}
