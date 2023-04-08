package dtos.responses;

import lombok.Data;

@Data
public class VoterRegisterResponse {
    private String voterName;
    private String voterId;
    private int voterAge;
}
