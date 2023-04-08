package data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Candidate {
    private String candidateName;
    @Id
    private String candidateId;
    private int candidateAge;
    private int voteCount;
    private String party;
}
