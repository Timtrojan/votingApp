package controllers;

import dtos.requests.CandidateRegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import services.CandidateService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
    @Autowired
    private CandidateService candidateServices;

    @PostMapping("/registerCandidate")
    public Object registerCandidate(@RequestBody CandidateRegisterRequest candidateRegisterRequest){
        return candidateServices.registerCandidate(candidateRegisterRequest);
    }

    @GetMapping("/get")
    public Object getCandidate(@RequestParam String id){
        return candidateServices.getCandidate(id);
    }
}
