package org.example.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@Document("Election")
public class Election {

    @Id
    private String electionId;
    private ElectionType electionType;
    @DBRef()
    private Map<String,Candidate> candidates;


}


