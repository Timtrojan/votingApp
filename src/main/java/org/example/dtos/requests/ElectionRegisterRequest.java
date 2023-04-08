package dtos.requests;

import data.models.Candidate;
import data.models.ElectionType;
import lombok.Data;

import java.util.List;
@Data
public class ElectionRegisterRequest {
    private String electionId;
    private ElectionType electionType;

    private List<Candidate> candidates;
}
