package dtos.requests;

import lombok.Data;

@Data
public class VoterRegisterRequest {
    private String voterName;
    private String voterId;
    private int voterAge;
}
