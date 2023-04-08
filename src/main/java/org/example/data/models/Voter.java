package data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Voter {
    private String voterName;
    @Id
    private String voterId;
    private int voterAge;
}
