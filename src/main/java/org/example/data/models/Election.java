package data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;
@Data
public class Election {
    @Id
    private String electionId;
    private ElectionType electionType;
    private List<Candidate> candidates;
}
