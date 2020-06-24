package com.utn.parcial.Service;

import com.utn.parcial.Service.Integration.IntegrationComponent;
import com.utn.parcial.projections.MostAndLeastUsedLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;

    public ResponseEntity getMostAndLeastUsedLine()
    {
        return integrationComponent.getMostAndLeastUsedTelephoneLineFromApi();
    }
}
