package org.example.data.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Candidate")
public class Candidate {
    private String candidateName;
    @Id
    private String candidateId;
    private int candidateAge;
    @Setter(AccessLevel.NONE)
    private int voteCount;
    private String party;

    public void setVoteCount() {
        voteCount++;
    }
}
