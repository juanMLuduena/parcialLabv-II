package com.utn.parcial.Service.Integration;

import com.utn.parcial.projections.MostAndLeastUsedLine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class IntegrationComponent {

    private RestTemplate rest;
    private static String url = "http://localhost:8082";

    @PostConstruct
    private void init()
    {
        rest = new RestTemplateBuilder()
                .build();
    }

    public ResponseEntity getMostAndLeastUsedTelephoneLineFromApi() throws RestClientException
    {
        try{
        return rest.getForEntity(url+"/telephoneLine/MostAndLeastUsed", String.class);
        }
        catch(RestClientException e){
            return ResponseEntity.badRequest().body(e.getMessage());
         }

    }
}
