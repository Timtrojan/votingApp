package org.example.utils;

import org.example.data.models.Election;
import org.example.dtos.requests.ElectionRegisterRequest;
import org.example.dtos.responses.ElectionCreationResponse;

public class ElectionRegisterMapper {
public static Election mapElectionCreationData(ElectionRegisterRequest electionRegisterRequest){
    Election election=new Election();
    election.setElectionType(electionRegisterRequest.getElectionType());
    election.setCandidates(electionRegisterRequest.getCandidateList());
    return election;

}

public static  void mapElectionResponse(ElectionCreationResponse electionCreationResponse,Election election){
    electionCreationResponse.setElectionType(election.getElectionType());

}
}
