package org.example.controllers;

import org.example.dtos.requests.VoterRegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.example.services.VoterService;
@RestController
public class VoterController {
    @Autowired
    private VoterService voterServices;

    @PostMapping("voterRegister")
    public ResponseEntity<?> registerVoter(@RequestBody VoterRegisterRequest voterRegisterRequest){
        return new ResponseEntity<>(voterServices.registerVoter(voterRegisterRequest), HttpStatus.CREATED);
    }
}
