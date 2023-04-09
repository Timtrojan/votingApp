package org.example.services;

import org.example.dtos.requests.VoterRegisterRequest;
import org.example.dtos.responses.VoterRegisterResponse;

public interface VoterService {
    public VoterRegisterResponse registerVoter(VoterRegisterRequest voterRegisterRequest);
    public VoterRegisterResponse findVoterById(String id);
}
