package org.example.dtos.responses;

import lombok.Data;
import org.example.data.models.Candidate;
import org.example.data.models.ElectionType;

import java.util.List;

@Data
public class ElectionCreationResponse {
    private String electionId;
    private ElectionType electionType;

}
