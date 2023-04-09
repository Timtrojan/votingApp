package org.example.controllers;

import org.example.dtos.requests.ElectionRegisterRequest;
import org.example.services.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Election")
public class ElectionController {
    @Autowired
    private ElectionService electionService;
    @PostMapping("CreateElection")
    public ResponseEntity<?> createElection(@RequestBody ElectionRegisterRequest electionRegisterRequest){
        return new ResponseEntity<>(electionService.electionCreation(electionRegisterRequest), HttpStatus.CREATED);
    }

}
