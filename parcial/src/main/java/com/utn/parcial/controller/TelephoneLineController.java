package com.utn.parcial.controller;

import com.utn.parcial.Service.Integration.IntegrationComponent;
import com.utn.parcial.Service.IntegrationService;
import com.utn.parcial.projections.MostAndLeastUsedLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/telephoneLine")
public class TelephoneLineController {

    @Autowired
    IntegrationService integrationService;

    @GetMapping("/MostAndLeastUsed")
    public ResponseEntity findMostAndLeastUsedTelephoneLine(){
        return integrationService.getMostAndLeastUsedLine();
    }

}
