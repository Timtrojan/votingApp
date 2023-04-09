package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Voter")
public class Voter {
    private String voterName;
    @Id
    private String voterId;
    private int voterAge;
    private boolean isVoted;
}
