package org.example.dtos.requests;

import lombok.Data;

@Data
public class CandidateRegisterRequest {
    private String candidateName;
    private String candidateId;
    private int candidateAge;
    private String party;

}
